package com.example.tests.model;

public class NewsData {

    private final String title;
    private final String description;
    //private final String level;
    private final String region;
    private final String municipality;

    public NewsData(String title, String description, String region, String municipality) {

        this.title = title;
        this.description = description;
        //this.level = level;
        this.region = region;
        this.municipality = municipality;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    //public String getLevel() {
     //   return level;
    //}

    public String getRegion() { return region; }

    public  String getMunicipality() { return municipality; }

}