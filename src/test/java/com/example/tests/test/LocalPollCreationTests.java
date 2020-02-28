package com.example.tests.test;

import com.example.tests.model.LocalPollData;
import com.example.tests.test.TestBase;
import org.testng.annotations.*;
import java.io.File;

public class LocalPollCreationTests extends TestBase {


  @Test
  public void testLocalPollCreation() throws Exception {
    app.getNavigationHelper().gotoLocalEntitysPage();
    app.getLocalPollHelper().initLocalPollCreation();
    File attachment_document_1 = new File("src/test/resources/тест.docx");
    app.getLocalPollHelper().fillLocalPollForm(new LocalPollData("Опрос МЗ тест", "Описание опроса МЗ тест", "Ярославская", "Ярославль", "Приложение_1", "Описание_приложения_1", attachment_document_1, "1", "1", "2"));
    app.getLocalPollHelper().submitLocalPollCreation();
  }

}
