package day4.collections.sorting.example.comparators;

import day4.collections.sorting.example.model.Employee;

import java.util.Comparator;

public class ById implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.id - o2.id);
    }
}
