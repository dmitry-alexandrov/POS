package com.example.tests.appmanager;

import com.example.tests.model.LocalDiscussionData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

import static org.testng.Assert.assertTrue;


public class LocalDiscussionHelper extends HelperBase {

    public boolean acceptNextAlert = true;

    public LocalDiscussionHelper(WebDriver driver) {
        super(driver);
    }

    public void submitLocalDiscussionCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void fillLocalDiscussionForm(LocalDiscussionData localDiscussionData) throws InterruptedException {


        type(By.id("discussion-name"), localDiscussionData.getTitle());
        type(By.id("discussion-description"), localDiscussionData.getDescription());
        click(By.xpath("//span[@id='select2-discussion-region_id-container']/span"));
        type(By.xpath("//input[@type='search']"), localDiscussionData.getRegion());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        click(By.xpath("//span[@id='select2-discussion-municipality_id-container']/span"));
        type(By.xpath("//input[@type='search']"), localDiscussionData.getMunicipality());
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("discussion-starts_at")).click();
        driver.findElement(By.xpath("//tr[5]/td[6]")).click();
        driver.findElement(By.id("discussion-ends_at")).click();
        driver.findElement(By.xpath("//tr[6]/td[7]")).click();
        type(By.id("document-title"), localDiscussionData.getAttachment_name());
        type(By.id("document-description"), localDiscussionData.getAttachment_description_1());
        attach(By.id("document-file"), localDiscussionData.getAttachment_1());




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
        //click(By.xpath("//span[@id='select2-discussion-region_id-container']/span"));
        //type(By.xpath("//input[@type='search']"), localDiscussionData.getRegion());
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        //Thread.sleep(1000);
        //click(By.xpath("//span[@id='select2-discussion-municipality_id-container']/span"));
        //type(By.xpath("//input[@type='search']"), localDiscussionData.getMunicipality());
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("discussion-starts_at")).click();
        driver.findElement(By.xpath("//tr[5]/td[6]")).click();
        driver.findElement(By.id("discussion-ends_at")).click();
        driver.findElement(By.xpath("//tr[6]/td[7]")).click();
        //type(By.id("document-title"), localDiscussionData.getAttachment_name());
        //type(By.id("document-description"), localDiscussionData.getAttachment_description_1());
        //attach(By.id("document-file"), localDiscussionData.getAttachment_1());

    }

    public void submitLocalDiscussionModification() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);

    }

    public void selectLocalDiscussion() {

        click(By.linkText("Обсуждение документа МЗ тест"));
        acceptNextAlert = true;
        //Thread.sleep(1000);
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
        Thread.sleep(2000);
    }

}
