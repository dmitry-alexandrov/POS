package com.example.tests.test;
import com.example.tests.model.ContestData;
import com.example.tests.model.ProjectData;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProjectDeletionTests extends TestBase {


    @Test
    public void testProjectDeletion() throws Exception {

        //Установка даты начала и окончания проведения опроса
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        String date_start = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.MONTH, +1); //Увеличение месяца на +1
        String date_end = dateFormat.format(calendar.getTime());

        app.getNavigationHelper().gotoContestListPage();
        app.getContestHelper().initContestCreation();


        app.getContestHelper().fillContestForm(new ContestData("Тестовый конкурс (проект для удаления)", "Муниципальный", "Нижегородская", "Нижний Новгород", date_start, date_end, "1", "1", "Благо"));
        app.getContestHelper().submitContestCreation();

        app.getNavigationHelper().gotoContestListPage();
        app.getProjectHelper().initProjectCreationDelete();
        app.getProjectHelper().initProjectCreation();
        app.getProjectHelper().fillProjectForm(new ProjectData("Проект (для удаления)", "Описание тестового проекта 1 (для удаления)", "Благоустройство", date_start, date_end, "1000000"));
        app.getProjectHelper().submitProjectCreation();
        //app.getPollHelper().waitPollCreation();

        app.getNavigationHelper().gotoContestListPage();
        app.getProjectHelper().initProjectCreationDelete();
        app.getProjectHelper().selectProjectDelete();
        app.getProjectHelper().deleteProject();
    }

}
