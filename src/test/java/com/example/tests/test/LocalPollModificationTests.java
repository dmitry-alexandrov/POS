package com.example.tests.test;

import com.example.tests.model.LocalPollData;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalPollModificationTests extends TestBase {

    @Test
    public void testLocalPollModification() throws Exception {

        //Установка даты начала и окончания проведения опроса
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());

        //Создание обсуждения(опроса)
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().initLocalPollCreation();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalPollHelper().fillMinimumLocalPollForm(new LocalPollData("Тестовое обсуждение (опрос) для редактирования", "Описание описание тестового обсуждения (опрос)", "Ярославская область", "Ярославль", date_start, date_end, "Да", "Приложение", "Описание приложения", attachment_document_1, "Выбор варианта ответа", "Тестовый вопрос", "1", "Тестовый вариант ответа"));
        app.getLocalPollHelper().submitLocalPollCreation();
        String date_start_2 = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end_2 = dateFormat.format(calendar.getTime());
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().selectLocalPollModify();
        app.getLocalPollHelper().initLocalPollModification();
        app.getLocalPollHelper().modifyLocalPollForm(new LocalPollData("Тестовое обсуждение (опрос) отредактирован", "Описание обсуждения(опрос) отредактирован", "Московская область", "Балашиха", date_start_2, date_end_2, "Нет", "Приложение (отредактирован)", "Описание приложения (отредактирован)", attachment_document_1, "Выбор варианта ответа", "Тестовый вопрос отредактирован", "2", "Тестовый вариант ответа (отредактирован)"));
        app.getLocalPollHelper().submitLocalPollModification();

    }
}
