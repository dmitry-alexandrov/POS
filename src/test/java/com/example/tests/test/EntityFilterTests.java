package com.example.tests.test;

import com.example.tests.model.EntityFilterData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EntityFilterTests extends TestBase {

    //Проверка работы поля фильтра "Поиск по названию"
    @Test
    public void testPollFilterByName() {
        app.getNavigationHelper().gotoPollListPage();
        app.getEntityFilterHelper().initEntityFilter();
        app.getEntityFilterHelper().fillFieldSearchByName(new EntityFilterData("Опрос 1 API", null, null, null, null, null, null, null));
        app.getEntityFilterHelper().submitEntityFilter();
        app.getEntityFilterHelper().checkElementsSearchByName();
    }

    //Проверка работы выпадающего списка фильтра "Уровень"
    @Test
    public void testPollFilterByLevel() {
        app.getNavigationHelper().gotoPollListPage();
        app.getEntityFilterHelper().initEntityFilter();
        app.getEntityFilterHelper().fillFieldSearchByLevel(new EntityFilterData(null, "Федеральный", null, null, null, null, null, null));
        app.getEntityFilterHelper().submitEntityFilter();
        app.getEntityFilterHelper().checkElementsSearchByLevel();
    }

    //Проверка работы выпадающего списка фильтра "Регион"
    @Test
    public void testPollFilterByRegion() throws InterruptedException {
        app.getNavigationHelper().gotoPollListPage();
        app.getEntityFilterHelper().initEntityFilter();
        app.getEntityFilterHelper().fillFieldSearchByLevel(new EntityFilterData(null, "Региональный", null, null, null, null, null, null));
        app.getEntityFilterHelper().fillFieldSearchByRegion(new EntityFilterData(null, null, "Ярославская область", null, null, null, null, null));
        app.getEntityFilterHelper().submitEntityFilter();
        app.getEntityFilterHelper().checkElementsSearchByRegion();
   }

    //Проверка работы выпадающего списка фильтра "Муниципалитет"
    @Test
    public void testPollFilterByMunicipality() throws InterruptedException {
        app.getNavigationHelper().gotoPollListPage();
        app.getEntityFilterHelper().initEntityFilter();
        app.getEntityFilterHelper().fillFieldSearchByLevel(new EntityFilterData(null, "Муниципальный", null, null, null, null, null, null));
        app.getEntityFilterHelper().fillFieldSearchByRegion(new EntityFilterData(null, null, "Московская область", null, null, null, null, null));
        app.getEntityFilterHelper().fillFieldSearchByMunicipality(new EntityFilterData(null, null, null, "Волоколамский муниципальный район", null, null, null, null));
        app.getEntityFilterHelper().submitEntityFilter();
        app.getEntityFilterHelper().checkElementsSearchByMunicipality();
    }

    //Проверка работы выпадающего списка фильтра "Статус"
    @Test
    public void testPollFilterByStatus() {
        app.getNavigationHelper().gotoPollListPage();
        app.getEntityFilterHelper().initEntityFilter();
        app.getEntityFilterHelper().fillFieldSearchByStatus(new EntityFilterData(null, null, null, null, "Черновик", null, null, null));
        app.getEntityFilterHelper().submitEntityFilter();
        app.getEntityFilterHelper().checkElementsSearchByStatus();
    }

    //Проверка работы выпадающего списка фильтра "Тип"
    @Test
    public void testPollFilterByType() {
        app.getNavigationHelper().gotoPollListPage();
        app.getEntityFilterHelper().initEntityFilter();
        app.getEntityFilterHelper().fillFieldSearchByType(new EntityFilterData(null, null, null, null, null, "Опрос удовлетворенности", null, null));
        app.getEntityFilterHelper().submitEntityFilter();
        app.getEntityFilterHelper().checkElementsSearchByType();
    }

    //Проверка работы полей фильтра "Начало интервала" и "Конец интервала"
    @Test
    public void testPollFilterByInterval() {
        app.getNavigationHelper().gotoPollListPage();
        app.getEntityFilterHelper().initEntityFilter();
        app.getEntityFilterHelper().fillFieldSearchByInterval(new EntityFilterData(null, null, null, null, null, null, "01.06.2021", "31.07.2021"));
        app.getEntityFilterHelper().submitEntityFilter();
        app.getEntityFilterHelper().checkElementsSearchByInterval();
    }

}
