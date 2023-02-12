import java.sql.Array;
import java.util.*;
public class Test3
{
    public static void main(String[] args)
    {
        ArrayList();
    }
    public static void ArrayList()
    {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }


    }
