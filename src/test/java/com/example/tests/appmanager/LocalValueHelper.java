package com.example.tests.appmanager;


import com.example.tests.model.LocalValueData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;



public class LocalValueHelper extends HelperBase {

    public LocalValueHelper(WebDriver driver) {
        super(driver);
    }

    public void submitLocalValueCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void fillLocalValueForm(LocalValueData localValueData) throws InterruptedException {

        type(By.id("poll-title"), localValueData.getTitle());
        type(By.id("poll-description"), localValueData.getDescription());
        click(By.xpath("//span[@id='select2-poll-region_id-container']/span"));
        type(By.xpath("//input[@type='search']"), localValueData.getRegion());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        click(By.xpath("//span[@id='select2-poll-municipality_id-container']/span"));
        type(By.xpath("//input[@type='search']"), localValueData.getMunicipality());
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        type(By.id("attachment-0-title"), localValueData.getAttachment_name());
        type(By.id("attachment-0-description"), localValueData.getAttachment_description_1());
        attach(By.id("attachment-0-file"), localValueData.getAttachment_1());
        driver.findElement(By.id("poll-form_date_from")).click();
        driver.findElement(By.xpath("//tr[5]/td[6]")).click();
        driver.findElement(By.id("poll-form_date_to")).click();
        driver.findElement(By.xpath("//tr[6]/td[7]")).click();
        type(By.id("attachment-0-title"), localValueData.getAttachment_name());
        type(By.id("attachment-0-description"), localValueData.getAttachment_description_1());
        attach(By.id("attachment-0-file"), localValueData.getAttachment_1());
        driver.findElement(By.id("pollquestion-0-title")).sendKeys("Вопрос 1");
        type(By.id("pollquestion-0-title"), localValueData.getQuestion_1());
        type(By.id("pollquestion-0-rating_to"), localValueData.getQuestion_option_1());

    }

    public void initLocalValueCreation() {
        click(By.linkText("Создать Оценку МЗ"));
    }

}
