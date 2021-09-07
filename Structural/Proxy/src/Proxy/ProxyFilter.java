package Proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyFilter implements Internet {
    private Set<String> listBannedUrl = new HashSet<>();
    Internet proxyCache = new ProxyCache();

    public ProxyFilter(){
        listBannedUrl.add("url_10");
        listBannedUrl.add("url_1000");
    }



    @Override
    public String get(String url) {
        if(listBannedUrl.contains(url)){
            return "Url banned : " + url;
        }
        System.out.println("Request : " + url + " Pass");

        return proxyCache.get(url);
    }
}
