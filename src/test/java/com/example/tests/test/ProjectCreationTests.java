package com.example.tests.test;

import com.example.tests.model.ContestData;
import com.example.tests.model.ProjectData;
import org.testng.annotations.*;

public class ProjectCreationTests extends TestBase {

    @Test
    public void testProjectCreation() throws Exception {
        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().initContestCreation();
    //    app.getContestHelper().fillContestForm(new ContestData("Конкурс тест", "Муниципальный", "Московская", "Балашиха", "1", "1", "Пожарная"));
        app.getContestHelper().submitContestCreation();

        app.getNavigationHelper().gotoContestListPage();
        app.getProjectHelper().initProjectCreation();
        app.getProjectHelper().fillProjectForm(new ProjectData("Проект 1", "Описание тестового проекта 1", "1000000", "Пожарная безопасность"));
        app.getProjectHelper().submitProjectCreation();
        //app.getPollHelper().waitPollCreation();
        app.getNavigationHelper().gotoContestListPage();
        app.getProjectHelper().initProjectCreation();
        app.getProjectHelper().fillProjectForm(new ProjectData("Проект 2", "Описание тестового проекта 2", "1000000", "Пожарная безопасность"));
        app.getProjectHelper().submitProjectCreation();
    }

}
