package com.example.tests.test;

import com.example.tests.model.EntitledData;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

    public class EntitledModificationTests extends TestBase {

        @Test
        public void testEntitledModification() throws Exception {

            app.getNavigationHelper().gotoEntitledListPage();
            app.getEntitledHelper().initEntitledCreation();
            app.getEntitledHelper().fillEntitledForm(new EntitledData("Тестовый уполномоченный (редактирование)", "Тестов Тест Тестович", "test1@test.com", "Активный пользователь", "12345678", "13195190117", "тестовая организация"));
            Thread.sleep(2000);
            app.getEntitledHelper().enterThroughEsia();
            Thread.sleep(1000);
            app.getEntitledHelper().submitEntitledCreation();

            app.getNavigationHelper().gotoEntitledListPage();
            app.getEntitledHelper().findCreatedEntitledModify();
            app.getEntitledHelper().clickEyeEntitled();
            app.getEntitledHelper().modifyEntitled();
            app.getEntitledHelper().modifyEntitledForm(new EntitledData("Тестовый уполномоченный (отредактирован)", "Тестов Тест Тестович (отредактирован)", "test2@test.com", "Активный пользователь", "123456789", "13195191118", null));
            app.getEntitledHelper().submitEntitledModification();
        }

    }



