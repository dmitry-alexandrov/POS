package com.example.tests.test;

import com.example.tests.model.AssignEntitledData;
import com.example.tests.model.EntitledData;
import com.example.tests.model.EntitledRoleData;
import org.testng.annotations.Test;

    public class AssignEntitledCreationTests extends TestBase {

        @Test
        public void testAssignEntitledCreation() throws Exception {

            //Создание уполномоченного
            app.getNavigationHelper().gotoEntitledListPage();
            app.getEntitledHelper().initEntitledCreation();
            app.getEntitledHelper().fillEntitledForm(new EntitledData("Тестовый уполномоченный 2", "Тестов Тест Тестович", "test@test.ru", "Активный пользователь", "12345678", "13195190779", "тестовая организация"));
            app.getEntitledHelper().enterThroughEsia();
            app.getEntitledHelper().submitEntitledCreation();

            //Создание роли
            app.getNavigationHelper().gotoEntitledRoleListPage();
            app.getEntitledRoleHelper().initEntitledRoleCreation();
            app.getEntitledRoleHelper().fillEntitledRoleForm(new EntitledRoleData("Тестовая роль 2", "Описание тестовой роли", "2345", "Региональный"));
            app.getEntitledRoleHelper().submitEntitledRoleCreation();

            //Привязка роли и уполномоченного
            app.getNavigationHelper().gotoAssignEntitledListPage();
            app.getAssignEntitledHelper().initAssignEntitledCreation();
            app.getAssignEntitledHelper().fillAssignEntitledForm(new AssignEntitledData("Тестовый уполномоченный 2", "Тестовая роль 2"));
            app.getAssignEntitledHelper().submitAssignEntitledCreation();

        }

    }






