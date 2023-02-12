import java.util.*;
    public class Map1 {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
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
            for(Map.Entry<String,Integer> e : map.entrySet())
            {
                if (((e.getValue())>(35))) {
                    System.out.println(e.getKey() +"=>    "+e.getValue());

                }


            }
        }
    }


