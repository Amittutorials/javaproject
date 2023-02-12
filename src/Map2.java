import java.nio.file.attribute.UserPrincipal;
import java.util.HashMap;
import java.util.Map;

 class Map3
{
    public HashMap<String,Integer>  getUserDetails()
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


  public   class Map2
    {

        public static void main(String []args)
        {
            Map3 u = new Map3();
           HashMap<String,Integer> ab = u.getUserDetails();
            for (Map.Entry<String,Integer> e : ab.entrySet())
            {

                System.out.println(e.getKey());

            }

        }
    }
}

