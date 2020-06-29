package com.example.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.tests.model.EntityFilterData;
import org.testng.Assert;

public class EntityFilterHelper extends HelperBase {


    public EntityFilterHelper(WebDriver driver) {
        super(driver);
    }

    public void initEntityFilter() {

        click(By.linkText("Фильтры и поиск"));

    }

    public void fillFieldSearchByName(EntityFilterData entityFilterData) {

        type(By.id("pollsearch-title"), entityFilterData.getName());

    }

    public void fillFieldSearchByLevel(EntityFilterData entityFilterData) {

        select(By.id("pollsearch-level"), entityFilterData.getLevel());

    }

    public void fillFieldSearchByRegion(EntityFilterData entityFilterData) throws InterruptedException {

        select_2(By.xpath("//span[@id='select2-pollsearch-region_id-container']/span"), By.xpath("//input[@type='search']"), entityFilterData.getRegion());

    }

    public void fillFieldSearchByMunicipality(EntityFilterData entityFilterData) throws InterruptedException {

        select_2(By.xpath("//*[@id='select2-pollsearch-municipality_id-container']"), By.xpath("//input[@type='search']"), entityFilterData.getMunicipality());

    }

    public void fillFieldSearchByStatus(EntityFilterData entityFilterData) {

        select(By.id("pollsearch-status"), entityFilterData.getStatus());

    }

    public void fillFieldSearchByType(EntityFilterData entityFilterData) throws InterruptedException {

        select(By.id("pollsearch-type"), entityFilterData.getType());
        Thread.sleep(1000);

    }

    public void fillFieldSearchByInterval(EntityFilterData entityFilterData) {

        type(By.id("pollsearch-form_date_from"), entityFilterData.getStart_interval());
        type(By.id("pollsearch-form_date_to"), entityFilterData.getEnd_interval());

    }

    public void submitEntityFilter() {

        click(By.xpath("//button[@type='submit']"));

    }

    public void checkElementsSearchByName() {

        isElementPresent(By.linkText("Опрос 1 API"));

    }

    public void checkElementsSearchByLevel() {

        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr[1]/td[5][contains(text(), 'Федеральный')]"));

    }

    public void checkElementsSearchByRegion() {

        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr[1]/td[5][contains(text(), 'Региональный')]"));
        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr[1]/td[6][contains(text(), 'Ярославская область')]"));

    }

    public void checkElementsSearchByMunicipality() {

        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr[1]/td[5][contains(text(), 'Муниципальный')]"));
        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr[1]/td[6][contains(text(), 'Московская область')]"));
        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr[1]/td[7][contains(text(), 'Волоколамский муниципальный район')]"));

    }

    public void checkElementsSearchByStatus() {

        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr[1]/td[4][contains(text(), 'Черновик')]"));

    }

    public void checkElementsSearchByType() {

        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr[1]/td[3][contains(text(), 'Опрос удовлетворенности')]"));

    }

    public void checkElementsSearchByInterval() {

        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr/td[8][contains(text(), '13.05.2021')]"));
        isElementPresent(By.xpath("//*[@id='w1']/table/tbody/tr/td[9][contains(text(), '13.06.2021')]"));

    }

}
