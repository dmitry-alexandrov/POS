package com.example.tests.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.fail;

public class ApplicationManager {

    private final Properties properties;
    public static WebDriver driver;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private PollHelper pollHelper;
    private LocalPollHelper localPollHelper;
    private LocalValueHelper localValueHelper;
    private LocalDiscussionHelper localDiscussionHelper;
    private ContestHelper contestHelper;
    private ProjectHelper projectHelper;
    private NewsHelper newsHelper;
    private EntityFilterHelper entityFilterHelper;
    private EntitledHelper entitledHelper;
    private EntitledRoleHelper entitledRoleHelper;
    private AssignEntitledHelper assignEntitledHelper;
    private ClientsApiHelper clientsApiHelper;
    private ClientsApiRoleHelper clientsApiRoleHelper;
    private AssignClientsApiHelper assignClientsApiHelper;
    private RegionHelper regionHelper;
    private  MunicipalityHelper municipalityHelper;
    private SectorProjectHelper sectorProjectHelper;
    private OrganizationHelper organizationHelper;
    public String baseUrl;
    public StringBuffer verificationErrors = new StringBuffer();
    private String browser;

        public ApplicationManager(String browser) {

            this.browser = browser;
            properties = new Properties();

    }

    public void init() throws IOException
    {
        System.out.println("inside init");
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));

            if ("".equals(properties.getProperty("selenium.server"))) {

                if (browser.equals(BrowserType.FIREFOX)) {
                    //System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
                    driver = new FirefoxDriver();

                } else if (browser.equals(BrowserType.CHROME)) {

                    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
                    //"/usr/local/bin/chromedriver" "C:\\Tools\\Tools\\chromedriver.exe"
                    driver = new ChromeDriver();

                } else if (browser.equals(BrowserType.IE)) {

                    System.setProperty("webdriver.ie.driver", "C:\\Tools\\Tools\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                }

            } else {

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setBrowserName(browser);
                driver = new RemoteWebDriver(new URL(properties.getProperty("selenium.server")), capabilities);

            }

        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://pos.maxitlab.com/og/login");
        pollHelper = new PollHelper(driver);
        localPollHelper = new LocalPollHelper(driver);
        localValueHelper = new LocalValueHelper(driver);
        localDiscussionHelper = new LocalDiscussionHelper(driver);
        contestHelper = new ContestHelper(driver);
        projectHelper = new ProjectHelper(driver);
        newsHelper = new NewsHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        entityFilterHelper = new EntityFilterHelper(driver);
        entitledHelper = new EntitledHelper(driver);
        entitledRoleHelper = new EntitledRoleHelper(driver);
        assignEntitledHelper = new AssignEntitledHelper(driver);
        clientsApiHelper = new ClientsApiHelper(driver);
        clientsApiRoleHelper = new ClientsApiRoleHelper(driver);
        assignClientsApiHelper = new AssignClientsApiHelper(driver);
        regionHelper = new RegionHelper(driver);
        municipalityHelper = new MunicipalityHelper(driver);
        sectorProjectHelper = new SectorProjectHelper(driver);
        organizationHelper = new OrganizationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "APwM$25Ek4pEfXu1N");
        //Resize the current window to the given dimension
        Dimension d = new Dimension(1920,1080);
        driver.manage().window().setSize(d);

    }



    public void stop() {

            driver.quit();
            String verificationErrorString = verificationErrors.toString();

                if (!"".equals(verificationErrorString)) {

                    fail(verificationErrorString);

                }
    }

  // public boolean isElementPresent(By by) {
  //          try {
//
  //              driver.findElement(by);
  //              return true;
//
 //           } catch (NoSuchElementException e) {
//
 //               return false;

  //          }
 //   }

    public PollHelper getPollHelper() {

        return pollHelper;

    }

    public LocalPollHelper getLocalPollHelper() {

            return localPollHelper;

        }

    public LocalValueHelper getLocalValueHelper() {

            return localValueHelper;

        }

    public LocalDiscussionHelper getLocalDiscussionHelper() {

            return localDiscussionHelper;

        }

    public ContestHelper getContestHelper() {

            return  contestHelper;

        }

    public ProjectHelper getProjectHelper() {

            return projectHelper;

        }

    public NewsHelper getNewsHelper() {

            return  newsHelper;

        }

    public NavigationHelper getNavigationHelper() {

            return navigationHelper;

    }

    public EntityFilterHelper getEntityFilterHelper() {

            return entityFilterHelper;

    }

    public EntitledHelper getEntitledHelper() {

            return entitledHelper;

    }

    public EntitledRoleHelper getEntitledRoleHelper() {

        return entitledRoleHelper;

    }

    public AssignEntitledHelper getAssignEntitledHelper() {

        return assignEntitledHelper;

    }

    public  ClientsApiHelper getClientsApiHelper() {

            return clientsApiHelper;

    }

    public  ClientsApiRoleHelper getClientsApiRoleHelper() {

            return clientsApiRoleHelper;

    }

    public  AssignClientsApiHelper getAssignClientsApiHelper() {

            return assignClientsApiHelper;

    }

    public RegionHelper getRegionHelper() {

        return regionHelper;

    }

    public MunicipalityHelper getMunicipalityHelper() {

            return municipalityHelper;

    }

    public SectorProjectHelper getSectorProjectHelper() {

            return sectorProjectHelper;

    }

    public OrganizationHelper getOrganizationHelper() {

            return organizationHelper;

    }

    public byte[] takeScreenshot() {

            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

    }
}
