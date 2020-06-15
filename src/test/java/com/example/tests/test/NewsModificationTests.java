package com.example.tests.test;
import com.example.tests.model.NewsData;
import org.testng.annotations.Test;

import java.io.File;

public class NewsModificationTests extends TestBase {

    @Test
    public void testNewsModification() throws InterruptedException {
        app.getNavigationHelper().gotoNewsListPage();
        app.getNewsHelper().selectNews();
        app.getNewsHelper().initNewsModification();
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getNewsHelper().modifyNewsForm(new NewsData("Новость тест ред.", "Описание новости ред.", "Ярославская", null, "Ярославль"));
        app.getNewsHelper().submitNewsModification();
    }

}
