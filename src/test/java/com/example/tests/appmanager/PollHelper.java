package com.example.tests.appmanager;

import com.example.tests.model.PollData;
//import com.sun.jdi.ByteType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

public class PollHelper extends HelperBase {

    public boolean acceptNextAlert = true;

    public PollHelper(WebDriver driver) {
      super(driver);
    }

    public void submitPollCreation() throws InterruptedException {
      click(By.xpath("//button[@type='submit']"));
      Thread.sleep(2000);
    }

    public void fillPollForm(PollData pollData) {
      type(By.id("poll-title"), pollData.getName());
      type(By.id("poll-description"), pollData.getDescription());
      click(By.id("poll-level"));
      click(By.xpath("//option[@value='10']"));
      click(By.id("poll-is_national_project"));
      new Select(driver.findElement(By.id("poll-is_national_project"))).selectByVisibleText("Да");





      click(By.xpath("(//option[@value='1'])[2]"));
      click(By.id("poll-form_date_from"));
      click(By.xpath("//tr[5]/td[3]"));
      click(By.id("poll-form_date_to"));
      click(By.xpath("//tr[6]/td[3]"));
      type(By.id("pollquestion-0-title"), pollData.getQuestion_1());
      type(By.id("pollquestion-0-choice_amount"), pollData.getAnswer_quantity_1());
      click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div/div/div/div[2]/div[3]/div[2]/div/div/button/span"));
      type(By.id("pollquestionoption-0-0-value"), pollData.getAnswer_option_1_1());
      type(By.id("pollquestionoption-0-1-value"), pollData.getAnswer_option_1_2());
      type(By.id("pollquestionoption-0-2-value"), pollData.getAnswer_option_1_3());
      click(By.xpath("(//button[@type='button'])[6]"));
      type(By.id("pollquestion-1-title"), pollData.getQuestion_2());
      type(By.id("pollquestion-1-choice_amount"), pollData.getAnswer_quantity_2());
      //*[@id="pollquestionoption-1-0-value"]
      click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div[2]/div[2]/div[3]/div[2]/div/div/button/span"));
      click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div[2]/div[2]/div[3]/div[2]/div/div/button/span"));
      //click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div[2]/div[2]/div[3]/div[2]/div/div/button/span"));
      type(By.id("pollquestionoption-1-0-value"), pollData.getAnswer_option_2_1());
      type(By.id("pollquestionoption-1-1-value"), pollData.getAnswer_option_2_2());
      type(By.id("pollquestionoption-1-2-value"), pollData.getAnswer_option_2_3());
      type(By.id("pollquestionoption-1-3-value"), pollData.getAnswer_option_2_4());
    }

    public void modifyPollForm(PollData pollData) {
        type(By.id("poll-title"), pollData.getName());
        type(By.id("poll-description"), pollData.getDescription());
        click(By.id("poll-level"));
        click(By.xpath("//option[@value='10']"));
        click(By.id("poll-is_national_project"));
        new Select(driver.findElement(By.id("poll-is_national_project"))).selectByVisibleText("Да");





        click(By.xpath("(//option[@value='1'])[2]"));
        click(By.id("poll-form_date_from"));
        click(By.xpath("//tr[3]/td[2]"));
        click(By.id("poll-form_date_to"));
        click(By.xpath("//tr[6]/td[2]"));
        type(By.id("pollquestion-0-title"), pollData.getQuestion_1());
        type(By.id("pollquestion-0-choice_amount"), pollData.getAnswer_quantity_1());
       // click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div/div/div/div[2]/div[3]/div[2]/div/div/button/span"));
        type(By.id("pollquestionoption-0-0-value"), pollData.getAnswer_option_1_1());
        type(By.id("pollquestionoption-0-1-value"), pollData.getAnswer_option_1_2());
        type(By.id("pollquestionoption-0-2-value"), pollData.getAnswer_option_1_3());
        //click(By.xpath("(//button[@type='button'])[6]"));
        type(By.id("pollquestion-1-title"), pollData.getQuestion_2());
        type(By.id("pollquestion-1-choice_amount"), pollData.getAnswer_quantity_2());
        //*[@id="pollquestionoption-1-0-value"]
       // click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div[2]/div[2]/div[3]/div[2]/div/div/button/span"));
        //click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div[2]/div[2]/div[3]/div[2]/div/div/button/span"));
       // click(By.xpath("//form[@id='dynamic-form']/div[11]/div/div[2]/div[2]/div[3]/div[2]/div/div/button/span"));
        type(By.id("pollquestionoption-1-0-value"), pollData.getAnswer_option_2_1());
        type(By.id("pollquestionoption-1-1-value"), pollData.getAnswer_option_2_2());
        type(By.id("pollquestionoption-1-2-value"), pollData.getAnswer_option_2_3());
        type(By.id("pollquestionoption-1-3-value"), pollData.getAnswer_option_2_4());
    }

    public void initPollCreation() throws InterruptedException {
      Thread.sleep(3000);
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

    public void submitPollModification() throws InterruptedException {
        Thread.sleep(1000);
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void checkElements() {

        driver.findElement(By.tagName("h1"));
        driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/p/a[1]"));
        driver.findElement(By.className("poll-view"));

    }

    public void publishPoll() throws InterruptedException{

        click(By.linkText("Опубликовать"));
        Thread.sleep(3000);

    }

}


