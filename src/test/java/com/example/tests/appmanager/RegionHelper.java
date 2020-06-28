package com.example.tests.appmanager;

import com.example.tests.model.RegionData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegionHelper extends HelperBase {

    private boolean acceptNextAlert = true;

    public RegionHelper(WebDriver driver) {
        super(driver);
    }

    public  void submitRegionCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);
    }

    public void initRegionCreation() throws InterruptedException {

        click(By.linkText("Добавить Регион"));
        Thread.sleep(1000);

    }

    public void fillRegionForm(RegionData regionData) throws InterruptedException {

        type(By.id("region-name"), regionData.getName());
        type(By.id("region-code"), regionData.getCode());

    }

}
