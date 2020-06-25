package com.example.tests.model;

public class NewsData {

    private final String title;
    private final String description;
    private final String level;
    private final String region;
    private final String municipality;
    private final String date;
    private final String link_name;
    private final String link_address;
    private final String entity_type;
    private final String related_entity;


    public NewsData(String title, String description, String region, String level, String municipality, String date, String link_name, String link_address, String entity_type, String related_entity) {

        this.title = title;
        this.description = description;
        this.level = level;
        this.region = region;
        this.municipality = municipality;
        this.date = date;
        this.link_name = link_name;
        this.link_address = link_address;
        this.entity_type = entity_type;
        this.related_entity = related_entity;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLevel() {
        return level;
    }

    public String getRegion() { return region; }

    public  String getMunicipality() { return municipality; }

    public String getDate() { return date; }

    public String getLink_name() { return link_name; }

    public String getLink_address() { return link_address; }

    public String getEntity_type() { return entity_type; }

    public String getRelated_entity() { return related_entity; }

}