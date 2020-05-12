package com.example.tests.test;

import com.example.tests.model.LocalPollData;
import com.example.tests.appmanager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
        System.out.println("browser start");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
        System.out.println("browser stop");
    }

    public ApplicationManager getApp() {
        return app;
    }




}
