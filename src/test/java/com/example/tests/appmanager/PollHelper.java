package com.example.tests.appmanager;

import com.example.tests.model.PollData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.testng.Assert.assertTrue;

public class PollHelper extends HelperBase {

    public boolean acceptNextAlert = true;

    public PollHelper(WebDriver driver) {

        super(driver);

    }

    public void submitPollCreation() {

        click(By.xpath("//button[@type='submit']"));

    }

    public void fillPollForm(PollData pollData) {

        type(By.id("poll-title"), pollData.getName());
        type(By.id("poll-description"), pollData.getDescription());
        click(By.id("poll-level"));
        click(By.xpath("//option[@value='10']"));
        click(By.id("poll-is_national_project"));
        new Select(driver.findElement(By.id("poll-is_national_project"))).selectByVisibleText("Да");
        click(By.xpath("(//option[@value='1'])[2]"));
        driver.findElement(By.id("poll-form_date_from")).click();
        driver.findElement(By.xpath("//th[3]")).click();
        driver.findElement(By.xpath("//tr[6]/td[3]")).click();
        driver.findElement(By.id("poll-form_date_to")).click();
        driver.findElement(By.xpath("//tr[5]/td[5]")).click();
        type(By.id("pollquestion-0-title"), pollData.getQuestion_1());
        type(By.id("pollquestion-0-choice_amount"), pollData.getAnswer_quantity_1());
        click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div/div/div/div[2]/div[3]/div[2]/div/div/button/span"));
        type(By.id("pollquestionoption-0-0-value"), pollData.getAnswer_option_1_1());
        type(By.id("pollquestionoption-0-1-value"), pollData.getAnswer_option_1_2());
        type(By.id("pollquestionoption-0-2-value"), pollData.getAnswer_option_1_3());

    }

    public void modifyPollForm(PollData pollData) {

        type(By.id("poll-title"), pollData.getName());
        type(By.id("poll-description"), pollData.getDescription());
        click(By.id("poll-level"));
        click(By.xpath("//option[@value='10']"));
        click(By.id("poll-is_national_project"));
        new Select(driver.findElement(By.id("poll-is_national_project"))).selectByVisibleText("Да");
        click(By.xpath("(//option[@value='1'])[2]"));
        driver.findElement(By.id("poll-form_date_from")).click();
        driver.findElement(By.xpath("//th[3]")).click();
        driver.findElement(By.xpath("//tr[6]/td[3]")).click();
        driver.findElement(By.id("poll-form_date_to")).click();
        driver.findElement(By.xpath("//tr[5]/td[5]")).click();
        type(By.id("pollquestion-0-title"), pollData.getQuestion_1());
        type(By.id("pollquestion-0-choice_amount"), pollData.getAnswer_quantity_1());
        type(By.id("pollquestionoption-0-0-value"), pollData.getAnswer_option_1_1());
        type(By.id("pollquestionoption-0-1-value"), pollData.getAnswer_option_1_2());
        type(By.id("pollquestionoption-0-2-value"), pollData.getAnswer_option_1_3());

    }

    public void initPollCreation()  {

        click(By.xpath("/html/body/main/div/div/div/div/div/p/a"));

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

    public void deletePoll() throws InterruptedException {

        click(By.linkText("Удалить"));
        Thread.sleep(1000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы действительно хотите удалить этот элемент[\\s\\S]$"));
        Thread.sleep(1000);

    }

    public void selectPoll() {

        click(By.linkText("Тестовый опрос"));
        acceptNextAlert = true;

    }

    public void initPollModification() {

        click(By.linkText("Редактировать"));

    }

    public void submitPollModification() {

        click(By.xpath("//button[@type='submit']"));
        WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(element));

    }

    public void checkElements() {

        driver.findElement(By.tagName("h1"));
        driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/p/a[1]"));
        driver.findElement(By.className("poll-view"));

    }

    public void publishPoll(){
        
        click(By.linkText("Опубликовать"));

    }

}


