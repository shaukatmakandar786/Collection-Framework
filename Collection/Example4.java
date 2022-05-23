// Default sorting using Comparable with TreeMap
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(102,"shaukat");
        t.put(104,"waim");
        t.put(101,"zakir");
        t.put(105,"wajid");
        
        System.out.println(t);
        
    }
}

// {101=zakir, 102=shaukat, 104=waim, 105=wajid}
