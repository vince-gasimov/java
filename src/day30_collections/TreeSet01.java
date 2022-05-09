package day30_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*
    Differences between TreeSet and HashSet:
    if you need ot use unique elements in a nature order than use TreeSet.
        it will sort the element in ascending order
        HashSet is faster than TreeSet but TreeSet can also order the elements
     */

    public static void main(String[] args) {

        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(12);
        ts1.add(35);
        ts1.add(10);
        ts1.add(46);
        ts1.add(9);
        System.out.println(ts1); // [9, 10, 12, 35, 46]

        /*Interview question: how to store unique the elements in natural order
        I can use TreeSet
            But TreeSet is so slow, how can you make it faster
        I will first create a HashSet and add all elements to a HashSet
        Then I can convert them into a TreeSet and it will be faster
         */

        Long t1 = System.nanoTime();
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("K");
        ts2.add("Z");
        ts2.add("A");
        ts2.add("C");
        ts2.add("T");
        System.out.println(ts2); //[A, C, K, T, Z]

        Long t2 = System.nanoTime();

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("K");
        hs1.add("Z");
        hs1.add("A");
        hs1.add("C");
        hs1.add("T");
        System.out.println(hs1); //[A, C, T, Z, K]

        TreeSet <String> ts3 = new TreeSet<>(hs1); // adding hs1 to ts3
        System.out.println(ts3);

        Long t3 = System.nanoTime();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);


    }
}
