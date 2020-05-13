package com.example.tests.test;

import org.testng.annotations.Test;


public class NewsDeletionTests extends TestBase {

    @Test
    public void testNewsDeletion() throws Exception {
        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().selectNews();
        app.getNewsHelper().deleteNews();
    }

}
