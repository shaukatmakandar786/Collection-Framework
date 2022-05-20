# Generic :

Java generic methods and generic classes enable programmers to specify, with a single method declaration,  
a set of related methods or, with a single classes declaration, as set of related types.

## Generic method:

1. We can write a single generic method declaration that can be called with arguments of different types.
2. All generic method declaration have a type parameter section delimited by angle brackets (<>) that precedes the method return type.
3. Each type parameter section contain 1 or more parameters seprated by commas.
4. The type parameter can be used to declare the return type.

### important rule :

type parameter can be represents of reference types, not primitive types(like int, double, char). 

            // in this situation we have same function logic but we have different parameters so we are creating here two functions
            //so we can solve this problem by using generic methods

            public class Main{

                public void printArrays(String s[])
                {
                    for (int i=0;i<s.length;i++)
                    {
                        System.out.println(s[i]);
                    }
                }
                public void printArrays(Integer s[])
                {
                    for (int i=0;i<s.length;i++)
                    {
                        System.out.println(s[i]);
                    }
                }
                public static void main(String[] args) {

                    Main m1=new Main();
                    String s1[]={"india","pakistan","chaina"};
                    m1.printArrays(s1);
                    Integer i1[]={10,20,30};
                    m1.printArrays(i1);
                }
            }
            
            
            india
            pakistan
            chaina
            10
            20
            30
### same program using generic method:

                        // in this situation we have same function logic but we have different parameters so we are creating here Only 1 generic method
                        // at this situation we don't need to overload too many method if we have same logic but argument is different

                        public class Main{
                            public <E> void printArrays(E s[])
                            {
                                for (E p:s) {
                                    System.out.println(p);
                                }
                            }
                            public static void main(String[] args) {

                                Main m1=new Main();
                                String s1[]={"india","pakistan","chaina"};
                                m1.printArrays(s1);
                                Integer i1[]={10,20,30};
                                m1.printArrays(i1);
                            }
                        }
