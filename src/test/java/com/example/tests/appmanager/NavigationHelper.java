package com.example.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoPollListPage() {
      click(By.xpath("//div[2]/a/span"));
    }

    public void gotoLocalEntitysPage() {
        click(By.xpath("//div[3]/a/span"));
    }

    public void gotoContestListPage() {
        click(By.xpath("//div[4]/a/span"));
    }

    public void gotoNewsListPage() {
        click(By.xpath("//div[6]/a/span"));
    }
}
