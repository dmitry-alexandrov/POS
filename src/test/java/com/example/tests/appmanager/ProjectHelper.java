package com.example.tests.appmanager;

import com.example.tests.model.ProjectData;
import io.opentracing.Span;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProjectHelper extends HelperBase {

    public ProjectHelper(WebDriver driver) {
        super(driver);
    }

    public void submitProjectCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void fillProjectForm(ProjectData projectData) throws InterruptedException {

        type(By.id("project-name"), projectData.getName());
        type(By.id("project-description"), projectData.getDescription());
        click(By.xpath("//span[@id='select2-project-sector_id-container']/span"));
        Thread.sleep(1000);

        List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"select2-project-sector_id-results\"]"));
        for (int i = 0; i < element.size(); i++) {
            String temp = element.get(i).getText();
            if (temp.equals("Пожарная безопасность")) {
                element.get(i).click();
                break;
            }
        }


        Thread.sleep(1000);
        driver.findElement(By.id("project-starts_at")).click();
        driver.findElement(By.xpath("//tr[6]/td")).click();
        driver.findElement(By.id("project-ends_at")).click();
        driver.findElement(By.xpath("//tr[6]/td")).click();
        type(By.id("project-budget"), projectData.getProjectBudget());

    }

    public void initProjectCreation() {
        click(By.linkText("Конкурс тест"));
        click(By.linkText("Добавить проект"));
    }

}
