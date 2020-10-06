package com.codeclan.example.employeeManager.models;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private long id;

    private String name;
    private int duration;
    private List<Employee> projectMembers;

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.projectMembers = new ArrayList<Employee>();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Employee> getProjectMembers() {
        return projectMembers;
    }

    public void setProjectMembers(List<Employee> projectMembers) {
        this.projectMembers = projectMembers;
    }

    public void addProjectMember(Employee member) {
        this.projectMembers.add(member);
    }
}
