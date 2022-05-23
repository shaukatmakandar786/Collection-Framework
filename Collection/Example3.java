// custome sorting example using TreeMap with Comparator

import java.security.KeyStore;
import java.util.*;

class Book
{
    private int price;
    private String tittle;

    Book(int price,String tittle){
        this.price=price;
        this.tittle=tittle;
    }
    public String getTittle()
    {
        return this.tittle;
    }
    public int getPrice()
    {
        return this.price;
    }


}
class MyComparator implements Comparator<Book>{


    @Override
    public int compare(Book t1, Book t2) {

        if (t1.getPrice()<t2.getPrice())
            return -1;
        else
            return 1;
    }
}
class Main
{
    public static void main(String args[])
    {
        Book b1,b2,b3;

        b1=new Book(100,"Java");
        b2=new Book(90,"CPP");
        b3=new Book(300,"Python");

        TreeMap<Book,Integer> t=new TreeMap(new MyComparator());
        t.put(b1,1);
        t.put(b2,2);
        t.put(b3,3);

        for(Map.Entry<Book,Integer> entry:t.entrySet())
        {
            System.out.println(entry.getKey().getPrice()+" "+entry.getKey().getTittle()+" "+entry.getValue());
        }
    }
}


// 90 CPP 2
// 100 Java 1
// 300 Python 3
