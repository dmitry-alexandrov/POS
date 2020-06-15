package com.example.tests.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;

public class HelperBase {
    public static WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
      driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
      click(locator);
      driver.findElement(locator).clear();
      driver.findElement(locator).sendKeys(text);
    }

    protected void select(By locator, String text) {
        new Select(driver.findElement(locator)).selectByVisibleText(text);
    }

    protected void select_2(By locator_1, By locator_2, String text) {

        driver.findElement(locator_1).click();
        driver.findElement(locator_2).clear();
        driver.findElement(locator_2).sendKeys(text);
        driver.findElement(locator_2).sendKeys(Keys.ENTER);

     //   new Select(driver.findElement(locator)).selectByVisibleText(text);
    }

    protected void attach(By locator, File file) {

        driver.findElement(locator).sendKeys(file.getAbsolutePath());
    }

    public boolean isElementPresent(By locator) {

       try {
            driver.findElement(locator);
                return true;
       } catch (NoSuchElementException ex) {
            Assert.fail("NoSuchElementException", ex);
                return false;
       }
}

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
