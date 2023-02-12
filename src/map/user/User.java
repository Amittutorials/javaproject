package map.user;

import java.util.HashMap;

public class User {

    public HashMap<String,Integer> getUserDetails()
    {

        HashMap<String,Integer> map =new HashMap<>();
        map.put("Amit",24);
        map.put("Suraj",23);
        map.put("Tejprakash",36);
        map.put("Arvind",31);
        map.put("Sanit",92);
        map.put("Muchad",28);
        map.put("Akash",64);
        map.put("Ansh",18);
        map.put("Rajan",21);
        map.put("Pankaj",22);

        return map;
    }
}
