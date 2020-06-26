package com.example.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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

    public void gotoEntitledRoleListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Роли уполномоченных")).size() != 0) {

                click(By.linkText("Роли уполномоченных"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Управление уполномоченными")).size() != 0) {

                click(By.linkText("Управление уполномоченными"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

    public void gotoAssignEntitledListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Назначение ролей")).size() != 0) {

                click(By.linkText("Назначение ролей"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Управление уполномоченными")).size() != 0) {

                click(By.linkText("Управление уполномоченными"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

    public void gotoEntitledListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Уполномоченные")).size() != 0) {

                click(By.linkText("Уполномоченные"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Управление уполномоченными")).size() != 0) {

                click(By.linkText("Управление уполномоченными"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

}

