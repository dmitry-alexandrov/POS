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

    public void fillLocalPollForm(LocalPollData localPollData) throws InterruptedException {
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
