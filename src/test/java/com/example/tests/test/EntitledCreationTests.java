package com.example.tests.test;

import com.example.tests.model.EntitledData;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class EntitledCreationTests extends TestBase {

    @Test
    public void testEntitledCreation() throws Exception {

        app.getNavigationHelper().gotoEntitledListPage();
        app.getEntitledHelper().initEntitledCreation();
        app.getEntitledHelper().fillEntitledForm(new EntitledData("Тестовый уполномоченный", "Тестов Тест Тестович", "test@test.com", "Активный пользователь", "12345678", "13195190048", "тестовая организация"));
        Thread.sleep(2000);
        app.getEntitledHelper().enterThroughEsia();
        Thread.sleep(1000);
        app.getEntitledHelper().submitEntitledCreation();

    }

}
