package map.user;
import java.security.KeyStore;
import java.util.*;

import static java.util.Collections.sort;

public class Sorting {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Amit", 24);
        map.put("Suraj", 23);
        map.put("Tejprakash", 36);
        map.put("Arvind", 31);
        map.put("Sanit", 92);
        map.put("Muchad", 28);
        map.put("Akash", 64);
        map.put("Ansh", 18);
        map.put("Rajan", 21);
        map.put("Pankaj", 22);


        System.out.println("Original Map");

        map.forEach((k, v) -> System.out.println(k + "\t" + v));


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        //Set<Entry<String, Integer>> entrySet = map.entrySet();


        List<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);


        Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        {
            System.out.println("Map Sorted base value...");
            list.forEach(s -> {
                System.out.println(s.getKey() + "\t" + s.getValue());
            });

        }
    }
}