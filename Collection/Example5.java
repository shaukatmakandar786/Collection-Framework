// Default sorting using Comparable with TreeMap
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Hashtable<Integer,String> t=new Hashtable<>();

        t.put(101,"shaukat");
        t.put(104,"azim");
        t.put(102,"wasim");
        t.put(105,"wajid");

        Set<Integer> k = t.keySet();

        Iterator<Integer> it = k.iterator();
        while(it.hasNext())
        {
            Integer p = it.next();
            System.out.println(t.get(p));
        }
    }
}

// wajid
// azim
// wasim
// shaukat
