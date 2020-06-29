package com.example.tests.appmanager;


import com.example.tests.model.LocalPollData;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.regex.Matcher;

import static org.testng.Assert.assertTrue;


public class LocalPollHelper extends HelperBase {

    public boolean acceptNextAlert = true;

    public LocalPollHelper(WebDriver driver) {
        super(driver);
    }

    public void submitLocalPollCreation() throws InterruptedException {
            click(By.xpath("//*[@id=\"dynamic-form\"]/div[13]/button"));
        Thread.sleep(2000);
    }

    public void fillMinimumLocalPollForm(LocalPollData localPollData) throws InterruptedException {
        type(By.id("poll-title"), localPollData.getTitle());
        type(By.id("poll-description"), localPollData.getDescription());
        select_2(By.id("select2-poll-region_id-container"), By.xpath("//input[@type='search']"), localPollData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-poll-municipality_id-container"), By.xpath("//input[@type='search']"), localPollData.getMunicipality());
        type(By.id("poll-form_date_from"), localPollData.getDate_start());
        type(By.id("poll-form_date_to"), localPollData.getDate_end());
        select(By.id("poll-is_show_statistics"), localPollData.getShow_statistics());
        type(By.id("attachment-0-title"), localPollData.getAttachment_name());
        type(By.id("attachment-0-description"), localPollData.getAttachment_description());
        attach(By.id("attachment-0-file"), localPollData.getAttachment());
        select(By.id("pollquestion-0-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-0-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-0-choice_amount"), localPollData.getAnswer_quantity());
        type(By.id("pollquestionoption-0-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-1-value"), localPollData.getAnswer_option());

    }

    public void fillMaximumLocalPollForm(LocalPollData localPollData) throws InterruptedException {
        type(By.id("poll-title"), localPollData.getTitle());
        type(By.id("poll-description"), localPollData.getDescription());
        select_2(By.id("select2-poll-region_id-container"), By.xpath("//input[@type='search']"), localPollData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-poll-municipality_id-container"), By.xpath("//input[@type='search']"), localPollData.getMunicipality());
        type(By.id("poll-form_date_from"), localPollData.getDate_start());
        type(By.id("poll-form_date_to"), localPollData.getDate_end());
        select(By.id("poll-is_show_statistics"), localPollData.getShow_statistics());
        type(By.id("attachment-0-title"), localPollData.getAttachment_name());
        type(By.id("attachment-0-description"), localPollData.getAttachment_description());
        attach(By.id("attachment-0-file"), localPollData.getAttachment());
        select(By.id("pollquestion-0-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-0-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-0-choice_amount"), localPollData.getAnswer_quantity());

        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div > div > div > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div > div > div > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div > div > div > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div > div > div > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div > div > div > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div > div > div > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div > div > div > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div > div > div > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-0-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-1-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-1-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-1-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div.panel.panel-default.poll-question-item > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div.panel.panel-default.poll-question-item > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div.panel.panel-default.poll-question-item > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div.panel.panel-default.poll-question-item > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div.panel.panel-default.poll-question-item > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div.panel.panel-default.poll-question-item > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div.panel.panel-default.poll-question-item > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div.panel.panel-default.poll-question-item > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));

        type(By.id("pollquestionoption-1-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-1-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-2-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-2-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-2-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(3) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(3) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(3) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(3) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(3) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(3) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(3) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(3) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-2-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-2-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-3-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-3-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-3-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(4) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(4) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(4) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(4) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(4) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(4) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(4) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(4) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-3-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-3-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-4-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-4-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-4-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(5) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(5) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(5) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(5) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(5) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(5) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(5) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(5) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-4-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-4-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-5-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-5-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-5-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(6) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(6) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(6) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(6) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(6) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(6) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(6) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(6) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-5-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-5-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-6-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-6-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-6-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(7) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(7) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(7) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(7) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(7) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(7) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(7) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(7) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-6-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-6-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-7-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-7-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-7-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(8) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(8) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(8) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(8) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(8) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(8) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(8) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(8) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-7-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-7-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-8-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-8-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-8-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(9) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(9) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(9) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(9) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(9) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(9) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(9) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(9) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-8-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-8-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-9-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-9-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-9-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(10) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(10) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(10) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(10) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(10) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(10) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(10) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(10) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-9-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-9-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-10-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-10-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-10-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(11) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(11) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(11) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(11) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(11) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(11) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(11) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(11) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-10-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-10-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-11-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-11-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-11-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(12) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(12) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(12) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(12) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(12) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(12) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(12) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(12) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-11-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-11-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-12-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-12-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-12-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(13) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(13) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(13) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(13) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(13) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(13) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(13) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(13) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-12-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-12-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-13-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-13-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-13-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(14) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(14) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(14) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(14) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(14) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(14) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(14) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(14) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-13-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-13-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-14-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-14-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-14-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(15) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(15) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(15) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(15) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(15) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(15) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(15) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(15) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-14-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-14-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-15-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-15-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-15-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(16) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(16) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(16) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(16) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(16) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(16) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(16) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(16) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-15-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-15-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-16-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-16-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-16-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(17) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(17) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(17) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(17) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(17) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(17) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(17) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(17) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-16-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-16-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-17-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-17-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-17-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(18) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(18) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(18) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(18) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(18) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(18) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(18) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(18) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-17-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-17-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-18-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-18-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-18-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(19) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(19) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(19) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(19) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(19) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(19) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(19) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(19) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-18-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-18-9-value"), localPollData.getAnswer_option());

        addQuestion(By.id("add_question_proxy"));
        select(By.id("pollquestion-19-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-19-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-19-choice_amount"), localPollData.getAnswer_quantity());
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(20) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(20) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(20) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(20) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(20) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(20) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(20) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        addAnswer(By.cssSelector("#dynamic-form > div.dynamicform_wrapper_poll_question > div.container-items-poll-question > div:nth-child(20) > div.panel-body > div.question_answers > div.dynamicform_inner > div > div.panel-heading > button > span"));
        type(By.id("pollquestionoption-19-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-1-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-2-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-3-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-4-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-5-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-6-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-7-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-8-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-19-9-value"), localPollData.getAnswer_option());



    }


    public void initLocalPollCreation() {
        click(By.linkText("Создать обсуждение (опрос)"));
    }

    public void selectLocalPollDelete() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовое обсуждение (опрос) для удаления")).size() != 0) {

                click(By.linkText("Тестовое обсуждение (опрос) для удаления"));

                break;

            } else {

                try {

                    click(By.linkText("»"));

                } catch (NoSuchElementException ex) {

                    Assert.fail("NoSuchElementException", ex);

                }

            }

        }

    }

    public void selectLocalPollPublish() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовое обсуждение (опрос) для публикации")).size() != 0) {

                click(By.linkText("Тестовое обсуждение (опрос) для публикации"));

                break;

            } else {

                try {

                    click(By.linkText("»"));

                } catch (NoSuchElementException ex) {

                    Assert.fail("NoSuchElementException", ex);

                }

            }

        }

    }

    public void selectLocalPollModify() {
        while (true) {

            if(driver.findElements(By.linkText("Тестовое обсуждение (опрос) для редактирования")).size() != 0) {

                click(By.linkText("Тестовое обсуждение (опрос) для редактирования"));

                break;

            } else {

                try {

                    click(By.linkText("»"));

                } catch (NoSuchElementException ex) {

                    Assert.fail("NoSuchElementException", ex);

                }

            }

        }
    }

    public void deleteLocalPoll() {
        click(By.linkText("Удалить"));
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить этот элемент[\\s\\S]$"));
    }

    private String closeAlertAndGetItsText() {

        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }

    }

    public void initLocalPollModification() {
        click(By.linkText("Редактировать"));
    }

    public void submitLocalPollModification() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);

    }

    public void modifyLocalPollForm(LocalPollData localPollData) throws InterruptedException {
        type(By.id("poll-title"), localPollData.getTitle());
        type(By.id("poll-description"), localPollData.getDescription());
        select_2(By.id("select2-poll-region_id-container"), By.xpath("//input[@type='search']"), localPollData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-poll-municipality_id-container"), By.xpath("//input[@type='search']"), localPollData.getMunicipality());
        type(By.id("poll-form_date_from"), localPollData.getDate_start());
        type(By.id("poll-form_date_to"), localPollData.getDate_end());
        select(By.id("poll-is_show_statistics"), localPollData.getShow_statistics());
        type(By.id("attachment-0-title"), localPollData.getAttachment_name());
        type(By.id("attachment-0-description"), localPollData.getAttachment_description());
        attach(By.id("attachment-0-file"), localPollData.getAttachment());
        select(By.id("pollquestion-0-type"), localPollData.getQuestion_type());
        type(By.id("pollquestion-0-title"), localPollData.getQuestion_text());
        type(By.id("pollquestion-0-choice_amount"), localPollData.getAnswer_quantity());
        type(By.id("pollquestionoption-0-0-value"), localPollData.getAnswer_option());
        type(By.id("pollquestionoption-0-1-value"), localPollData.getAnswer_option());
    }

    public void publishLocalPoll() throws InterruptedException {
        click(By.linkText("Опубликовать"));
        Thread.sleep(3000);
    }

}
