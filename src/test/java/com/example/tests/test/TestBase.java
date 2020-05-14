package com.example.tests.test;

import com.example.tests.model.LocalPollData;
import com.example.tests.appmanager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestContext;
import org.testng.annotations.*;

//@Listeners(MyTestListener.class)
public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite(alwaysRun = true)
    public void setUp(ITestContext context) throws Exception {
        app.init();
        context.setAttribute("app", app);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

    public ApplicationManager getApp() {
        return app;
    }




}
