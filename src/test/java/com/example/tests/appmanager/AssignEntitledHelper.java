package com.example.tests.appmanager;

import com.example.tests.model.AssignEntitledData;
import org.openqa.selenium.*;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

    public class AssignEntitledHelper extends HelperBase {

        private boolean acceptNextAlert = true;

        public AssignEntitledHelper(WebDriver driver) {
            super(driver);
        }

        public  void submitAssignEntitledCreation() throws InterruptedException {
            click(By.xpath("//button[@type='submit']"));
            Thread.sleep(2000);
        }

        public void initAssignEntitledCreation() throws InterruptedException {

            click(By.linkText("Добавить новое назначение"));
            Thread.sleep(1000);

        }

        public void fillAssignEntitledForm(AssignEntitledData assignEntitledData) throws InterruptedException {

            select(By.id("authassignment-user_id"), assignEntitledData.getUser_id());
            select(By.id("authassignment-item_name"), assignEntitledData.getRole_name());

        }

        public void modifyAssignEntitledForm(AssignEntitledData assignEntitledData) throws InterruptedException {

           // select(By.id("authassignment-user_id"), assignEntitledData.getUser_id());
            select(By.id("authassignment-item_name"), assignEntitledData.getRole_name());

        }

        public  void findCreatedAssignEntitledDelete() throws InterruptedException {

            find(By.name("AuthAssignmentSearch[item_name]"), "Тестовая роль 3 (для удаления)");

        }

        public  void findCreatedAssignEntitledModify() throws InterruptedException {

            find(By.name("AuthAssignmentSearch[item_name]"), "Тестовая роль 4 (ред.)");

        }

        public void clickEyeAssignEntitled() throws InterruptedException {

            clickEye(By.cssSelector("span[class='glyphicon glyphicon-eye-open']"));

        }

        public void deleteAssignEntitled() throws InterruptedException {

            click(By.linkText("Удалить"));
            Thread.sleep(1000);
            assertTrue(closeAlertAndGetItsText().matches("^Вы уверены, что хотите удалить?[\\s\\S]$"));
            Thread.sleep(1000);

        }

        public void modifyAssignEntitled() throws InterruptedException {

            click(By.linkText("Редактировать"));
            Thread.sleep(1000);

        }

        public void submitAssignEntitledModification() throws InterruptedException {
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




