package lab8OOP;

import java.util.HashMap;
import java.util.Map;

public class Main8 {
    public static void main(String[] args) {

        Collection collection = new Collection();

        Map<String,String > stringMap = new HashMap<>();
        stringMap.put("Potato","Vegetables");
        stringMap.put("Banan","Vegetables");
        stringMap.put("Onion","Vegetables");

        System.out.println(stringMap.get("Potato"));
        System.out.println("--------------------");
        System.out.println(collection.printAll(stringMap));

    }
}
