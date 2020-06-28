package com.example.tests.appmanager;

import com.example.tests.model.OrganizationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class OrganizationHelper extends HelperBase {

        private boolean acceptNextAlert = true;

        public OrganizationHelper(WebDriver driver) {
            super(driver);
        }

        public  void submitOrganizationCreation() throws InterruptedException {
            click(By.xpath("//button[@type='submit']"));
            Thread.sleep(1000);
        }

        public void initOrganizationCreation() throws InterruptedException {

            click(By.linkText("Добавить организацию"));
            Thread.sleep(1000);

        }

        public void fillOrganizationForm(OrganizationData organizationData) throws InterruptedException {

            type(By.id("organisation-shortname"), organizationData.getShortName());
            type(By.id("organisation-fullname"), organizationData.getFullName());
            type(By.id("organisation-ogrn"), organizationData.getOgrn());
            type(By.id("organisation-inn"), organizationData.getInn());
            type(By.id("organisation-kpp"), organizationData.getKpp());
            select_2(By.cssSelector("span[class='select2-selection select2-selection--single']"), By.xpath("//input[@type='search']"), organizationData.getOgv());
            type(By.id("organisation-oktmo"), organizationData.getOktmo());
            type(By.id("organisation-addrs"), organizationData.getAddress());
            select(By.id("organisation-level"), organizationData.getLevel());


        }

    }


