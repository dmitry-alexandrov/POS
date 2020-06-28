package com.example.tests.test;

import com.example.tests.model.OrganizationData;
import org.testng.annotations.Test;

    public class OrganizationCreationTests extends TestBase{

        @Test
        public void testOrganizationCreation() throws  Exception {

            app.getNavigationHelper().gotoOrganizationsListPage();
            app.getOrganizationHelper().initOrganizationCreation();
            app.getOrganizationHelper().fillOrganizationForm(new OrganizationData("Тест. орг.", "Тестовая организация", "1025007732022", "8605004222", "526001222", "Государственное учереждение", "12345", "Тестовый адрес", "Федеральный"));
            app.getOrganizationHelper().submitOrganizationCreation();

        }
    }


