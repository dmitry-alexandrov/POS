package com.example.tests.model;

import java.io.File;

public class LocalPollData {
    private final String title;
    private final String description;
    private final String region;
    private final String municipality;
    private final String date_start;
    private final String date_end;
    private final String show_statistics;
    private final String attachment_name;
    private final String attachment_description;
    private final File attachment_document;
    private final String question_type;
    private final String question_text;
    private final String answer_quantity;
    private final String answer_option;

    public LocalPollData(String title, String description, String region, String municipality, String date_start, String date_end, String show_statistics, String attachment_name, String attachment_description, File attachment_document, String question_type, String question_text, String answer_quantity, String answer_option) {
        this.title = title;
        this.description = description;
        this.region = region;
        this.municipality = municipality;
        this.date_start = date_start;
        this.date_end = date_end;
        this.show_statistics = show_statistics;
        this.attachment_name = attachment_name;
        this.attachment_description = attachment_description;
        this.attachment_document = attachment_document;
        this.question_type = question_type;
        this.question_text = question_text;
        this.answer_quantity = answer_quantity;
        this.answer_option = answer_option;

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

    public String getShow_statistics() { return  show_statistics; }

    public String getQuestion_type() {
        return question_type;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public String getAnswer_quantity() {
        return answer_quantity;
    }

    public String getAnswer_option() {
        return answer_option;
    }

    public String getAttachment_name() { return attachment_name; }

    public String getAttachment_description() {
        return attachment_description;
    }

    public File getAttachment() {
        return attachment_document;
    }

}
