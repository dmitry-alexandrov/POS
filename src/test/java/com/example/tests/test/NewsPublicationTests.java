package com.example.tests.test;
import com.example.tests.model.NewsData;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NewsPublicationTests extends TestBase {


    @Test
    public void testNewsPublication() throws Exception {

        //Установка даты
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date = dateFormat.format(calendar.getTime());
        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().initNewsCreation();
        app.getNewsHelper().fillNewsForm(new NewsData("Тестовая новость (для публикации)", "Описание тестовой новости (для публикации)", "Ярославская", "Муниципальный", "Ярославль", date, "test", "http://test.ru", null, null));
        app.getNewsHelper().submitNewsCreation();

        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().selectNewsPublish();
        app.getNewsHelper().publishNews();
        Thread.sleep(2000);
    }

}
