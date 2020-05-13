package com.example.tests.test;
import com.example.tests.model.LocalDiscussionData;
import org.testng.annotations.Test;

import java.io.File;

public class LocalDiscussionDeletionTests extends TestBase {

    @Test
    public void testLocalDiscussionDeletion() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalDiscussionHelper().selectLocalDiscussion();
        app.getLocalDiscussionHelper().deleteLocalDiscussion();
    }

}
