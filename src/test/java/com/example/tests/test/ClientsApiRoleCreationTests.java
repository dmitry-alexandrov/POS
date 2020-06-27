package com.example.tests.test;

import com.example.tests.model.ClientsApiRoleData;
import org.testng.annotations.Test;

    public class ClientsApiRoleCreationTests extends TestBase {

        @Test
        public void testClientsApiRoleCreation() throws Exception {

            app.getNavigationHelper().gotoClientsApiRoleListPage();
            app.getClientsApiRoleHelper().initClientsApiRoleCreation();
            app.getClientsApiRoleHelper().fillClientsApiRoleForm(new ClientsApiRoleData("Тестовая роль API", "Описание тестовой роли API"));
            app.getClientsApiRoleHelper().submitClientsApiRoleCreation();

        }
    }







