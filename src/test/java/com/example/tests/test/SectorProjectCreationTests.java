package com.example.tests.test;

import com.example.tests.model.SectorProjectData;
import org.testng.annotations.Test;

    public class SectorProjectCreationTests extends TestBase{

        @Test
        public void testSectorProjectCreation() throws  Exception {

            app.getNavigationHelper().gotoSectorProjectsListPage();
            app.getSectorProjectHelper().initSectorProjectCreation();
            app.getSectorProjectHelper().addSpecialField();
            app.getSectorProjectHelper().fillSectorProjectForm(new SectorProjectData("Тестовый сектор проекта", "001", "Тестовое специальное поле", "Текст"));
            app.getSectorProjectHelper().submitSectorProjectCreation();

        }
    }



