package com.example.tests.appmanager;

import com.example.tests.model.NewsData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewsHelper extends HelperBase {

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
}
