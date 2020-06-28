package com.example.tests.test;

import com.example.tests.model.MunicipalityData;
import org.testng.annotations.Test;

public class MunicipalityCreationTests extends TestBase{

    @Test
    public void testMunicipalityCreation() throws  Exception {

        app.getNavigationHelper().gotoMunicipalitysListPage();
        app.getMunicipalityHelper().initMunicipalityCreation();
        app.getMunicipalityHelper().fillMunicipalityForm(new MunicipalityData("Тестовый муниципалитет", "001", "Ярославская область"));
        app.getMunicipalityHelper().submitMunicipalityCreation();

    }
}
