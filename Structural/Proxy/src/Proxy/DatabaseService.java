package Proxy;

import java.util.HashMap;
import java.util.Map;

public class DatabaseService implements Internet{
    private Map<String,String> database = new HashMap<>();

    public DatabaseService(){
        database.put("url_1","html_1");
        database.put("url_10","html_10");
        database.put("url_100","html_100");
        database.put("url_1000","html_1000");
    }

    @Override
    public String get(String url) {
        if(!database.containsKey(url)){
            return "Url not found";
        }

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Get data from Database " + url);
        return database.get(url);
    }
}
