package day4.collections.sorting.example.model;

import java.util.Objects;

public class Employee {

    public Long id;
    public String name;
    public Integer salary;
    public String project;

    public Employee(Long id, String name, Integer salary, String project) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.project = project;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary) && Objects.equals(project, employee.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, project);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", project='" + project + '\'' +
                '}';
    }
}
