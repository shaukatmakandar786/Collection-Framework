//Comparable default sorting example with TreeSet

import java.util.*;
class Main {
    public static void main(String args[]) {

        TreeSet<Integer> t1=new TreeSet();
        t1.add(20);
        t1.add(30);
        t1.add(10);
        t1.add(25);
        System.out.println(t1);
    }
}

// [10, 20, 25, 30]
