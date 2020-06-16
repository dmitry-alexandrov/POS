package com.example.tests.test;


import com.example.tests.model.LocalValueData;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class LocalValueModificationTests extends TestBase {

    @Test
    public void testLocalValueModification() throws InterruptedException {

        //Создание обсуждения (оценки) для модификации
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().initLocalValueCreation();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy"); //Установка даты начала и окончания проведения обсуждения (оценки)
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());
        File attachment_document_1 = new File("src/test/resources/тест.docx");
        app.getLocalValueHelper().fillLocalValueForm(new LocalValueData("Оценка МЗ тест для модификации", "Описание оценки МЗ тест", "Ярославская область", "Ярославль", date_start, date_end, "Приложение_1", "Описание приложения_1", attachment_document_1, "1", "8"));
        app.getLocalValueHelper().submitLocalValueCreation();

        //Модификация обсуждения (оценки)
        String date_start_modify = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end_modify = dateFormat.format(calendar.getTime());

        //Переход на страницу со списком обсуждений и выбор обсуждения (оценки) для модификации
        app.getNavigationHelper().gotoLocalEntitysPage();
        app.getLocalValueHelper().selectLocalValueModify();
        app.getLocalValueHelper().initLocalValueModification();
        File attachment_document_2 = new File("src/test/resources/тест.docx");
        app.getLocalValueHelper().modifyLocalValueForm(new LocalValueData("Оценка МЗ тест ред.", "Описание оценки МЗ тест ред.", "Ярославская", "Ярославль", date_start_modify, date_end_modify, "Приложение_1 ред.", "Описание_приложения_1 ред.", attachment_document_2, "1", "9"));
        app.getLocalValueHelper().submitLocalValueModification();//Модификация обсуждения(оценки)
    }
}
