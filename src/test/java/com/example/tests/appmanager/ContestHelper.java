package com.example.tests.appmanager;

import com.example.tests.model.ContestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class ContestHelper extends HelperBase{

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


}
