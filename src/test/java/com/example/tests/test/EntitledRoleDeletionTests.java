package com.example.tests.test;

import com.example.tests.model.EntitledRoleData;
import org.testng.annotations.Test;

    public class EntitledRoleDeletionTests extends TestBase {

        @Test
        public void testEntitledRoleDeletion() throws Exception {

            app.getNavigationHelper().gotoEntitledRoleListPage();
            app.getEntitledRoleHelper().initEntitledRoleCreation();
            app.getEntitledRoleHelper().fillEntitledRoleForm(new EntitledRoleData("Тестовая роль (для удаления)", "Описание имени", "2348", "Региональный"));
            app.getEntitledRoleHelper().submitEntitledRoleCreation();

            app.getNavigationHelper().gotoEntitledRoleListPage();
            app.getEntitledRoleHelper().findCreatedEntitledRoleDelete();
            app.getEntitledRoleHelper().clickEyeEntitledRole();
            app.getEntitledRoleHelper().deleteEntitledRole();

        }

    }



