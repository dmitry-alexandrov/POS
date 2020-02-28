package com.example.tests.model;

import java.io.File;

public class LocalValueData {
    private final String title;
    private final String description;
    private final String region;
    private final String municipality;
    private final String attachment_name_1;
    private final String attachment_description_1;
    private final File attachment_document_1;
    private final String question_1;
    private final String question_option_1;

    public LocalValueData(String title, String description, String region, String municipality, String attachment_name_1, String attachment_description_1, File attachment_document_1, String question_1, String question_option_1) {
        this.title = title;
        this.description = description;
        this.region = region;
        this.municipality = municipality;
        this.attachment_name_1 = attachment_name_1;
        this.attachment_description_1 = attachment_description_1;
        this.attachment_document_1 = attachment_document_1;
        this.question_1 = question_1;
        this.question_option_1 = question_option_1;

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

    public String getAttachment_name() { return attachment_name_1; }

    public String getAttachment_description_1() {
        return attachment_description_1;
    }

    public File getAttachment_1() {
        return attachment_document_1;
    }

    public String getQuestion_1() {
        return question_1;
    }

    public String getQuestion_option_1() {
        return question_option_1;
    }

}
