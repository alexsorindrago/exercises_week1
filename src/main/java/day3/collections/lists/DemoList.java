package day3.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(15);
        list.add("hello");
        list.add(new Exception("Demo"));

        System.out.println(list);
        System.out.println(list.get(2));

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
