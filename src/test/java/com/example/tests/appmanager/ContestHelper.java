package com.example.tests.appmanager;

import com.example.tests.model.ContestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.Matcher;

import static org.testng.Assert.assertTrue;

public class ContestHelper extends HelperBase{

    private boolean acceptNextAlert = true;

    public ContestHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContestCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);
    }

    public void fillContestForm(ContestData contestData) throws InterruptedException {

        type(By.id("projectcontest-name"), contestData.getName());
        click(By.id("projectcontest-level"));
        new Select(driver.findElement(By.id("projectcontest-level"))).selectByVisibleText("Муниципальный");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        click(By.xpath("//span[@id='select2-projectcontest-region_id-container']/span"));
        type(By.xpath("(//input[@type='search'])[2]"), contestData.getRegion());
        driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
        Thread.sleep(200);
        click(By.xpath("//span[@id='select2-projectcontest-municipality_id-container']/span"));
        type(By.xpath("(//input[@type='search'])[2]"), contestData.getMunicipality());
        driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("projectcontest-starts_at")).click();
        driver.findElement(By.xpath("//tr[5]/td[6]")).click();
        driver.findElement(By.id("projectcontest-ends_at")).click();
        driver.findElement(By.xpath("//tr[6]/td[7]")).click();
        type(By.id("projectcontest-choices_amount"), contestData.getChoicesAmount());
        type(By.id("projectcontest-winners_amount"), contestData.getWinnersAmount());
        type(By.xpath("//input[@type='search']"), contestData.getSector());
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);

    }

    public void initContestCreation() {
        click(By.linkText("Создать Голосование"));
    }

    public void deleteContest() throws InterruptedException {
        click(By.linkText("Удалить"));
        Thread.sleep(3000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить этот элемент[\\s\\S]$"));
        Thread.sleep(3000);
    }

    public String closeAlertAndGetItsText() {
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

    public void selectContest() {
        click(By.linkText("Конкурс тест"));
        acceptNextAlert = true;
    }

    public void modifyContestForm(ContestData contestData) throws InterruptedException {
        type(By.id("projectcontest-name"), contestData.getName());
        //click(By.id("projectcontest-level"));
       // new Select(driver.findElement(By.id("projectcontest-level"))).selectByVisibleText("Муниципальный");
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        //click(By.xpath("//span[@id='select2-projectcontest-region_id-container']/span"));
        //type(By.xpath("(//input[@type='search'])[2]"), contestData.getRegion());
        //driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
        Thread.sleep(200);
        //click(By.xpath("//span[@id='select2-projectcontest-municipality_id-container']/span"));
        //type(By.xpath("(//input[@type='search'])[2]"), contestData.getMunicipality());
        //driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("projectcontest-starts_at")).click();
        driver.findElement(By.xpath("//tr[5]/td[6]")).click();
        driver.findElement(By.id("projectcontest-ends_at")).click();
        driver.findElement(By.xpath("//tr[6]/td[7]")).click();
        type(By.id("projectcontest-choices_amount"), contestData.getChoicesAmount());
        type(By.id("projectcontest-winners_amount"), contestData.getWinnersAmount());
        Thread.sleep(2000);
        type(By.xpath("//input[@type='search']"), contestData.getSector());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//input[@type='search']")).click();
        //driver.findElement(By.xpath("//div[@id='sector-div']/div/span[2]/span/span/ul/li/span")).click();
        //driver.findElement(By.xpath("//input[@type='search']")).click();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void initContestModification() {
        click(By.linkText("Редактировать"));
    }

    public void submitContestModification() throws InterruptedException {
        Thread.sleep(1000);
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void publishContest() throws InterruptedException {
        click(By.linkText("Опубликовать"));
        acceptNextAlert = true;
        Thread.sleep(3000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите опубликовать голосование по проектам?[\\s\\S]$"));
        Thread.sleep(3000);
    }

}
