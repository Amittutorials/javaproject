import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorted
{
 public static void main(String [] args)
 {

     List<Integer> list=new ArrayList<Integer>();
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(10);
     list.add(20);
     list.add(40);
     list.add(50);
     list.add(60);

     Collections.sort(list);

     for(int i=0;i<list.size();i++)
     {
         System.out.println(list.get(i));
     }
 }


}

