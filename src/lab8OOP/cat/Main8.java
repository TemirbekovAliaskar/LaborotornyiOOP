package lab8OOP.cat;

import java.util.HashMap;
import java.util.Map;

public class Main8 {

    public static void main(String[] args) {


        Map<String, Cat> catMap = new HashMap<>();

        catMap.put("Кот1", new Cat("Барсик"));
        catMap.put("Кот2", new Cat("Мурзик"));
        catMap.put("Кот3", new Cat("Рыжик"));
        catMap.put("Кот4", new Cat("Том"));
        catMap.put("Кот5", new Cat("Васька"));
        catMap.put("Кот6", new Cat("Леопольд"));
        catMap.put("Кот7", new Cat("Гарфилд"));
        catMap.put("Кот8", new Cat("Чеширский"));
        catMap.put("Кот9", new Cat("Симба"));
        catMap.put("Кот10", new Cat("Шерхан"));

        for (Map.Entry<String,Cat> stringCatEntry : catMap.entrySet()){
            System.out.println("Key : " + stringCatEntry.getKey() + " - Значение :" + stringCatEntry.getValue());
        }




    }
}
