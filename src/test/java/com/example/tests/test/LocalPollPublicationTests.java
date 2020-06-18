package com.example.tests.test;
import com.example.tests.model.LocalDiscussionData;

import com.example.tests.model.LocalPollData;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalPollPublicationTests extends TestBase {

    @Test
    public void testLocalDiscussionPublication() throws Exception {

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());

        //Создание обсуждения(опроса)
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().initLocalPollCreation();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalPollHelper().fillLocalPollForm(new LocalPollData("Тестовое обсуждение (опрос) для публикации", "Описание описание тестового обсуждения (опрос)", "Ярославская область", "Ярославль", date_start, date_end, "Да", "Приложение", "Описание приложения", attachment_document_1, "Выбор варианта ответа", "Тестовый вопрос", "1", "Тестовый вариант ответа"));
        app.getLocalPollHelper().submitLocalPollCreation();
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().selectLocalPollPublish();
        app.getLocalPollHelper().publishLocalPoll();
    }

}
