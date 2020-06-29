package com.example.tests.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

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

    protected void select_3(By locator, String text) {

        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
        driver.findElement(locator).sendKeys(Keys.ENTER);

    }

    protected void select(By locator, String text) {
        new Select(driver.findElement(locator)).selectByVisibleText(text);
    }

    protected void select_2(By locator_1, By locator_2, String text) throws InterruptedException {

            driver.findElement(locator_1).click();
            driver.findElement(locator_2).clear();
            driver.findElement(locator_2).sendKeys(text);
            Thread.sleep(500);
            driver.findElement(locator_2).sendKeys(Keys.ENTER);


     //   new Select(driver.findElement(locator)).selectByVisibleText(text);
    }

    protected void select_4(By locator_2, String text) {

        List<WebElement> element = driver.findElements(locator_2);
        List<String> texts = element.stream().map(WebElement::getText).collect(Collectors.toList());
        for (int i = 0; i < element.size(); i++) {
            if (texts.get(0).equals(text)) {
                element.get(i).click();
                break;
            }
        }
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

    public void addQuestion(By locator) {
        click(locator);
    }

    public void addAnswer(By locator) {
        click(locator);
    }

    public void find(By locator, String text) throws InterruptedException {

        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
        driver.findElement(locator).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

    public void clickEye(By locator) throws InterruptedException {

        driver.findElement(locator).click();

    }

}
