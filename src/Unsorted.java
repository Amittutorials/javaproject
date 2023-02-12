import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;

public class Unsorted
{
    public static void main(String []args)
    {
    ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(list);
        ArrayList<Integer> numberlistwithoutduplicates =new ArrayList<Integer>(linkedHashSet);
        System.out.println(numberlistwithoutduplicates);


    }
}






