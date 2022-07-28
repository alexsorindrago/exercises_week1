package day4.collections.maps.demos.demo1.model;

import java.util.Objects;

public class Project {

    String name;
    int hours;

    public Project(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return hours == project.hours && Objects.equals(name, project.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hours);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}
