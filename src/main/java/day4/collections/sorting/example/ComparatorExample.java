package day4.collections.sorting.example;

import day4.collections.sorting.example.comparators.ById;
import day4.collections.sorting.example.comparators.ByName;
import day4.collections.sorting.example.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComparatorExample {

    public static void main(String[] args) {

        Set<Employee> employeeSet = new HashSet<>();

        Employee e1 = new Employee(1L, "jack", 100, "pirates");
        Employee e2 = new Employee(2L, "sparrow", 200, "alfa pirates");
        Employee e3 = new Employee(4L, "frodo", 150, "rings");
        Employee e4 = new Employee(3L, "baggins", 99, "lords");

        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);

        List<Employee> list = new ArrayList<>();
        list.addAll(employeeSet);
        System.out.println(list);

        System.out.println("\n------------------------\n");

        Collections.sort(list, new ById());
        System.out.println(list);

        Collections.sort(list, new ByName());
        System.out.println(list);

    }


}
