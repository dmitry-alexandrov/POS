package com.example.tests.appmanager;

import com.example.tests.model.MunicipalityData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class MunicipalityHelper extends HelperBase {

        private boolean acceptNextAlert = true;

        public MunicipalityHelper(WebDriver driver) {
            super(driver);
        }

        public  void submitMunicipalityCreation() throws InterruptedException {
            click(By.xpath("//button[@type='submit']"));
            Thread.sleep(1000);
        }

        public void initMunicipalityCreation() throws InterruptedException {

            click(By.linkText("Создать муниципалитет"));
            Thread.sleep(1000);

        }

        public void fillMunicipalityForm(MunicipalityData municipalityData) throws InterruptedException {

            type(By.id("municipality-name"), municipalityData.getName());
            type(By.id("municipality-code"), municipalityData.getCode());
            select_2(By.id("select2-municipality-region_id-container"), By.xpath("//input[@type='search']"), municipalityData.getRegion());

        }

    }


