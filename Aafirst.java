//Builder Pattern

import java.util.*;
import java.util.stream.*; /* Here why we are adding stream because java.util.* only provide the base calsses(utility classses and interfaces)
 and stream is sub class from one of those base classes.
*/
/*
 Java 8 introduced default and static methods on interfaces. So now you can have concrete implementations in your interface whether 
 using default or static methods. The reason Java claimed to add these two new kind of methods is 
 "ensure binary compatibility with code written for older versions of those interfaces"

 Lambda fuinction also introduced in java 8 
 */


public class Aafirst {
    public static void main(String... ak) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(4);
        al.add(10);
        al.add(3);
        al.add(10);
        al.add(5);

        Stream<Integer> str = al.stream();
        str = str.distinct().sorted(Collections.reverseOrder());
        str.forEach(x -> System.out.println(x));

        Stream<Integer> str1 = al.stream();
        str1.distinct().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));

        System.out.println(al);
    /*
    a Marker interface is an interface without any methods or fields declaration, means it is an empty interface. Similarly, 
    a Functional Interface is an interface with just one abstract method declared in it.
     */


    /*
    Source of the Comparator:
    --Collections.reverseOrder() is a static method in the Collections utility class. It returns a comparator that imposes the reverse of the 
      natural ordering on a collection of objects.
    --Comparator.reverseOrder() is a static method in the Comparator interface. It also returns a comparator that imposes the reverse of the 
      natural ordering.
    
    Applicability:
    --Collections.reverseOrder() is specifically designed for use with collections in the Collections framework. 
      It's more general and can be used with methods like Collections.sort() or Collections.binarySearch().
    --Comparator.reverseOrder() is a more general-purpose method that can be used with any method or class that accepts a Comparator as an 
      argument. This includes the sorted() method of streams.
    */


    }
}
