package com.example.tests.model;

public class EntitledRoleData {

    private final String name;
    private final String description;
    private final String kod;
    private final String level;


    public EntitledRoleData(String name, String description, String kod, String level) {

        this.name = name;
        this.description = description;
        this.kod = kod;
        this.level = level;

    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public String getKod() { return kod; }

    public String getLevel() { return level; }

}
