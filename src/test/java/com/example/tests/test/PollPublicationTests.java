package com.example.tests.test;
import org.testng.annotations.Test;


public class PollPublicationTests extends TestBase {

    @Test
    public void testPollPublication() throws Exception {
        app.getNavigationHelper().gotoPollListPage();
        app.getPollHelper().selectPoll();
        app.getPollHelper().publishPoll();
    }

}
