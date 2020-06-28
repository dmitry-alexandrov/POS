package com.example.tests.test;

import com.example.tests.model.RegionData;
import org.testng.annotations.Test;

    public class RegionCreationTests extends TestBase {

        @Test
        public void testRegionCreation() throws Exception {

            app.getNavigationHelper().gotoRegionsListPage();
            app.getRegionHelper().initRegionCreation();
            app.getRegionHelper().fillRegionForm(new RegionData("Тестовый регион", "001"));
            app.getRegionHelper().submitRegionCreation();

        }

    }


