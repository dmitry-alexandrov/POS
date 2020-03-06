package com.example.tests.test;


import com.example.tests.model.LocalValueData;

import org.testng.annotations.Test;

import java.io.File;


public class LocalValueModificationTests extends TestBase {

    @Test
    public void testLocalValueModification() throws InterruptedException {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().selectLocalValue();
        app.getLocalValueHelper().initLocalValueModification();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalValueHelper().modifyLocalValueForm(new LocalValueData("Оценка МЗ тест ред.", "Описание оценки МЗ тест ред.", "Ярославская", "Ярославль", "Приложение_1 ред.", "Описание_приложения_1 ред.", attachment_document_1, "1", "9"));
        app.getLocalValueHelper().submitLocalValueModification();
    }
}
