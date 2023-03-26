package org.example.dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class DAOUsageExample {
    public static void main(String [] args){

        ProjectService projectService = new ProjectService(new ProjectDAODB());

        int randId = (new Random()).nextInt(99); //0-99
        Project project = new Project("Project #1" + randId, new Date());
        projectService.persist(project);

        List<Project> projects = projectService.findAll();
        projects.stream().forEach(p-> System.out.println(p));
    }
}
