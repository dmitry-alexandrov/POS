package com.example.tests.test;

import com.example.tests.model.PollData;
import org.testng.annotations.Test;

public class PollModificationTests extends TestBase {
    @Test
    public void testPollModification() {
        app.getNavigationHelper().gotoPollListPage();
        app.getPollHelper().selectPoll();
        app.getPollHelper().initPollModification();
        app.getPollHelper().modifyPollForm(new PollData("Тестовый опрос ред.", "Описание тестового опроса ред.", "Вопрос №1 ред.", "2", "Вариант ответа 1 ред.", "Вариант ответа 2 ред.", "Вариант ответа 3 ред.", "Вопрос №2 ред.", "3", "Вариант ответа 1 ред.", "Вариант ответа 2 ред.", "Вариант ответа 3 ред.", "Вариант ответа 4 ред."));
        app.getPollHelper().submitPollModification();
    }

}
