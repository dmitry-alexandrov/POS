package com.example.tests.test;
import com.example.tests.model.NewsData;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NewsModificationTests extends TestBase {

    @Test
    public void testNewsModification() throws InterruptedException {

        //Установка даты
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date = dateFormat.format(calendar.getTime());
        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().initNewsCreation();
        app.getNewsHelper().fillNewsForm(new NewsData("Тестовая новость (для редактирования)", "Описание тестовой новости (для редактирования)", "Ярославская", "Муниципальный", "Ярославль", date, "test", "http://test.ru", null, null));
        app.getNewsHelper().submitNewsCreation();

        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_2 = dateFormat.format(calendar.getTime());

        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().selectNewsModify();
        app.getNewsHelper().initNewsModification();
        app.getNewsHelper().modifyNewsForm(new NewsData("Тестовая новость (Отредактирован)", "Описание тестовой новости (Отредактирован)", "Московская", "Муниципальный", "Балашиха", date_2, "test", "http://test.ru", null, null));
        app.getNewsHelper().submitNewsModification();
        Thread.sleep(2000);
    }

}
