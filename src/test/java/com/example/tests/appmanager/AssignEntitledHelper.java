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

    }




