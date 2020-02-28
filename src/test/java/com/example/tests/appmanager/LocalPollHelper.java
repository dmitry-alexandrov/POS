package com.example.tests.appmanager;


import com.example.tests.model.LocalPollData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;



public class LocalPollHelper extends HelperBase {

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
        click(By.xpath("//span[@id='select2-poll-region_id-container']/span"));
        type(By.xpath("//input[@type='search']"), localPollData.getRegion());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        click(By.xpath("//span[@id='select2-poll-municipality_id-container']/span"));
        type(By.xpath("//input[@type='search']"), localPollData.getMunicipality());
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("poll-form_date_from")).click();
        driver.findElement(By.xpath("//th[3]")).click();
        driver.findElement(By.xpath("//tr[2]/td")).click();
        driver.findElement(By.id("poll-form_date_to")).click();
        driver.findElement(By.xpath("//tr[6]/td")).click();
        type(By.id("attachment-0-title"), localPollData.getAttachment_name());
        type(By.id("attachment-0-description"), localPollData.getAttachment_description_1());
        attach(By.id("attachment-0-file"), localPollData.getAttachment_1());
        type(By.id("pollquestion-0-title"), localPollData.getQuestion_1());
        type(By.id("pollquestionoption-0-0-value"), localPollData.getQuestion_option_1());
        type(By.id("pollquestionoption-0-1-value"), localPollData.getQuestion_option_2());
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
    }

    public void initLocalPollCreation() {
        click(By.linkText("Создать Опрос МЗ"));
    }

}
