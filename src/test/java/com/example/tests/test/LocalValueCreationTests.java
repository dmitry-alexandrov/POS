package com.example.tests.test;

import com.example.tests.model.LocalValueData;
import org.testng.annotations.Test;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalValueCreationTests extends TestBase {

    @Test
    public void testLocalValueCreation() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().initLocalValueCreation();

        //Установка даты начала и окончания проведения обсуждения (оценки)
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());

        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalValueHelper().fillLocalValueForm(new LocalValueData("Тестовая оценка МЗ", "Описание оценки МЗ тест", "Ярославская область", "Ярославль", date_start, date_end, "Приложение_1", "Описание приложения_1", attachment_document_1, "1", "8"));
        app.getLocalValueHelper().submitLocalValueCreation();

    }

}
