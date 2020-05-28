package com.example.tests.model;

public class PollData {
    private final String name;
    private final String description;
    private final String question_1;
    private final String answer_quantity_1;
    private final String answer_option_1_1;
    private final String answer_option_1_2;
    private final String answer_option_1_3;


    public PollData(String name, String description, String question_1, String answer_quantity_1, String answer_option_1_1, String answer_option_1_2, String answer_option_1_3) {
        this.name = name;
        this.description = description;
        this.question_1 = question_1;
        this.answer_quantity_1 = answer_quantity_1;
        this.answer_option_1_1 = answer_option_1_1;
        this.answer_option_1_2 = answer_option_1_2;
        this.answer_option_1_3 = answer_option_1_3;

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


}
