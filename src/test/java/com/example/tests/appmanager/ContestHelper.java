package com.example.tests.appmanager;

import com.example.tests.model.ContestData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.regex.Matcher;

import static org.testng.Assert.assertTrue;

public class ContestHelper extends HelperBase{

    private boolean acceptNextAlert = true;

    public ContestHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContestCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void fillContestForm(ContestData contestData) throws InterruptedException {

        type(By.id("projectcontest-name"), contestData.getName());
        select(By.id("projectcontest-level"), contestData.getLevel());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-projectcontest-region_id-container"), By.cssSelector("input[aria-controls='select2-projectcontest-region_id-results']"), contestData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-projectcontest-municipality_id-container"), By.cssSelector("input[aria-controls=select2-projectcontest-municipality_id-results]"), contestData.getMunicipality());
        Thread.sleep(500); //Костыль, нужно переделать
        type(By.id("projectcontest-starts_at"), contestData.getDate_start());
        type(By.id("projectcontest-ends_at"), contestData.getDate_end());
        type(By.id("projectcontest-choices_amount"), contestData.getChoicesAmount());
        type(By.id("projectcontest-winners_amount"), contestData.getWinnersAmount());
        select_3(By.cssSelector("input[class='select2-search__field']"), contestData.getSector());
     //   Thread.sleep(500);

    }

    public void initContestCreation() {
        click(By.linkText("Создать Голосование"));
    }

    public void deleteContest() throws InterruptedException {
        click(By.linkText("Удалить"));
     //   Thread.sleep(2000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы уверены что хотите удалить голосование по проектам[\\s\\S]$"));
     //   Thread.sleep(2000);
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public void selectContest() {
        click(By.linkText("Конкурс тест"));
        acceptNextAlert = true;
    }

    public void selectContestModify() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовый конкурс (для редактирования)")).size() != 0) {

                click(By.linkText("Тестовый конкурс (для редактирования)"));

                break;

            } else {

                try {

                    click(By.linkText("»"));

                } catch (NoSuchElementException ex) {

                    Assert.fail("NoSuchElementException", ex);

                }

            }

        }

    }

    public void selectContestPublish() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовый конкурс (для публикации)")).size() != 0) {

                click(By.linkText("Тестовый конкурс (для публикации)"));

                break;

            } else {

                try {

                    click(By.linkText("»"));

                } catch (NoSuchElementException ex) {

                    Assert.fail("NoSuchElementException", ex);

                }

            }

        }

    }


    public void selectContestDelete() {
        while (true) {

            if(driver.findElements(By.linkText("Тестовый конкурс (для удаления)")).size() != 0) {

                click(By.linkText("Тестовый конкурс (для удаления)"));

                break;

            } else {

                try {

                    click(By.linkText("»"));

                } catch (NoSuchElementException ex) {

                    Assert.fail("NoSuchElementException", ex);

                }

            }

        }
    }

    public void modifyContestForm(ContestData contestData) throws InterruptedException {

        type(By.id("projectcontest-name"), contestData.getName());
        select(By.id("projectcontest-level"), contestData.getLevel());
      //  Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-projectcontest-region_id-container"), By.cssSelector("input[aria-controls='select2-projectcontest-region_id-results']"), contestData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-projectcontest-municipality_id-container"), By.cssSelector("input[aria-controls=select2-projectcontest-municipality_id-results]"), contestData.getMunicipality());
       // Thread.sleep(1000);
        type(By.id("projectcontest-starts_at"), contestData.getDate_start());
        type(By.id("projectcontest-ends_at"), contestData.getDate_end());
        type(By.id("projectcontest-choices_amount"), contestData.getChoicesAmount());
        type(By.id("projectcontest-winners_amount"), contestData.getWinnersAmount());
        select_3(By.cssSelector("input[class='select2-search__field']"), contestData.getSector());



    }

    public void initContestModification() {
        click(By.linkText("Редактировать"));
    }

    public void submitContestModification() throws InterruptedException {
        Thread.sleep(1000);
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void publishContest() throws InterruptedException {
        click(By.linkText("Опубликовать"));
        acceptNextAlert = true;
        Thread.sleep(2000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите опубликовать голосование по проектам?[\\s\\S]$"));
        Thread.sleep(2000);
    }

}
