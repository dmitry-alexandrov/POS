package com.example.tests.test;

import com.example.tests.model.ClientsApiData;
import org.testng.annotations.Test;

public class ClientsApiCreationTests extends TestBase {

    @Test
    public void testClientsApiCreation() throws Exception {

        app.getNavigationHelper().gotoClientsApiListPage();
        app.getClientsApiHelper().initClientsApiCreation();
        app.getClientsApiHelper().fillClientsApiForm(new ClientsApiData("Тестовый клиент API"));
        app.getClientsApiHelper().generateNewToken();
        app.getClientsApiHelper().submitClientsApiCreation();

    }

}
