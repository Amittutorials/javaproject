package map.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        User u = new User();
        HashMap<String, Integer> ab = u.getUserDetails();


            for (Map.Entry<String, Integer> e : ab.entrySet()) {


                System.out.println(e.getKey() + " " + e.getValue());

            }


        }
        }
