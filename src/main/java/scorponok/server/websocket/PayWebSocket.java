package scorponok.server.websocket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

@ServerEndpoint(value = "/websocket/{param}")
@Component
public class PayWebSocket {
	protected final Log logger = LogFactory.getLog(getClass());
	// 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
	private static AtomicInteger onlineCount = new AtomicInteger(0);
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// concurrent包的线程安全Set，用来存放每个客户端对应的PayWebSocket对象。
	private static CopyOnWriteArraySet<PayWebSocket> webSocketSet = new CopyOnWriteArraySet<PayWebSocket>();

	// 与某个客户端的连接会话，需要通过它来给客户端发送数据
	private Session session;

	/**
	 * 连接建立成功调用的方法
	 *
	 * @throws IOException
	 */
	@OnOpen
	public void onOpen(Session session, @PathParam("param") String id) throws IOException {
		this.session = session;
		this.setId(id);
		webSocketSet.add(this); // 加入set中
		addOnlineCount(); // 在线数加1
		logger.info("有新连接加入！当前在线人数为" + getOnlineCount());
		sendinfoById(id, "socket start");

	}

	/**
	 * 连接关闭调用的方法
	 */
	@OnClose
	public void onClose() {
		webSocketSet.remove(this); // 从set中删除
		subOnlineCount(); // 在线数减1
		logger.info("有一连接关闭！当前在线人数为" + getOnlineCount());
	}

	/**
	 * 收到客户端消息后调用的方法
	 *
	 * @param message 客户端发送过来的消息
	 */
	@OnMessage
	public void onMessage(String message, Session session) {
		// System.out.println("来自客户端的消息:" + message);
		//
		// //群发消息
		// for (PayWebSocket item : webSocketSet) {
		// try {
		// item.sendMessage(message);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
	}

	@OnError
	public void onError(Session session, Throwable error) {
		logger.error(error);
	}

	public void sendMessage(String message) throws IOException {
		this.session.getBasicRemote().sendText(message);
		// this.session.getAsyncRemote().sendText(message);
	}

	/**
	 * 群发自定义消息
	 */
	public static void sendInfo(String message) throws IOException {
		for (PayWebSocket item : webSocketSet) {
			try {
				item.sendMessage(message);
			} catch (IOException e) {
				continue;
			}
		}
	}

	/*
	 * 单独发送
	 */
	public static void sendinfoById(String id, String message) {
		for (PayWebSocket user : webSocketSet) {
			if (user.getId().equals(id)) {
				try {
					user.sendMessage(message);
				} catch (IOException e) {
					continue;
				}
			}
		}
	}

	public static synchronized int getOnlineCount() {
		return onlineCount.intValue();
	}

	public static synchronized void addOnlineCount() {
		PayWebSocket.onlineCount.incrementAndGet();
	}

	public static synchronized void subOnlineCount() {
		PayWebSocket.onlineCount.getAndDecrement();
	}
}
