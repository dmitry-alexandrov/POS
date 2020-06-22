package com.example.tests.model;

public class ContestData {

    private final String name;
    private final String level;
    private final String region;
    private final String municipality;
    private final String date_start;
    private final String date_end;
    private final String choices_amount;
    private final String winners_amount;
    private final String sector;


    public ContestData(String name, String level, String region, String municipality, String date_start, String date_end, String choices_amount, String winners_amount, String sector) {

        this.name = name;
        this.level = level;
        this.region = region;
        this.municipality = municipality;
        this.date_start = date_start;
        this.date_end = date_end;
        this.choices_amount = choices_amount;
        this.winners_amount = winners_amount;
        this.sector = sector;


    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getRegion() {
        return region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getDate_start() { return date_start; }

    public String getDate_end() { return date_end; }

    public String getChoicesAmount() { return choices_amount; }

    public String getWinnersAmount() {
        return winners_amount;
    }

    public String getSector() {
        return sector;
    }

}


