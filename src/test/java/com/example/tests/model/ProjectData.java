package com.example.tests.model;

public class ProjectData {

    private final String name;
    private final String description;
    private final String budget;
    private final String sector;

    public ProjectData(String name, String description, String budget, String sector) {

        this.name = name;
        this.description = description;
        this.budget = budget;
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getProjectBudget() {
        return budget;
    }

    public String getProjectSector() { return sector; }

}