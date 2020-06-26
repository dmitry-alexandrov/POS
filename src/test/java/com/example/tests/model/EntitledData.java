package com.example.tests.model;

public class EntitledData {

    private final String name;
    private final String fio;
    private final String email;
    private final String status;
    private final String password;
    private final String snils;
    private final String organization;


    public EntitledData(String name, String fio, String email, String status, String password, String snils, String organization) {

        this.name = name;
        this.fio = fio;
        this.email = email;
        this.status = status;
        this.password = password;
        this.snils = snils;
        this.organization = organization;

    }

    public String getName() { return name; }

    public String getFio() { return fio; }

    public String getEmail() { return email; }

    public String getStatus() { return status; }

    public String getPassword() { return password; }

    public String getSnils() { return snils; }

    public String getOrganization() { return organization; }



}
