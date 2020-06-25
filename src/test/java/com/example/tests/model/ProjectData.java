package com.example.tests.model;

public class ProjectData {

    private final String name;
    private final String description;
    private final String sector;
    private final String date_start;
    private final String date_end;
    private final String budget;

    public ProjectData(String name, String description, String sector,  String date_start, String date_end, String budget) {

        this.name = name;
        this.description = description;
        this.sector = sector;
        this.date_start = date_start;
        this.date_end = date_end;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getProjectSector() { return sector; }

    public String getDate_start() { return date_start; }

    public String getDate_end() { return date_end; }

    public String getProjectBudget() {
        return budget;
    }



}