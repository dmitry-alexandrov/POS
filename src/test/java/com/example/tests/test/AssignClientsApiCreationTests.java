package com.example.tests.test;

import com.example.tests.model.AssignClientsApiData;
import com.example.tests.model.ClientsApiData;
import com.example.tests.model.ClientsApiRoleData;
import org.testng.annotations.Test;

    public class AssignClientsApiCreationTests extends TestBase {

        @Test
        public void testAssignClientsApiCreation() throws Exception {

            //Создание роли клиента API
            app.getNavigationHelper().gotoClientsApiRoleListPage();
            app.getClientsApiRoleHelper().initClientsApiRoleCreation();
            app.getClientsApiRoleHelper().fillClientsApiRoleForm(new ClientsApiRoleData("Тестовая роль API 2", "Описание тестовой роли API"));
            app.getClientsApiRoleHelper().submitClientsApiRoleCreation();

            //Создание клиента API
            app.getNavigationHelper().gotoClientsApiListPage();
            app.getClientsApiHelper().initClientsApiCreation();
            app.getClientsApiHelper().fillClientsApiForm(new ClientsApiData("Тестовый клиент API 2"));
            app.getClientsApiHelper().generateNewToken();
            app.getClientsApiHelper().submitClientsApiCreation();

            //Привязка роли и клиента
            app.getNavigationHelper().gotoAssignClientsApiListPage();
            app.getAssignClientsApiHelper().initAssignClientsApiCreation();
            app.getAssignClientsApiHelper().fillAssignClientsApiForm(new AssignClientsApiData("Тестовый клиент API 2", "Тестовая роль API 2"));
            app.getAssignClientsApiHelper().submitAssignClientsApiCreation();

        }

    }


