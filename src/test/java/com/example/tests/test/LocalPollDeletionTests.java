package com.example.tests.test;

import org.testng.annotations.Test;

public class LocalPollDeletionTests extends TestBase {

    @Test
    public void testLocalPollDeletion() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().selectLocalPoll();
        app.getLocalPollHelper().deleteLocalPoll();
    }

}
