package scorponok.base.cache;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SimpleCacheClient {
	@Resource
	private CacheClient cacheClient;

	public String get(String key) {
		return cacheClient.simpleGet(key);
	}

	public void set(String key, String value, int exp) {
		cacheClient.simplePut(key, value, exp);
	}

	public void set(String key, String value) {
		cacheClient.simplePut(key, value, 700);
	}

	public void remove(String key) {
		cacheClient.innerRemove(key);
	}
}
