package com.example.tests.appmanager;

import com.example.tests.model.LocalDiscussionData;
import org.openqa.selenium.*;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;


public class LocalDiscussionHelper extends HelperBase {

    public boolean acceptNextAlert = true;

    public LocalDiscussionHelper(WebDriver driver) {
        super(driver);
    }

    public void submitLocalDiscussionCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
      //  Thread.sleep(2000);
    }

    public void fillLocalDiscussionForm(LocalDiscussionData localDiscussionData) throws InterruptedException {

        type(By.id("discussion-name"), localDiscussionData.getTitle());
        type(By.id("discussion-description"), localDiscussionData.getDescription());
        select_2(By.id("select2-discussion-region_id-container"), By.xpath("//input[@type='search']"), localDiscussionData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-discussion-municipality_id-container"), By.xpath("//input[@type='search']"), localDiscussionData.getMunicipality());
        type(By.id("discussion-starts_at"), localDiscussionData.getDate_start());
        type(By.id("discussion-ends_at"), localDiscussionData.getDate_end());
        type(By.id("document-title"), localDiscussionData.getAttachment_name());
        type(By.id("document-description"), localDiscussionData.getAttachment_description());
        attach(By.id("document-file"), localDiscussionData.getAttachment_document());

    }

    public void initLocalDiscussionCreation() {
        click(By.linkText("Создать обсуждение (комментирование)"));
    }

    public void initLocalDiscussionModification() {
        click(By.linkText("Редактировать"));
    }

    public void modifyLocalDiscussionForm(LocalDiscussionData localDiscussionData) throws InterruptedException {

        type(By.id("discussion-name"), localDiscussionData.getTitle());
        type(By.id("discussion-description"), localDiscussionData.getDescription());
        select_2(By.id("select2-discussion-region_id-container"), By.xpath("//input[@type='search']"), localDiscussionData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-discussion-municipality_id-container"), By.xpath("//input[@type='search']"), localDiscussionData.getMunicipality());
        type(By.id("discussion-starts_at"), localDiscussionData.getDate_start());
        type(By.id("discussion-ends_at"), localDiscussionData.getDate_end());

    }

    public void submitLocalDiscussionModification() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);

    }

    public void selectLocalDiscussionDelete() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовое обсуждение (комментирование) для удаления")).size() != 0) {

                click(By.linkText("Тестовое обсуждение (комментирование) для удаления"));

                break;

            } else {

                try {

                    click(By.linkText("»"));

                } catch (NoSuchElementException ex) {

                    Assert.fail("NoSuchElementException", ex);

                }

            }

        }

        //Thread.sleep(1000);
    }

    public void selectLocalDiscussionModify() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовое обсуждение (комментирование) для редактирования")).size() != 0) {

                click(By.linkText("Тестовое обсуждение (комментирование) для редактирования"));

                break;

            } else {

                try {

                    click(By.linkText("»"));

                } catch (NoSuchElementException ex) {

                    Assert.fail("NoSuchElementException", ex);

                }

            }

        }

        //Thread.sleep(1000);
    }

    public void selectLocalDiscussionPublish() throws InterruptedException {

        while (true) {

            if(driver.findElements(By.linkText("Тестовое обсуждение (комментирование) для публикации")).size() != 0) {

                click(By.linkText("Тестовое обсуждение (комментирование) для публикации"));

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

    public void deleteLocalDiscussion() throws InterruptedException {
        click(By.linkText("Удалить"));
        Thread.sleep(1000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить этот элемент[\\s\\S]$"));
        Thread.sleep(1000);
    }

    public void publishLocalDiscussion() throws InterruptedException {
        click(By.linkText("Опубликовать"));
        Thread.sleep(5000);
    }

}
