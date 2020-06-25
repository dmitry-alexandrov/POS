package com.example.tests.test;

import com.example.tests.model.ContestData;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ContestModificationTests extends TestBase {

    @Test
    public void testContestModification() throws InterruptedException {

        //Установка даты начала и окончания проведения опроса
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());

        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().initContestCreation();
        app.getContestHelper().fillContestForm(new ContestData("Тестовый конкурс (для редактирования)", "Муниципальный", "Новгородская", "Великий Новгород", date_start, date_end, "1", "1", "Пожарная"));
        app.getContestHelper().submitContestCreation();


        String date_start_2 = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end_2 = dateFormat.format(calendar.getTime());
        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().selectContestModify();
        app.getContestHelper().initContestModification();
        app.getContestHelper().modifyContestForm(new ContestData("Тестовый конкурс (Отредактирован)", "Муниципальный", "Московская", "Балашиха", date_start_2, date_end_2, "2", "2", "Туризм"));
        app.getContestHelper().submitContestModification();

    }


}
