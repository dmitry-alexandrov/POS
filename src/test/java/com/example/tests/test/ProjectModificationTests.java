package com.example.tests.test;
import com.example.tests.model.ContestData;
import com.example.tests.model.ProjectData;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProjectModificationTests extends TestBase {

    @Test
    public void testProjectModification() throws InterruptedException {

        //Установка даты начала и окончания проведения опроса
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());

        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().initContestCreation();


        app.getContestHelper().fillContestForm(new ContestData("Тестовый конкурс (для редактирования проектов)", "Муниципальный", "Костромская", "Кострома", date_start, date_end, "1", "1", "ЖКХ"));
        app.getContestHelper().submitContestCreation();

        app.getNavigationHelper().gotoContestListPage();
        Thread.sleep(2000);
        app.getProjectHelper().initProjectCreationModify();
        app.getProjectHelper().initProject();
        Thread.sleep(2000);
        app.getProjectHelper().fillProjectForm(new ProjectData("Проект 1 (для редактирования)", "Описание тестового проекта 1 (для редактирования)", "ЖКХ", date_start, date_end, "1000000"));
        app.getProjectHelper().submitProjectCreation();
        //app.getPollHelper().waitPollCreation();

        String date_start_2 = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end_2 = dateFormat.format(calendar.getTime());
        app.getNavigationHelper().gotoContestListPage();
        app.getProjectHelper().initProjectCreationModify();
        app.getProjectHelper().selectProjectModify();
        app.getProjectHelper().initProjectModification();
        app.getProjectHelper().fillProjectFormModify(new ProjectData("Проект 1 (отредактирован)", "Описание тестового проекта 1 (отредактирован)", "ЖКХ", date_start_2, date_end_2, "2000000"));
        app.getProjectHelper().submitProjectCreation();
        Thread.sleep(2000);

    }

}
