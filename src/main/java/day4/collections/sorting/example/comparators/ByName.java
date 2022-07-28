package day4.collections.sorting.example.comparators;

import day4.collections.sorting.example.model.Employee;

import java.util.Comparator;

public class ByName implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}
