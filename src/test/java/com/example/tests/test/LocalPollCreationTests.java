package com.example.tests.test;

import com.example.tests.model.LocalPollData;
import com.example.tests.test.TestBase;
import org.testng.annotations.*;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalPollCreationTests extends TestBase {


  @Test
  public void testLocalPollCreation_minFields() throws Exception {

    //Установка даты начала и окончания проведения опроса
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    Calendar calendar = new GregorianCalendar();
    String date_start = dateFormat.format(calendar.getTime());
    calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
    String date_end = dateFormat.format(calendar.getTime());

    app.getNavigationHelper().gotoLocalEntitysPage();
    app.getLocalPollHelper().initLocalPollCreation();
    File attachment_document_1 = new File("src/test/resources/тест.docx");
    app.getLocalPollHelper().fillMinimumLocalPollForm(new LocalPollData("Тестовое обсуждение (опрос) (мин. полей)", "Описание описание тестового обсуждения (опрос)", "Ярославская область", "Ярославль", date_start, date_end, "Да", "Приложение", "Описание приложения", attachment_document_1, "Выбор варианта ответа", "Тестовый вопрос", "1", "Тестовый вариант ответа"));
    app.getLocalPollHelper().submitLocalPollCreation();
  }

  @Test
  public void testLocalPollCreation_maxFields() throws Exception {

    //Установка даты начала и окончания проведения опроса
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    Calendar calendar = new GregorianCalendar();
    String date_start = dateFormat.format(calendar.getTime());
    calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
    String date_end = dateFormat.format(calendar.getTime());

    app.getNavigationHelper().gotoLocalEntitysPage();
    app.getLocalPollHelper().initLocalPollCreation();
    File attachment_document_1 = new File("src/test/resources/тест.docx");
    app.getLocalPollHelper().fillMaximumLocalPollForm(new LocalPollData("Тестовое обсуждение (опрос) (макс. полей)", "Описание описание тестового обсуждения (опрос)", "Ярославская область", "Ярославль", date_start, date_end, "Да", "Приложение", "Описание приложения", attachment_document_1, "Выбор варианта ответа", "Тестовый вопрос", "1", "Тестовый вариант ответа"));
    app.getLocalPollHelper().submitLocalPollCreation();
  }

}
