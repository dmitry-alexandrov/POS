package com.example.tests.test;

import com.example.tests.model.LocalPollData;
import org.testng.annotations.Test;

import java.io.File;

public class LocalPollModificationTests extends TestBase {

    @Test
    public void testLocalPollModification() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().selectLocalPoll();
        app.getLocalPollHelper().initLocalPollModification();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalPollHelper().modifyLocalPollForm(new LocalPollData("Тестовый опрос мз тест ред.", "Описание опроса МЗ тест ред.", "Ярославская", "Ярославль", "Приложение_1 ред.", "Описание_приложения_1 ред.", attachment_document_1, "1", "1", "2"));
        app.getLocalPollHelper().submitLocalPollModification();

    }
}
