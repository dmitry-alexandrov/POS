package com.example.tests.test;
import com.example.tests.model.NewsData;
import org.testng.annotations.Test;

public class NewsPublicationTests extends TestBase {


    @Test
    public void testNewsPublication() throws Exception {
        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().initNewsCreation();
        app.getNewsHelper().fillNewsForm(new NewsData("Новость тест", "Описание новости", "Ярославская", null, "Ярославль"));
        app.getNewsHelper().submitNewsCreation();

        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().selectNews();
        app.getNewsHelper().publishNews();
    }

}
