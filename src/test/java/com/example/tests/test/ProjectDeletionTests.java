package com.example.tests.test;
import com.example.tests.model.ProjectData;
import org.testng.annotations.Test;

public class ProjectDeletionTests extends TestBase {


    @Test
    public void testProjectDeletion() throws Exception {
        app.getNavigationHelper().gotoContestListPage();
        app.getProjectHelper().initProjectCreation();
        app.getProjectHelper().fillProjectForm(new ProjectData("Проект 1", "Описание тестового проекта 1", "1000000", "Пожарная безопасность"));
        app.getProjectHelper().submitProjectCreation();

        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().selectContest();
        app.getProjectHelper().selectProject();
        app.getProjectHelper().deleteProject();
    }

}
