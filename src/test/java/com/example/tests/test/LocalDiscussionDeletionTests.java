package com.example.tests.test;
import com.example.tests.model.LocalDiscussionData;
import org.testng.annotations.Test;

import java.io.File;

public class LocalDiscussionDeletionTests extends TestBase {

    @Test
    public void testLocalDiscussionDeletion() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalDiscussionHelper().initLocalDiscussionCreation();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalDiscussionHelper().fillLocalDiscussionForm(new LocalDiscussionData("Обсуждение документа МЗ тест", "Описание обсуждения документа МЗ тест", "Ярославская", "Ярославль", "Приложение_1", "Описание_приложения_1", attachment_document_1));
        app.getLocalDiscussionHelper().submitLocalDiscussionCreation();

        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalDiscussionHelper().selectLocalDiscussion();
        app.getLocalDiscussionHelper().deleteLocalDiscussion();
    }

}
