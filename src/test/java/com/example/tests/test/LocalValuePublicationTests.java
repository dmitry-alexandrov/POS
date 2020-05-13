package com.example.tests.test;
import com.example.tests.model.LocalDiscussionData;

import org.testng.annotations.Test;

import java.io.File;

public class LocalValuePublicationTests extends TestBase {

    @Test
    public void testLocalValuePublication() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().selectLocalValue();
        app.getLocalValueHelper().publishLocalValue();
    }

}
