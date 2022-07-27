package day3.collections.exercise1.employee_app.model;

public class Project {
    private String projectName;

    public Project() {

    }

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                '}';
    }
}
