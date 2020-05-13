package com.example.tests.test;
import com.example.tests.model.ProjectData;
import org.testng.annotations.Test;

public class ProjectModificationTests extends TestBase {

    @Test
    public void testProjectModification() throws InterruptedException {
        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().selectContest();
        app.getProjectHelper().selectProject();
        app.getProjectHelper().initProjectModification();
        app.getProjectHelper().modifyProjectForm(new ProjectData("Проект 1 ред.", "Описание тестового проекта 1 ред.", "1000000", "Пожарная безопасность"));
        app.getProjectHelper().submitProjectModification();
    }

}
