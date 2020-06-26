package com.example.tests.appmanager;

        import com.example.tests.model.EntitledRoleData;
        import org.openqa.selenium.*;

        import static org.testng.Assert.assertTrue;

public class EntitledRoleHelper extends HelperBase {

    private boolean acceptNextAlert = true;

    public EntitledRoleHelper(WebDriver driver) {
        super(driver);
    }

    public  void submitEntitledRoleCreation() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void initEntitledRoleCreation() throws InterruptedException {

        click(By.linkText("Создать Роль"));
        Thread.sleep(1000);

    }

    public void fillEntitledRoleForm(EntitledRoleData assigneeRoleData) throws InterruptedException {

        type(By.id("authitem-name"), assigneeRoleData.getName());
        type(By.id("authitem-description"), assigneeRoleData.getDescription());
        type(By.id("authitem-code"), assigneeRoleData.getKod());
        select(By.id("authitem-rulename"), assigneeRoleData.getLevel());

    }

}
