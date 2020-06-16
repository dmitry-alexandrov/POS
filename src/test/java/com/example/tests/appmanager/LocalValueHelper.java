package com.example.tests.appmanager;

import com.example.tests.model.LocalValueData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class LocalValueHelper extends HelperBase {

    public boolean acceptNextAlert = true;

    public LocalValueHelper(WebDriver driver) {
        super(driver);
    }

    public void submitLocalValueCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);
    }

    public void fillLocalValueForm(LocalValueData localValueData) throws InterruptedException {
        type(By.id("poll-title"), localValueData.getTitle());
        type(By.id("poll-description"), localValueData.getDescription());
        select_2(By.xpath("//*[@id='select2-poll-region_id-container']"), By.xpath("//input[@type='search']"), localValueData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.xpath("//*[@id='municipal-div']/div/span/span[1]/span/span[2]"), By.xpath("//input[@type='search']"), localValueData.getMunicipality());
        type(By.id("poll-form_date_from"), localValueData.getDate_start());
        type(By.id("poll-form_date_to"), localValueData.getDate_end());
        type(By.id("attachment-0-title"), localValueData.getAttachment_name());
        type(By.id("attachment-0-description"), localValueData.getAttachment_description_1());
        attach(By.id("attachment-0-file"), localValueData.getAttachment_1());
        type(By.id("pollquestion-0-title"), localValueData.getQuestion_1());
        type(By.id("pollquestion-0-rating_to"), localValueData.getQuestion_option_1());

    }

    public void initLocalValueCreation() {
        click(By.linkText("Создать обсуждение (оценка)"));
    }

    public void selectLocalValueModify() {
        while (true) {

            if(driver.findElements(By.linkText("Оценка МЗ тест для модификации")).size() != 0) {

                click(By.linkText("Оценка МЗ тест для модификации"));

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

    public void selectLocalValuePublish() {

        while (true) {

            if(driver.findElements(By.linkText("Оценка МЗ тест (Опубликован)")).size() != 0) {

                click(By.linkText("Оценка МЗ тест (Опубликован)"));

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

    public void selectLocalValueDelete() {

        while (true) {

            if(driver.findElements(By.linkText("Оценка МЗ тест (Удалено)")).size() != 0) {

                click(By.linkText("Оценка МЗ тест (Удалено)"));

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

    public void initLocalValueModification() {
        click(By.linkText("Редактировать"));
    }

    public void modifyLocalValueForm(LocalValueData localValueData) throws InterruptedException {

        type(By.id("poll-title"), localValueData.getTitle());
        type(By.id("poll-description"), localValueData.getDescription());
        select_2(By.xpath("//*[@id='select2-poll-region_id-container']"), By.xpath("//input[@type='search']"), localValueData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.xpath("//*[@id='municipal-div']/div/span/span[1]/span/span[2]"), By.xpath("//input[@type='search']"), localValueData.getMunicipality());
        type(By.id("poll-form_date_from"), localValueData.getDate_start());
        type(By.id("poll-form_date_to"), localValueData.getDate_end());
        type(By.id("attachment-0-title"), localValueData.getAttachment_name());
        type(By.id("attachment-0-description"), localValueData.getAttachment_description_1());
        attach(By.id("attachment-0-file"), localValueData.getAttachment_1());
        type(By.id("pollquestion-0-title"), localValueData.getQuestion_1());
        type(By.id("pollquestion-0-rating_to"), localValueData.getQuestion_option_1());

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

    public void submitLocalValueModification() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);

    }

    public void deleteLocalValue() throws InterruptedException {
        click(By.linkText("Удалить"));
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить этот элемент[\\s\\S]$"));
        Thread.sleep(1000);
    }

    public void publishLocalValue() throws InterruptedException {
        click(By.linkText("Опубликовать"));
        Thread.sleep(1000);
    }

}
