package com.example.tests.test;
import com.example.tests.model.LocalDiscussionData;

import com.example.tests.model.LocalPollData;
import org.testng.annotations.Test;

import java.io.File;

public class LocalPollPublicationTests extends TestBase {

    @Test
    public void testLocalDiscussionPublication() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().initLocalPollCreation();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalPollHelper().fillLocalPollForm(new LocalPollData("Тестовый опрос мз тест", "Описание опроса МЗ тест", "Ярославская", "Ярославль", "Приложение_1", "Описание_приложения_1", attachment_document_1, "1", "1", "2"));
        app.getLocalPollHelper().submitLocalPollCreation();

        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalPollHelper().selectLocalPoll();
        app.getLocalPollHelper().publishLocalPoll();
    }

}
