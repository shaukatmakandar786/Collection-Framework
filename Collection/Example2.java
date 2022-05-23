// Custom sorting example with Comparator using TreeSet

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

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
class MyComparator implements Comparator{


    @Override
    public int compare(Object o, Object t1) {

        Book b1=(Book)o;
        Book b2=(Book)t1;

        if(b1.getPrice()<b2.getPrice())
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

        TreeSet<Book> t=new TreeSet<>(new MyComparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);

        Book b;
        Iterator it = t.iterator();
        while (it.hasNext())
        {
            b=(Book) it.next();
            System.out.println(b.getPrice()+"   "+b.getTittle());
        }
    }
}

// 90   CPP
// 100   Java
// 300   Python
