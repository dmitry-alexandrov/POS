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

    public void gotoClientsApiListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Клиенты API")).size() != 0) {

                click(By.linkText("Клиенты API"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Управление клиентами API")).size() != 0) {

                click(By.linkText("Управление клиентами API"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

    public void gotoClientsApiRoleListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Роли клиентов API")).size() != 0) {

                click(By.linkText("Роли клиентов API"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Управление клиентами API")).size() != 0) {

                click(By.linkText("Управление клиентами API"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

    public void gotoAssignClientsApiListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Назначение ролей для клиентов API")).size() != 0) {

                click(By.linkText("Назначение ролей для клиентов API"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Управление клиентами API")).size() != 0) {

                click(By.linkText("Управление клиентами API"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

    public void gotoRegionsListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Регионы")).size() != 0) {

                click(By.linkText("Регионы"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Справочники")).size() != 0) {

                click(By.linkText("Справочники"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

    public void gotoMunicipalitysListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Муниципалитеты")).size() != 0) {

                click(By.linkText("Муниципалитеты"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Справочники")).size() != 0) {

                click(By.linkText("Справочники"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

    public void gotoSectorProjectsListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Категории проектов")).size() != 0) {

                click(By.linkText("Категории проектов"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Справочники")).size() != 0) {

                click(By.linkText("Справочники"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

    public void gotoOrganizationsListPage() throws InterruptedException {

        while (true) {

            if (driver.findElements(By.linkText("Организации")).size() != 0) {

                click(By.linkText("Организации"));
                Thread.sleep(1000);
                break;

            } else if(driver.findElements(By.linkText("Справочники")).size() != 0) {

                click(By.linkText("Справочники"));

            } else {

                click(By.linkText("Настройки"));

            }

        }

    }

}

