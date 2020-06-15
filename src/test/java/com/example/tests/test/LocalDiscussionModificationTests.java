package com.example.tests.test;

import com.example.tests.model.LocalDiscussionData;

import org.testng.annotations.Test;

import java.io.File;

public class LocalDiscussionModificationTests extends TestBase {

    @Test
    public void testLocalDiscussionModification() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalDiscussionHelper().selectLocalDiscussion();
        app.getLocalDiscussionHelper().initLocalDiscussionModification();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalDiscussionHelper().modifyLocalDiscussionForm(new LocalDiscussionData("1 Обсуждение документа МЗ тест ред.", "Описание обсуждения документа МЗ тест ред.", "Ярославская", "Ярославль", "Приложение_1 ред.", "Описание_приложения_1 ред.", attachment_document_1));
        app.getLocalDiscussionHelper().submitLocalDiscussionModification();
    }
}
