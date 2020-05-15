package com.example.tests.test;

import com.example.tests.model.ContestData;
import org.testng.annotations.Test;

public class ContestDeletionTests extends TestBase {

    @Test
    public void testContestDeletion() throws Exception {
        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().initContestCreation();
        app.getContestHelper().fillContestForm(new ContestData("Конкурс тест", "Муниципальный", "Ярославская", "Ярославль", "1", "1", "Пожарная"));
        app.getContestHelper().submitContestCreation();

        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().selectContest();
        app.getContestHelper().deleteContest();
    }

}
