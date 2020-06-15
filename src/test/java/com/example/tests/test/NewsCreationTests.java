package com.example.tests.test;

import com.example.tests.model.NewsData;
import org.testng.annotations.*;

public class NewsCreationTests extends TestBase {

    @Test
    public  void testNewsCreation() throws Exception {

        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().initNewsCreation();
        app.getNewsHelper().fillNewsForm(new NewsData("Новость тест", "Описание новости", "Ярославская", "Муниципальный", "Ярославль"));
        app.getNewsHelper().submitNewsCreation();

    }

}
