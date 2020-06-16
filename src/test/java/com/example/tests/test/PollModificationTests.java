package com.example.tests.test;

import com.example.tests.model.PollData;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PollModificationTests extends TestBase {

    @Test
    public void testPollModification() throws InterruptedException {

        //Создание опроса для публикации
        app.getNavigationHelper().gotoPollListPage();
        app.getPollHelper().initPollCreation();

        //Установка даты начала и окончания проведения опроса
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());
        app.getPollHelper().fillMinimumPollForm(new PollData("Тестовый опрос для модификации", "Описание тестового опроса", "Федеральный", "Да", date_start, date_end, "Да", "Выбор варианта ответа", "Тестовый вопрос", "1", null, "Тестовый Вариант ответа"));
        app.getPollHelper().submitPollCreation();
        app.getPollHelper().checkElements();


        app.getNavigationHelper().gotoPollListPage();
        app.getPollHelper().selectPollModify();
        app.getPollHelper().initPollModification();
        app.getPollHelper().modifyPollForm(new PollData("Тестовый опрос (Модифицирован)", "Описание тестового опроса (модифицирован)", "Федеральный", "Нет", date_start, date_end, "Нет", "Выбор варианта ответа", "Тестовый вопрос (модифицирован)", "2", null, "Тестовый вариант ответа (модифицирован)"));
        app.getPollHelper().submitPollModification();
        app.getPollHelper().checkElements();

    }

}
