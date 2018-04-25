package scorponok.base.cache;

import javax.annotation.Resource;

public abstract class CacheManager<T> {


    @Resource
    protected CacheClient cacheClient;

    protected abstract String getKey(T value);

    protected abstract String getKey(String id);

    protected abstract Class<T> getDTOClass();

    public void put(T value) {
        String key = getKey(value);
        cacheClient.innerPut(key, value);
    }

    public T get(String key) {
        try {
            key = getKey(key);
            T value = cacheClient.innerGet(key, getDTOClass());
            return value;
        } catch (Exception e) {
            return null;
        }
    }

    public void remove(String key) {
        key = getKey(key);
        cacheClient.innerRemove(key);
    }

}
