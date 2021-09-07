package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static Map<String, TreeType> cache = new HashMap<>();

    public static TreeType provideTreeType(String name, String color, String canvas){
        String treeType = new String(name+"#"+color+"#"+canvas);
        if(!cache.containsKey(treeType)){
            cache.put(treeType,new TreeType(name,color,canvas));
        }
        return cache.get(treeType);
    }
}
