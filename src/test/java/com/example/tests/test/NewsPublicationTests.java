package com.example.tests.test;
import org.testng.annotations.Test;

public class NewsPublicationTests extends TestBase {


    @Test
    public void testNewsPublication() throws Exception {
        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().selectNews();
        app.getNewsHelper().publishNews();
    }

}
