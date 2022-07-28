package day4.collections.sorting.streamApi.javaStreams.employeeSalaryExercise.model;

public class EmployeeModel {
    public Long id;
    public String name;
    public Integer salary;
    public String project;

    public EmployeeModel(Long id, String name, Integer salary, String project) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary) && Objects.equals(project, employee.project);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, salary, project);
//    }

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
