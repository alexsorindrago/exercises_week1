package day3.collections.exercise1.employee_app.service;

import day3.collections.exercise1.employee_app.model.Project;
import day3.collections.exercise1.employee_app.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

public class ProjectService implements ProjectRepository {

    private final List projectsList;

    public ProjectService() {
        this.projectsList = new ArrayList();
    }

    @Override
    public void create(Project project) {
        projectsList.add(project);
        System.out.println("project " + project + " was created");
    }

}
