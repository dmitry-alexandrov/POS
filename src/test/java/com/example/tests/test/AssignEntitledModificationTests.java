package com.example.tests.test;

import com.example.tests.model.AssignEntitledData;
import com.example.tests.model.EntitledData;
import com.example.tests.model.EntitledRoleData;
import org.testng.annotations.Test;

    public class AssignEntitledModificationTests extends TestBase {

        @Test
        public void testAssignEntitledModification() throws Exception {

            //Создание уполномоченного
            app.getNavigationHelper().gotoEntitledListPage();
            app.getEntitledHelper().initEntitledCreation();
            app.getEntitledHelper().fillEntitledForm(new EntitledData("Тестовый уполномоченный 4 (ред.)", "Тестов Тест Тестович", "test4@test.ru", "Активный пользователь", "12345678", "13195193779", "тестовая организация"));
            app.getEntitledHelper().enterThroughEsia();
            app.getEntitledHelper().submitEntitledCreation();

            //Создание роли
            app.getNavigationHelper().gotoEntitledRoleListPage();
            app.getEntitledRoleHelper().initEntitledRoleCreation();
            app.getEntitledRoleHelper().fillEntitledRoleForm(new EntitledRoleData("Тестовая роль 4 (ред.)", "Описание тестовой роли", "2293", "Региональный"));
            app.getEntitledRoleHelper().submitEntitledRoleCreation();

            //Привязка роли и уполномоченного
            app.getNavigationHelper().gotoAssignEntitledListPage();
            app.getAssignEntitledHelper().initAssignEntitledCreation();
            app.getAssignEntitledHelper().fillAssignEntitledForm(new AssignEntitledData("Тестовый уполномоченный 4 (ред.)", "Тестовая роль 4 (ред.)"));
            app.getAssignEntitledHelper().submitAssignEntitledCreation();

            app.getNavigationHelper().gotoAssignEntitledListPage();
            app.getAssignEntitledHelper().findCreatedAssignEntitledModify();
            app.getAssignEntitledHelper().clickEyeAssignEntitled();
            app.getAssignEntitledHelper().modifyAssignEntitled();
            app.getAssignEntitledHelper().modifyAssignEntitledForm(new AssignEntitledData(null, "Уполномоченный региональный"));
            app.getAssignEntitledHelper().submitAssignEntitledModification();

        }

    }


