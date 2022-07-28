package day4.collections.sorting.example;

import day4.collections.sorting.example.model.Employee;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSortExample {

    public static void main(String[] args) {
        Employee e1 = new Employee(2L, "jack", 100, "pirates");
        Employee e2 = new Employee(1L, "sparrow", 200, "alfa pirates");

        TreeSet<Employee> set = new TreeSet<>();

        set.add(e1);
        set.add(e2);

        // WILL NOT WORK UNLESS EMPLOYEE IS ALREADY PART OF COMPARABLE
        // WILL GET CLASS CAST EXCEPTION
        System.out.println(set);

        Iterator<Employee> itr = set.descendingIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
