package com.example.tests.test;
import com.example.tests.model.LocalDiscussionData;

import org.testng.annotations.Test;

import java.io.File;

public class LocalPollPublicationTests extends TestBase {

    @Test
    public void testLocalDiscussionPublication() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().selectLocalPoll();
        app.getLocalPollHelper().publishLocalPoll();
    }

}
