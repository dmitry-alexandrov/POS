package com.example.tests.test;

import com.example.tests.model.LocalPollData;
import com.example.tests.appmanager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

    public ApplicationManager getApp() {
        return app;
    }




}
