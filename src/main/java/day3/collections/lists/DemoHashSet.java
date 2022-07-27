package day3.collections.lists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet {

    public static void main(String[] args) {
        Set list = new HashSet();

        list.add(15);
        list.add("hello");
        list.add(new Exception("Demo"));

        System.out.println(list);
//        System.out.println(list.get(2)); // does not apply same order ar LIST

        Object arr[] = list.toArray();

        int size = list.size();
        System.out.println(size);

        // iterate with for
        for (Object obj : list) {
            System.out.println(obj);
            System.out.println(obj.toString());
        }

        // iterate with ITERATOR
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj.toString());
        }
    }
}
