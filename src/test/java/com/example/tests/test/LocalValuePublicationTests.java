package com.example.tests.test;
import com.example.tests.model.LocalDiscussionData;

import com.example.tests.model.LocalValueData;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LocalValuePublicationTests extends TestBase {

    @Test
    public void testLocalValuePublication() throws Exception {

        //Создание обсуждения (оценки) для публикации
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().initLocalValueCreation();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy"); //Установка даты начала и окончания проведения ооценки
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalValueHelper().fillLocalValueForm(new LocalValueData("Тестовая оценка МЗ тест (Опубликован)", "Описание оценки МЗ тест", "Ярославская область", "Ярославль", date_start, date_end, "Приложение_1", "Описание приложения_1", attachment_document_1, "1", "8"));
        app.getLocalValueHelper().submitLocalValueCreation();

        //Переход на страницу со списком обсуждений и выбор обсуждения (оценки) для публикации
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().selectLocalValuePublish();
        app.getLocalValueHelper().publishLocalValue(); //Публикация обсуждения (оценки)
    }

}
