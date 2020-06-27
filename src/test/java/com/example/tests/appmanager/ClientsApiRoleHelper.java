package com.example.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.tests.model.ClientsApiRoleData;

    public class ClientsApiRoleHelper extends HelperBase {

        private boolean acceptNextAlert = true;

        public ClientsApiRoleHelper(WebDriver driver) {
            super(driver);
        }

        public void initClientsApiRoleCreation() throws InterruptedException {

            click(By.linkText("Создать Роль клиента API"));
            Thread.sleep(1000);

        }

        public void fillClientsApiRoleForm(ClientsApiRoleData clientsApiRoleData) {

            type(By.id("apiauthitem-name"), clientsApiRoleData.getClientApiRoleName());
            type(By.id("apiauthitem-description"), clientsApiRoleData.getClientApiRoleDescription());

        }

        public void submitClientsApiRoleCreation() throws InterruptedException {

            click(By.xpath("//button[@type='submit']"));
            Thread.sleep(1000);

        }


    }



