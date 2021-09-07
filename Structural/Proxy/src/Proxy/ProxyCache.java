package Proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements Internet {
    private Map<String,String> cache = new HashMap<>();
    private Internet databaseService = new DatabaseService();

    @Override
    public String get(String url) {
        if(cache.containsKey(url)){
            System.out.println("Get data from ProxyCache " + url);
            return cache.get(url);
        }

        cache.put(url,databaseService.get(url));
        return cache.get(url);
    }
}
