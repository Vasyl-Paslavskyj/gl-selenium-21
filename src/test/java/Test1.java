import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Test1 extends FirstSeleniumTest{

    @BeforeEach
    void SetURL() {
        driver.get("http://158.101.173.161/");
    }

    @Test
    void test1() {
        driver.findElement(By.xpath("//div[@id='default-menu']//li[contains(@class,'manufacturers')]/a[1]")).click();
    }

    @Test
    void test2() {
        driver.findElement(By.xpath("//ul[contains(@class,'navbar-right')]/li[last()]/a")).click();
        WebElement element = driver.findElement(By.xpath("//ul[contains(@class,'navbar-right')]/li[contains(@class,'open')]"));
        driver.findElement(By.xpath("//li[contains(@class,'open')]/ul[@class='dropdown-menu']//form//input[@name='email' and @type='email']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'open')]//a[contains(@href,'reset_password')]")).click();
    }

    @Test
    void test3() {
        driver.findElement(By.xpath("//section[@id='box-campaign-products']//a[contains(@href,'yellow-duck')]//img[contains(@alt,'Yellow') and contains(@alt,'Duck')]")).click();
    }

    @Test
    void test4() {
        WebElement element = driver.findElement(By.xpath("//section[@id='box-latest-products']//a[contains(@href,'purple-duck')]/div[last()]//span[@class='price']"));
        System.out.println(element);
    }

    @Test
    void test5() {
        driver.findElement(By.xpath("//section[@id='box-popular-products']//a[contains(@href,'blue-duck')]//..")).click();
    }

    @Test
    void test6() {
        boolean isElementPresent = isElementPresent(By.xpath("//section[@id='box-recently-viewed-products']"));
        System.out.println(isElementPresent);
        driver.findElement(By.xpath("//section[@id='box-recently-viewed-products']//a[contains(@href,'blue-duck')]")).click();
    }
}
