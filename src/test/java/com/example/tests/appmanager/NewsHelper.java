package com.example.tests.appmanager;

import com.example.tests.model.NewsData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class NewsHelper extends HelperBase {

    private boolean acceptNextAlert = true;

    public NewsHelper(WebDriver driver) {
        super(driver);
    }

    public void submitNewsCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void fillNewsForm(NewsData newsData) throws InterruptedException {

        type(By.id("news-title_short"), newsData.getTitle());
        type(By.id("news-description"), newsData.getDescription());
        select(By.id("news-level"), newsData.getLevel());
        select_2(By.id("select2-news-region_id-container"), By.xpath("//input[@type='search']"), newsData.getRegion());
        Thread.sleep(500); //Костыль, нужно переделать
        select_2(By.id("select2-news-municipality_id-container"), By.xpath("//input[@type='search']"), newsData.getMunicipality());
        type(By.id("news-published_at"), newsData.getDate());
        Thread.sleep(500); //Костыль, нужно переделать
        click(By.cssSelector("button[data-id='external_link_panel']"));
        type(By.id("news-external_link_title"), newsData.getLink_name());
        type(By.id("news-external_link"), newsData.getLink_address());
     //   click(By.cssSelector("button[data-id='entity_link_panel']"));
     //   select_2(By.id("select2-news-entity_type-container"), By.cssSelector("input[aria-labelledby='select2-news-entity_type-container']"), newsData.getEntity_type());
     //   Thread.sleep(500); //Костыль, нужно переделать
     //   select_2(By.id("select2-news-entity_id-container"), By.cssSelector("input[aria-labelledby='select2-news-entity_id-container']"), newsData.getRelated_entity());


}
    public void initNewsCreation() {
        click(By.linkText("Добавить новость"));
    }

    public void modifyNewsForm(NewsData newsData) throws InterruptedException {

        type(By.id("news-title_short"), newsData.getTitle());
        type(By.id("news-description"), newsData.getDescription());
        //click(By.id("news-level"));
        //new Select(driver.findElement(By.id("news-level"))).selectByVisibleText("Муниципальный");
        //driver.findElement(By.xpath("//option[@value='30']")).click();
        //click(By.xpath("//span[@id='select2-news-region_id-container']/span"));
        //type(By.xpath("//input[@type='search']"), newsData.getRegion());
        //Thread.sleep(500);
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        //Thread.sleep(500);
        //click(By.xpath("//span[@id='select2-news-municipality_id-container']/span"));
        //type(By.xpath("//input[@type='search']"), newsData.getMunicipality());
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("news-published_at")).click();
        driver.findElement(By.xpath("//tr[5]/td[6]")).click();

    }

    public void initNewsModification() {

        click(By.linkText("Редактировать"));

    }


    public void submitNewsModification() throws InterruptedException {

        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);

    }

    public void selectNewsDelete() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовая новость (для удаления)")).size() != 0) {

                click(By.linkText("Тестовая новость (для удаления)"));

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

    public void selectNewsModify() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовая новость (для редактирования)")).size() != 0) {

                click(By.linkText("Тестовая новость (для редактирования)"));

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

    public void selectNewsPublish() {

        while (true) {

            if(driver.findElements(By.linkText("Тестовая новость (для публикации)")).size() != 0) {

                click(By.linkText("Тестовая новость (для публикации)"));

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


    public void deleteNews() throws InterruptedException {

        click(By.linkText("Удалить"));
        Thread.sleep(1000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить эту новость?[\\s\\S]$"));
        Thread.sleep(2000);

    }

    private String closeAlertAndGetItsText() {

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

    public void publishNews() throws InterruptedException {

        click(By.linkText("Опубликовать"));
        Thread.sleep(3000);

    }

}
