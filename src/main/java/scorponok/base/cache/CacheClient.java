package scorponok.base.cache;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import scorponok.common.utils.JsonUtil;

import javax.annotation.PostConstruct;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Set;

@Component
public class CacheClient {
	@Value("${redis_host}")
	private String host = "r-bp1465975c35a084930.redis.rds.aliyuncs.com";// 控制台显示访问地址
	@Value("${redis_port}")
	private int port = 6379;
	@Value("${redis_password}")
	private String password = "Abcd1234";
	@Value("${redis_enable}")
	private boolean redisEnable = true;
	private JedisPool pool;
	protected static final Log logger = LogFactory.getLog(CacheClient.class);

	@PostConstruct
	public void init() {
		JedisPoolConfig config = new JedisPoolConfig();
		// 最大空闲连接数, 应用自己评估，不要超过ApsaraDB for Redis每个实例最大的连接数
		config.setMaxIdle(100);
		// 最大连接数, 应用自己评估，不要超过ApsaraDB for Redis每个实例最大的连接数
		config.setMaxTotal(300);
		config.setMaxWaitMillis(1000);
		config.setTestOnBorrow(true);
		config.setTestOnReturn(true);
		pool = new JedisPool(config, host, Integer.valueOf(port), 3000, password);
		try {
			pool.getResource();
			logger.info("redis pool init success" + pool);
		} catch (Exception e) {
			logger.info("redis get resource error", e);
		}

	}

	public void destory() {
		pool.close();
	}

	protected Jedis getResource() {
		return pool.getResource();
	}

	protected void returnResource(Jedis jedis) {
		jedis.close();
	}

	public <T> void innerPut(String key, T value) {
		innerPut(key, value, 1800);
	}

	public <T> void innerPut(String key, T value, int seconds) {
		if (redisEnable == false) {
			return;
		}
		if (value == null) {
			return;
		}
		byte[] data = stringToByte(JsonUtil.toJson(value));
		Jedis resource = getResource();
		try {
			byte[] keyBytes = key.getBytes();
			resource.set(keyBytes, data);
			resource.expire(keyBytes, seconds);
		} finally {
			resource.close();
		}
	}

	public String simpleGet(String key) {
		if (redisEnable == false) {
			return null;
		}
		String value = null;
		Jedis resource = getResource();
		try {
			byte[] data = resource.get(stringToByte(key));
			if (data == null) {
				return null;
			}
			value = byteToString(data);
		} finally {
			resource.close();
		}
		return value;
	}

	private String byteToString(byte[] data) {
		try {
			return new String(data, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	public void simplePut(String key, String value, int seconds) {
		if (redisEnable == false) {
			return;
		}
		if (value == null) {
			return;
		}

		byte[] data = stringToByte(value);
		Jedis resource = getResource();
		try {
			byte[] keyBytes = stringToByte(key);
			resource.set(keyBytes, data);
			resource.expire(keyBytes, seconds);
		} finally {
			resource.close();
		}
	}

	private byte[] stringToByte(String value) {
		try {
			return value.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	public <T> T innerGet(String key, Class<T> clazz) {
		if (redisEnable == false) {
			return null;
		}
		Jedis resource = getResource();
		try {
			byte[] data = resource.get(key.getBytes());
			if (data == null) {
				return null;
			}
			T value = JsonUtil.fromJson(byteToString(data), clazz);
			return value;
		} finally {
			resource.close();
		}
	}

	public void innerRemove(String key) {
		if (redisEnable == false) {
			return;
		}
		Jedis resource = getResource();
		resource.del(key.getBytes());
		resource.close();
	}

	public void batchDel(String pre_str) {
		Jedis resource = getResource();
		Set<String> set = resource.keys(pre_str + "*");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String keyStr = it.next();
			resource.del(keyStr);
		}
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRedisEnable(boolean redisEnable) {
		this.redisEnable = redisEnable;
	}

	public static void main(String[] args) {

	}
}
