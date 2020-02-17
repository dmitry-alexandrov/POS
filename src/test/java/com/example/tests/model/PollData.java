package com.example.tests.model;

public class PollData {
    private final String name;
    private final String description;
    private final String question_1;
    private final String answer_quantity_1;
    private final String answer_option_1_1;
    private final String answer_option_1_2;
    private final String answer_option_1_3;
    private final String question_2;
    private final String answer_quantity_2;
    private final String answer_option_2_1;
    private final String answer_option_2_2;
    private final String answer_option_2_3;
    private final String answer_option_2_4;

    public PollData(String name, String description, String question_1, String answer_quantity_1, String answer_option_1_1, String answer_option_1_2, String answer_option_1_3, String question_2, String answer_quantity_2, String answer_option_2_1, String answer_option_2_2, String answer_option_2_3, String answer_option_2_4) {
        this.name = name;
        this.description = description;
        this.question_1 = question_1;
        this.answer_quantity_1 = answer_quantity_1;
        this.answer_option_1_1 = answer_option_1_1;
        this.answer_option_1_2 = answer_option_1_2;
        this.answer_option_1_3 = answer_option_1_3;
        this.question_2 = question_2;
        this.answer_quantity_2 = answer_quantity_2;
        this.answer_option_2_1 = answer_option_2_1;
        this.answer_option_2_2 = answer_option_2_2;
        this.answer_option_2_3 = answer_option_2_3;
        this.answer_option_2_4 = answer_option_2_4;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getQuestion_1() {
        return question_1;
    }

    public String getAnswer_quantity_1() {
        return answer_quantity_1;
    }

    public String getAnswer_option_1_1() {
        return answer_option_1_1;
    }

    public String getAnswer_option_1_2() {
        return answer_option_1_2;
    }

    public String getAnswer_option_1_3() {
        return answer_option_1_3;
    }

    public String getQuestion_2() {
        return question_2;
    }

    public String getAnswer_quantity_2() {
        return answer_quantity_2;
    }

    public String getAnswer_option_2_1() {
        return answer_option_2_1;
    }

    public String getAnswer_option_2_2() {
        return answer_option_2_2;
    }

    public String getAnswer_option_2_3() {
        return answer_option_2_3;
    }

    public String getAnswer_option_2_4() {
        return answer_option_2_4;
    }
}
