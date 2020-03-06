package com.example.tests.test;

import org.testng.annotations.Test;

public class LocalValueDeletionTests extends TestBase {

    @Test
    public void testLocalValueDeletion() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().selectLocalValue();
        app.getLocalValueHelper().deleteLocalValue();
    }

}
