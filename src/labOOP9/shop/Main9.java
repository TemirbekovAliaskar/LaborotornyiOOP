package labOOP9.shop;

import java.math.BigDecimal;
import java.util.*;

public class Main9 {
    public static void main(String[] args) {

        ArrayList<Shop> arrayList = new ArrayList<>(Arrays.asList(
                new Shop("Kali",new BigDecimal(900),9),
                new Shop("LI",new BigDecimal(640),7),
                new Shop("Aku",new BigDecimal(440),10),
                new Shop("Sadi",new BigDecimal(300),5)
        ));

        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("-------------");
        Collections.sort(arrayList, Comparator.comparing(Shop :: getBigDecimal));
        System.out.println(arrayList);
        System.out.println("-------------");
        Collections.sort(arrayList,Comparator.comparing(Shop :: getRating));
        System.out.println("++++++++"+arrayList);
        System.out.println("-------------");
        Collections.sort(arrayList,Comparator.comparing(Shop::getBigDecimal).reversed());
        System.out.println("arrayList --- " + arrayList);


    }
}
