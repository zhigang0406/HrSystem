package scorponok.common.utils;

import okhttp3.*;
import okhttp3.OkHttpClient.Builder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

@Service
public class HttpClient {
	private OkHttpClient client;
	private int timeout;
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

	public HttpClient() {
		this.timeout = 30;
		initHttpClient();
	}

	private void initHttpClient() {
		Builder builder = new Builder();
		builder.connectTimeout(timeout, TimeUnit.SECONDS).readTimeout(timeout, TimeUnit.SECONDS);
		ConnectionPool connectionPool = new ConnectionPool(1, 1000, TimeUnit.MICROSECONDS);
		builder.connectionPool(connectionPool);
		client = builder.build();
	}

	public String doGet(String url) throws IOException {
		return doGet(url, null);
	}

	public String doGet(String url, String charset, String ip) throws IOException {
		Request request = new Request.Builder().get().url(url).header("x-forwarded-for", ip).build();
		Response response = client.newCall(request).execute();
		byte[] bytes = response.body().bytes();
		if (charset != null) {
			return new String(bytes, charset);
		} else {
			return new String(bytes);
		}
	}

	public String doPost(String url, FormBody.Builder builder) throws IOException {
		return doPost(url, builder, null);
	}

	public String doPost(String url, FormBody.Builder builder, String charset) throws IOException {
		RequestBody formBody = builder.build();
		Request request = new Request.Builder().url(url).post(formBody).build();
		Response response = client.newCall(request).execute();
		byte[] bytes = response.body().bytes();
		if (charset != null) {
			return new String(bytes, charset);
		} else {
			return new String(bytes);
		}

	}

	public String postJson(String json, String url) {
		// 申明给服务端传递一个json串
		// 创建一个OkHttpClient对象
		OkHttpClient okHttpClient = new OkHttpClient();
		// 创建一个RequestBody(参数1：数据类型 参数2传递的json串)
		RequestBody requestBody = RequestBody.create(JSON, json);
		// 创建一个请求对象
		Request request = new Request.Builder().url(url).post(requestBody).build();
		// 发送请求获取响应
		try {
			Response response = okHttpClient.newCall(request).execute();
			// 判断请求是否成功
			if (response.isSuccessful()) {
				return response.body().string();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public String doGet(String url, String charset) throws IOException {
		Request request = new Request.Builder().get().url(url).build();
		Response response = client.newCall(request).execute();
		byte[] bytes = response.body().bytes();
		if (charset != null) {
			return new String(bytes, charset);
		} else {
			return new String(bytes);
		}
	}

	public InputStream doget(String url) throws IOException {
		Request request = new Request.Builder().get().url(url).build();
		try {
			Response response = client.newCall(request).execute();
			// 判断请求是否成功
			if (response.isSuccessful()) {
				return response.body().byteStream();
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public InputStream dopost(String json, String url) {
		// 申明给服务端传递一个json串
		// 创建一个OkHttpClient对象
		OkHttpClient okHttpClient = new OkHttpClient();
		// 创建一个RequestBody(参数1：数据类型 参数2传递的json串)
		RequestBody requestBody = RequestBody.create(JSON, json);
		// 创建一个请求对象
		Request request = new Request.Builder().url(url).post(requestBody).build();
		// 发送请求获取响应
		try {
			Response response = okHttpClient.newCall(request).execute();
			// 判断请求是否成功
			if (response.isSuccessful()) {
				return response.body().byteStream();
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
}
