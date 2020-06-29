package com.example.tests.test;

import com.example.tests.model.EntitledRoleData;
import org.testng.annotations.Test;

    public class EntitledRoleModificationTests extends TestBase {

        @Test
        public void testEntitledRoleModification() throws Exception {

            app.getNavigationHelper().gotoEntitledRoleListPage();
            app.getEntitledRoleHelper().initEntitledRoleCreation();
            app.getEntitledRoleHelper().fillEntitledRoleForm(new EntitledRoleData("Тестовая роль (редактирование)", "Описание имени", "2349", "Региональный"));
            app.getEntitledRoleHelper().submitEntitledRoleCreation();

            app.getNavigationHelper().gotoEntitledRoleListPage();
            app.getEntitledRoleHelper().findCreatedEntitledRoleModify();
            app.getEntitledRoleHelper().clickEyeEntitledRole();
            app.getEntitledRoleHelper().modifyEntitledRole();
            app.getEntitledRoleHelper().modifyEntitledRoleForm(new EntitledRoleData("Тестовая роль (отредактирован)", "Описание имени (отредактирован)", "2339", "Региональный"));
            app.getEntitledRoleHelper().submitEntitledRoleModification();

        }

    }


