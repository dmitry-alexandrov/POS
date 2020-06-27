package com.example.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.tests.model.ClientsApiData;

public class ClientsApiHelper extends HelperBase {

    private boolean acceptNextAlert = true;

    public ClientsApiHelper(WebDriver driver) {
        super(driver);
    }

    public void initClientsApiCreation() throws InterruptedException {

        click(By.linkText("Создать клиента API"));
        Thread.sleep(1000);

    }

    public void fillClientsApiForm(ClientsApiData clientsApiData) {

        type(By.id("externalsource-name"), clientsApiData.getClientApiName());

    }

    public void submitClientsApiCreation() throws InterruptedException {

        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);

    }

    public void generateNewToken() throws InterruptedException {

        click(By.linkText("Сгенерировать новый токен"));
        Thread.sleep(1000);

    }

}


