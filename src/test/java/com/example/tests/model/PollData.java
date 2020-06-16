package com.example.tests.model;

public class PollData {
    private final String name;
    private final String description;
    private final String level;
    private final String national_project;
    private final String date_start;
    private final String date_end;
    private final String show_statistics;
    private final String question_type;
    private final String question_text;
    private final String answer_quantity;
    private final String answer_value;
    private final String answer_option;

    public PollData(String name, String description, String level, String national_project, String date_start, String date_end, String show_statistics, String question_type, String question_text, String answer_quantity, String answer_value, String answer_option) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.national_project = national_project;
        this.date_start = date_start;
        this.date_end = date_end;
        this.show_statistics = show_statistics;
        this.question_type = question_type;
        this.question_text = question_text;
        this.answer_quantity = answer_quantity;
        this.answer_value = answer_value;
        this.answer_option = answer_option;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLevel() { return level; }

    public String getNational_project() { return national_project; }

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

    public String getAnswer_value() {
        return answer_value;
    }

    public String getAnswer_option() {
        return answer_option;
    }

}
