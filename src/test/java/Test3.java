import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Test3 extends FirstSeleniumTest{

    @Test
    void test1() {
        driver.navigate().to("http://jqueryui.com/resources/demos/sortable/connect-lists.html");
        List<WebElement> firstList = driver.findElements(By.cssSelector("#sortable1 li"));
        List<WebElement> secondList = driver.findElements(By.cssSelector("#sortable2 li"));

        new Actions(driver)
                .dragAndDrop(firstList.get(0), secondList.get(2))
                .perform();

        Action moveDown = new Actions(driver)
                .moveToElement(firstList.get(1))
                .clickAndHold()
                .moveByOffset(0, 50)
                .release()
                .build();

        moveDown.perform();
        moveDown.perform();
        moveDown.perform();
    }
}
