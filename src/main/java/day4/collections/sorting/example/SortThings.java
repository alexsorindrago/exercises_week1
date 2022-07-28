package day4.collections.sorting.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortThings {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(28);
        list.add(55);
        list.add(15);

        System.out.println(list);

        //method compatible ONLY with list
        Collections.sort(list);
        System.out.println(list);

        List<String> set = new ArrayList<>();
        set.add("aaaaa");
        set.add("ddddd");
        set.add("ccccc");
        set.add("bbbbb");
        System.out.println(set);
        //works with strings as well
        Collections.sort(set);
        System.out.println(set);

    }
}
