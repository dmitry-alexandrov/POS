package com.example.tests.appmanager;

import com.example.tests.model.NewsData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;

public class NewsHelper extends HelperBase {

    private boolean acceptNextAlert = true;

    public NewsHelper(WebDriver driver) {
        super(driver);
    }

    public void submitNewsCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void fillNewsForm(NewsData newsData) throws InterruptedException {

        type(By.id("news-title_short"), newsData.getTitle());
        type(By.id("news-description"), newsData.getDescription());
        click(By.id("news-level"));
        new Select(driver.findElement(By.id("news-level"))).selectByVisibleText("Муниципальный");
        //driver.findElement(By.xpath("//option[@value='30']")).click();
        click(By.xpath("//span[@id='select2-news-region_id-container']/span"));
        type(By.xpath("//input[@type='search']"), newsData.getRegion());
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        Thread.sleep(500);
        click(By.xpath("//span[@id='select2-news-municipality_id-container']/span"));
        type(By.xpath("//input[@type='search']"), newsData.getMunicipality());
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("news-published_at")).click();
        driver.findElement(By.xpath("//tr[5]/td[6]")).click();

}
    public void initNewsCreation() {
        click(By.linkText("Добавить новость"));
    }

    public void modifyNewsForm(NewsData newsData) throws InterruptedException {

        type(By.id("news-title_short"), newsData.getTitle());
        type(By.id("news-description"), newsData.getDescription());
        //click(By.id("news-level"));
        //new Select(driver.findElement(By.id("news-level"))).selectByVisibleText("Муниципальный");
        //driver.findElement(By.xpath("//option[@value='30']")).click();
        //click(By.xpath("//span[@id='select2-news-region_id-container']/span"));
        //type(By.xpath("//input[@type='search']"), newsData.getRegion());
        //Thread.sleep(500);
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        //Thread.sleep(500);
        //click(By.xpath("//span[@id='select2-news-municipality_id-container']/span"));
        //type(By.xpath("//input[@type='search']"), newsData.getMunicipality());
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("news-published_at")).click();
        driver.findElement(By.xpath("//tr[5]/td[6]")).click();

    }

    public void initNewsModification() {

        click(By.linkText("Редактировать"));

    }


    public void submitNewsModification() throws InterruptedException {

        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);

    }

    public void selectNews() {
        click(By.linkText("Новость тест"));
        acceptNextAlert = true;
    }

    public void deleteNews() throws InterruptedException {

        click(By.linkText("Удалить"));
        Thread.sleep(1000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить эту новость?[\\s\\S]$"));
        Thread.sleep(3000);

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

    public void publishNews() throws InterruptedException {

        click(By.linkText("Опубликовать"));
        Thread.sleep(3000);

    }

}
