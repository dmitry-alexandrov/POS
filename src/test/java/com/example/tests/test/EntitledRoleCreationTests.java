package com.example.tests.test;

import com.example.tests.model.EntitledRoleData;
import org.testng.annotations.Test;

public class EntitledRoleCreationTests extends TestBase {

    @Test
    public void testEntitledRoleCreation() throws Exception {

        app.getNavigationHelper().gotoEntitledRoleListPage();
        app.getEntitledRoleHelper().initEntitledRoleCreation();
        app.getEntitledRoleHelper().fillEntitledRoleForm(new EntitledRoleData("Тестовая роль", "Описание имени", "12345", "Региональный"));
        app.getEntitledRoleHelper().submitEntitledRoleCreation();

    }

}
