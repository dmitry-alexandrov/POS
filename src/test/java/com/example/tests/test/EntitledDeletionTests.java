package com.example.tests.test;

import com.example.tests.model.EntitledData;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

    public class EntitledDeletionTests extends TestBase {

        @Test
        public void testEntitledDeletion() throws Exception {

            app.getNavigationHelper().gotoEntitledListPage();
            app.getEntitledHelper().initEntitledCreation();
            app.getEntitledHelper().fillEntitledForm(new EntitledData("Тестовый уполномоченный (для удаления)", "Тестов Тест Тестович", "test1@test.com", "Активный пользователь", "12345678", "13195190117", "тестовая организация"));
            Thread.sleep(2000);
            app.getEntitledHelper().enterThroughEsia();
            Thread.sleep(1000);
            app.getEntitledHelper().submitEntitledCreation();

            app.getNavigationHelper().gotoEntitledListPage();
            app.getEntitledHelper().findCreatedEntitledDelete();
            app.getEntitledHelper().clickEyeEntitled();
            app.getEntitledHelper().deleteEntitled();

        }

    }




