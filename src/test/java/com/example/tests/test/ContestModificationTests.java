package com.example.tests.test;

import com.example.tests.model.ContestData;
import org.testng.annotations.Test;

public class ContestModificationTests extends TestBase {

    @Test
    public void testContestModification() throws InterruptedException {
        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().selectContest();
        app.getContestHelper().initContestModification();
        app.getContestHelper().modifyContestForm(new ContestData("Конкурс тест ред.", "Муниципальный", "Ярославская", "Ярославль", "2", "2", "Туризм"));
        app.getContestHelper().submitContestModification();
    }


}
