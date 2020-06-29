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

    public void modifyEntitledRoleForm(EntitledRoleData assigneeRoleData) throws InterruptedException {

        type(By.id("authitem-name"), assigneeRoleData.getName());
        type(By.id("authitem-description"), assigneeRoleData.getDescription());
        type(By.id("authitem-code"), assigneeRoleData.getKod());
        select(By.id("authitem-rulename"), assigneeRoleData.getLevel());

    }

    public void findCreatedEntitledRoleDelete() throws InterruptedException {

        find(By.name("AuthItem[name]"), "Тестовая роль (для удаления)");

    }

    public void submitEntitledRoleModification() throws InterruptedException {
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
    }

    public void findCreatedEntitledRoleModify() throws InterruptedException {

        find(By.name("AuthItem[name]"), "Тестовая роль (редактирование)");

    }

    public void clickEyeEntitledRole() throws InterruptedException {

        clickEye(By.cssSelector("span[class='glyphicon glyphicon-eye-open']"));

    }

    public void modifyEntitledRole() throws InterruptedException {

        click(By.linkText("Редактировать"));
        Thread.sleep(1000);

    }

    public void deleteEntitledRole() throws InterruptedException {

        click(By.linkText("Удалить"));
        Thread.sleep(1000);
        assertTrue(closeAlertAndGetItsText().matches("^Are you sure to delete this item?[\\s\\S]$"));
        Thread.sleep(1000);

    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
