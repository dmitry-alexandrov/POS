package com.example.tests.appmanager;

import com.example.tests.model.EntitledData;
import org.openqa.selenium.*;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

public class EntitledHelper extends HelperBase {

    private boolean acceptNextAlert = true;

    public EntitledHelper(WebDriver driver) {
        super(driver);
    }

    public  void submitEntitledCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void initEntitledCreation() throws InterruptedException {

        click(By.linkText("Создать уполномоченного"));
        Thread.sleep(1000);

    }

    public void fillEntitledForm(EntitledData entitledData) throws InterruptedException {

        type(By.id("user-username"), entitledData.getName());
        type(By.id("user-fullname"), entitledData.getFio());
        type(By.id("user-email"), entitledData.getEmail());
        select(By.id("user-status"), entitledData.getStatus());
        type(By.cssSelector("input[name='user-password']"), entitledData.getPassword());
        type(By.id("user-snils"), entitledData.getSnils());
        select_2(By.xpath("//span[@id='select2-user-organisation_id-container']/span"), By.xpath("//input[@type='search']"), entitledData.getOrganization());

    }

    public void modifyEntitledForm(EntitledData entitledData) throws InterruptedException {

        type(By.id("user-username"), entitledData.getName());
        type(By.id("user-fullname"), entitledData.getFio());
        type(By.id("user-email"), entitledData.getEmail());
        select(By.id("user-status"), entitledData.getStatus());
        type(By.cssSelector("input[name='user-password']"), entitledData.getPassword());
        type(By.id("user-snils"), entitledData.getSnils());
     //   select_2(By.xpath("//span[@id='select2-user-organisation_id-container']/span"), By.xpath("//input[@type='search']"), entitledData.getOrganization());

    }

    public void enterThroughEsia() throws InterruptedException {

        click(By.id("user-without_esia"));

    }

    public  void findCreatedEntitledDelete() throws InterruptedException {

        find(By.name("UserSearch[username]"), "Тестовый уполномоченный (для удаления)");

    }

    public  void findCreatedEntitledModify() throws InterruptedException {

        find(By.name("UserSearch[username]"), "Тестовый уполномоченный (редактирование)");

    }

    public void clickEyeEntitled() throws InterruptedException {

        clickEye(By.cssSelector("span[class='glyphicon glyphicon-eye-open']"));

    }

    public void deleteEntitled() throws InterruptedException {

        click(By.linkText("Удалить"));
        Thread.sleep(1000);
        assertTrue(closeAlertAndGetItsText().matches("^Вы точно хотите удалить эту запись?[\\s\\S]$"));
        Thread.sleep(1000);

    }

    public void modifyEntitled() throws InterruptedException {

        click(By.linkText("Редактировать"));
        Thread.sleep(1000);

    }

    public void submitEntitledModification() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
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
}
