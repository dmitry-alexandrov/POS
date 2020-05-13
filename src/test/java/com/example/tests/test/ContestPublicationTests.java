package com.example.tests.test;

import com.example.tests.model.ContestData;
import org.testng.annotations.Test;

public class ContestPublicationTests  extends TestBase {

    @Test
    public void testContestPublication() throws InterruptedException {

        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().selectContest();
        app.getContestHelper().publishContest();
    }


}


