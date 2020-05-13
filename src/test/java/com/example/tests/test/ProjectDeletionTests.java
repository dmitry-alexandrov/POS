package com.example.tests.test;
import org.testng.annotations.Test;

public class ProjectDeletionTests extends TestBase {


    @Test
    public void testProjectDeletion() throws Exception {
        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().selectContest();
        app.getProjectHelper().selectProject();
        app.getProjectHelper().deleteProject();
    }

}
