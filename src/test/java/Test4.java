import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 extends FirstSeleniumTest{

    @BeforeEach
    public void openAdminPage() {
        wait = new WebDriverWait(driver, 10);
        driver.get("http://158.101.173.161/admin/");
        driver.findElement(By.xpath("//form//input[@name='username']")).sendKeys("");
        driver.findElement(By.cssSelector("form input[name=password]")).sendKeys("");
        driver.findElement(By.xpath("//form//button[@name='login' and @type='submit']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='box-apps-menu']")));
    }

    @Test
    void menuNavigationTest() {
        By menuItemsLocator = By.className("app");
        By subMenuItemsLocator = By.className("doc");
        By panelHeadingLocator = By.className("panel-heading");

        for (int menuIterator = 1; menuIterator < driver.findElements(menuItemsLocator).size(); menuIterator++){
            driver.findElement(By.xpath("//li[contains(@class,'app')]["+menuIterator+"]")).click();
//            driver.findElements(By.xpath("//li[contains(@class,'app')]")).get(menuIterator).click();
            Assertions.assertTrue(driver.findElement(panelHeadingLocator).isDisplayed());

            for (int submenuIterator = 1 ; submenuIterator <= driver.findElements(subMenuItemsLocator).size(); submenuIterator++){
                driver.findElement(By.xpath("//li[contains(@class,'doc')]["+submenuIterator+"]")).click();
//                driver.findElements(By.xpath("//li[contains(@class,'doc')]")).get(submenuIterator).click();
                Assertions.assertTrue(driver.findElement(panelHeadingLocator).isDisplayed());
            }
        }
    }
}
