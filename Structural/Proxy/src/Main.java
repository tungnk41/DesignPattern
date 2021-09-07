import Proxy.Internet;
import Proxy.ProxyFilter;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyFilter();

        System.out.println(internet.get("url_1"));   //Pass , Get from DB
        System.out.println();
        System.out.println(internet.get("url_10"));  //Banned
        System.out.println();
        System.out.println(internet.get("url_100")); //Pass, Get from DB
        System.out.println();
        System.out.println(internet.get("url_1000"));//Banned

        System.out.println("########################################################");

        System.out.println(internet.get("url_1"));   //Pass, Get from cache
        System.out.println();
        System.out.println(internet.get("url_10"));  //Banned
        System.out.println();
        System.out.println(internet.get("url_100")); //Pass, Get from cache
        System.out.println();
        System.out.println(internet.get("url_1000"));//Banned

    }
}
