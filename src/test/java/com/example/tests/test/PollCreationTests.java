package com.example.tests.test;

import com.example.tests.model.PollData;
import org.testng.annotations.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PollCreationTests extends TestBase {

  @Test
  public void testPollCreation_minFields() throws Exception {

      app.getNavigationHelper().gotoPollListPage();
      app.getPollHelper().initPollCreation();

      //Установка даты начала и окончания проведения опроса
      DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
      Calendar calendar = new GregorianCalendar();
      String date_start = dateFormat.format(calendar.getTime());
      calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
      String date_end = dateFormat.format(calendar.getTime());

      app.getPollHelper().fillMinimumPollForm(new PollData("Тестовый опрос (мин. полей)", "Описание тестового опроса", "Федеральный", "Да", date_start, date_end, "Да", "Выбор варианта ответа", "Тестовый вопрос", "1", null, "Тестовый Вариант ответа"));
      app.getPollHelper().submitPollCreation();
      app.getPollHelper().checkElements();

  }

    @Test
    public void testPollCreation_maxFields() throws Exception {

        app.getNavigationHelper().gotoPollListPage();
        app.getPollHelper().initPollCreation();

        //Установка даты начала и окончания проведения опроса
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());

        app.getPollHelper().fillMaximumPollForm(new PollData("Тестовый опрос (макс. полей)", "Описание тестового опроса", "Федеральный", "Да", date_start, date_end, "Да", "Выбор варианта ответа", "Тестовый вопрос", "1", null, "Тестовый Вариант ответа"));
        app.getPollHelper().submitPollCreation();
        app.getPollHelper().checkElements();

    }

}
