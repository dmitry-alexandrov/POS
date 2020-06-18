package com.example.tests.model;

import java.io.File;

public class LocalDiscussionData {
    private final String title;
    private final String description;
    private final String region;
    private final String municipality;
    private final String date_start;
    private final String date_end;
    private final String attachment_name;
    private final String attachment_description;
    private final File attachment_document;


    public LocalDiscussionData(String title, String description, String region, String municipality, String date_start, String date_end, String attachment_name, String attachment_description, File attachment_document) {
        this.title = title;
        this.description = description;
        this.region = region;
        this.municipality = municipality;
        this.date_start = date_start;
        this.date_end = date_end;
        this.attachment_name = attachment_name;
        this.attachment_description = attachment_description;
        this.attachment_document = attachment_document;


    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRegion() {
        return region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getDate_start() { return date_start; }

    public String getDate_end() { return date_end; }

    public String getAttachment_name() { return attachment_name; }

    public String getAttachment_description() {
        return attachment_description;
    }

    public File getAttachment_document() {
        return attachment_document;
    }

}
