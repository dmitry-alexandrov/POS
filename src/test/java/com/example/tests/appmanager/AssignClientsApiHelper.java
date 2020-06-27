package com.example.tests.appmanager;

import com.example.tests.model.AssignClientsApiData;
import org.openqa.selenium.*;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

    public class AssignClientsApiHelper extends HelperBase {

        private boolean acceptNextAlert = true;

        public AssignClientsApiHelper(WebDriver driver) {
            super(driver);
        }

        public  void submitAssignClientsApiCreation() throws InterruptedException {
            click(By.xpath("//button[@type='submit']"));
            Thread.sleep(1000);
        }

        public void initAssignClientsApiCreation() throws InterruptedException {

            click(By.linkText("Добавить новое назначение"));
            Thread.sleep(1000);

        }

        public void fillAssignClientsApiForm(AssignClientsApiData assignClientsApiData) throws InterruptedException {

            select(By.id("apiauthassignment-user_id"), assignClientsApiData.getUser_id());
            select(By.id("apiauthassignment-item_name"), assignClientsApiData.getRole_name());

        }

    }


