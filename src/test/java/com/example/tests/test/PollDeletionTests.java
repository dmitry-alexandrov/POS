package com.example.tests.test;


import com.example.tests.model.PollData;
import org.testng.annotations.Test;


public class PollDeletionTests extends TestBase {

  @Test
  public void testPollDeletion() throws Exception {
    app.getNavigationHelper().gotoPollListPage();
    app.getPollHelper().initPollCreation();
    app.getPollHelper().fillPollForm(new PollData("Тестовый опрос", "Описание тестового опроса", "Вопрос №1", "2", "Вариант ответа 1", "Вариант ответа 2", "Вариант ответа 3", "Вопрос №2", "3", "Вариант ответа 1", "Вариант ответа 2", "Вариант ответа 3", "Вариант ответа 4"));
    app.getPollHelper().submitPollCreation();
    app.getPollHelper().checkElements();

    app.getNavigationHelper().gotoPollListPage();
    app.getPollHelper().selectPoll();
    app.getPollHelper().deletePoll();
  }

}
