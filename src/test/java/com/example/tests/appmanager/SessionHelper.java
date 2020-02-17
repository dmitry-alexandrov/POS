package com.example.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        type(By.id("loginform-username"), username);
        type(By.id("loginform-password"), password);
        driver.findElement(By.id("loginform-password")).click();
        driver.findElement(By.id("loginform-password")).clear();
        driver.findElement(By.id("loginform-password")).sendKeys(password);
        click(By.name("login-button"));
    }
}
