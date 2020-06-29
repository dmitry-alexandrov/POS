package com.example.tests.test;

import com.example.tests.model.AssignEntitledData;
import com.example.tests.model.EntitledData;
import com.example.tests.model.EntitledRoleData;
import org.testng.annotations.Test;

    public class AssignEntitledDeletionTests extends TestBase {

        @Test
        public void testAssignEntitledDeletion() throws Exception {

            //Создание уполномоченного
            app.getNavigationHelper().gotoEntitledListPage();
            app.getEntitledHelper().initEntitledCreation();
            app.getEntitledHelper().fillEntitledForm(new EntitledData("Тестовый уполномоченный 3 (для удаления)", "Тестов Тест Тестович", "test3@test.ru", "Активный пользователь", "12345678", "13195192779", "тестовая организация"));
            app.getEntitledHelper().enterThroughEsia();
            app.getEntitledHelper().submitEntitledCreation();

            //Создание роли
            app.getNavigationHelper().gotoEntitledRoleListPage();
            app.getEntitledRoleHelper().initEntitledRoleCreation();
            app.getEntitledRoleHelper().fillEntitledRoleForm(new EntitledRoleData("Тестовая роль 3 (для удаления)", "Описание тестовой роли", "2233", "Региональный"));
            app.getEntitledRoleHelper().submitEntitledRoleCreation();

            //Привязка роли и уполномоченного
            app.getNavigationHelper().gotoAssignEntitledListPage();
            app.getAssignEntitledHelper().initAssignEntitledCreation();
            app.getAssignEntitledHelper().fillAssignEntitledForm(new AssignEntitledData("Тестовый уполномоченный 3 (для удаления)", "Тестовая роль 3 (для удаления)"));
            app.getAssignEntitledHelper().submitAssignEntitledCreation();

            app.getNavigationHelper().gotoAssignEntitledListPage();
            app.getAssignEntitledHelper().findCreatedAssignEntitledDelete();
            app.getAssignEntitledHelper().clickEyeAssignEntitled();
            app.getAssignEntitledHelper().deleteAssignEntitled();

        }

    }




