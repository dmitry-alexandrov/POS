package com.example.tests.appmanager;

import com.example.tests.model.SectorProjectData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class SectorProjectHelper extends HelperBase {

        private boolean acceptNextAlert = true;

        public SectorProjectHelper(WebDriver driver) {
            super(driver);
        }

        public  void submitSectorProjectCreation() throws InterruptedException {
            click(By.xpath("//button[@type='submit']"));
            Thread.sleep(1000);
        }

        public void initSectorProjectCreation() throws InterruptedException {

            click(By.linkText("Добавить категорию проекта"));
            Thread.sleep(1000);

        }

        public void fillSectorProjectForm(SectorProjectData sectorProjectData) throws InterruptedException {

            type(By.id("sector-name"), sectorProjectData.getName());
            type(By.id("sector-code"), sectorProjectData.getCode());
            type(By.name("SpecialField[0][title]"), sectorProjectData.getSpecialField_name());
            select_2(By.cssSelector("span[class='select2-selection select2-selection--single']"), By.xpath("//input[@type='search']"), sectorProjectData.getSpecialField_type());

        }

        public void addSpecialField() throws Exception {

            click(By.id("add-special-field-btn"));
            Thread.sleep(1000);

        }

    }


