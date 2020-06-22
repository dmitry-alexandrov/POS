package com.example.tests.test;

import com.example.tests.model.LocalDiscussionData;

import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalDiscussionModificationTests extends TestBase {

    @Test
    public void testLocalDiscussionModification() throws Exception {
        Thread.sleep(200); //Костыль, надо исправить
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalDiscussionHelper().initLocalDiscussionCreation();

        //Установка даты начала и окончания проведения опроса
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());

        File attachment_document = new File("src/test/resources/тест.docx");
        app.getLocalDiscussionHelper().fillLocalDiscussionForm(new LocalDiscussionData("Тестовое обсуждение (комментирование) для редактирования", "Описание тестового обсуждения (комментирование) для редактирования", "Ярославская область", "Ярославль", date_start, date_end, "Приложение", "Описание приложения", attachment_document));
        app.getLocalDiscussionHelper().submitLocalDiscussionCreation();
        Thread.sleep(2000); //Костыль, надо исправить
        String date_start_2 = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end_2 = dateFormat.format(calendar.getTime());
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalDiscussionHelper().selectLocalDiscussionModify();
        app.getLocalDiscussionHelper().initLocalDiscussionModification();
        app.getLocalDiscussionHelper().modifyLocalDiscussionForm(new LocalDiscussionData("Тестовое обсуждение (комментирование). Отредактирован", "Описание тестового обсуждения (комментирование) для редактирования. Отредактирован", "Московская область", "Балашиха", date_start_2, date_end_2, null, null, null));
        app.getLocalDiscussionHelper().submitLocalDiscussionModification();
        Thread.sleep(2000); //Костыль, надо исправить
    }
}
