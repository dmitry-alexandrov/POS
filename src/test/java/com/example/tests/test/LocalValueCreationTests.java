package com.example.tests.test;

import com.example.tests.model.LocalValueData;
import org.testng.annotations.Test;

import java.io.File;

public class LocalValueCreationTests extends TestBase {

    @Test
    public void testLocalValueCreation() throws Exception {
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().initLocalValueCreation();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalValueHelper().fillLocalValueForm(new LocalValueData("Оценка МЗ тест", "Описание оценки МЗ тест", "Ярославская", "Ярославль", "Приложение_1", "Описание_приложения_1", attachment_document_1, "1", "8"));
        app.getLocalValueHelper().submitLocalValueCreation();
    }

}
