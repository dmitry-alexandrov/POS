package com.example.tests.test;
import com.example.tests.model.LocalDiscussionData;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalDiscussionDeletionTests extends TestBase {

    @Test
    public void testLocalDiscussionDeletion() throws Exception {

        //Установка даты начала и окончания проведения опроса
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());


        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalDiscussionHelper().initLocalDiscussionCreation();
        File attachment_document = new File("src/test/resources/тест.docx");
        app.getLocalDiscussionHelper().fillLocalDiscussionForm(new LocalDiscussionData("Тестовое обсуждение (комментирование) для удаления", "Описание тестового обсуждения (комментирование)", "Ярославская область", "Ярославль", date_start,date_end, "Приложение ", "Описание приложения", attachment_document));
        app.getLocalDiscussionHelper().submitLocalDiscussionCreation();
        Thread.sleep(2000); //Костыль, надо исправить
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalDiscussionHelper().selectLocalDiscussionDelete();
        app.getLocalDiscussionHelper().deleteLocalDiscussion();
    }

}
