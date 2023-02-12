import java.util.*;
public class Hash
{
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(50);
        set.add(60);
            Iterator<Integer> i=set.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }

        }
    }
