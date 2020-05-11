package com.example.tests.test;

import com.example.tests.model.PollData;
import org.testng.annotations.*;

public class PollCreationTests extends TestBase {

  @Test
  public void testPollCreation() throws Exception {

    app.getNavigationHelper().gotoPollListPage();
    app.getPollHelper().initPollCreation();
    app.getPollHelper().fillPollForm(new PollData("Тестовый опрос1", "Описание тестового опроса", "Вопрос №1", "2", "Вариант ответа 1", "Вариант ответа 2", "Вариант ответа 3", "Вопрос №2", "3", "Вариант ответа 1", "Вариант ответа 2", "Вариант ответа 3", "Вариант ответа 4"));
    app.getPollHelper().submitPollCreation();
    app.getPollHelper().checkElements();
  }

}
