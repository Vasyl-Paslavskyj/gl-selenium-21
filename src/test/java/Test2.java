import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Test2 extends FirstSeleniumTest{

    @BeforeEach
    void SetURL() {
        driver.get("http://158.101.173.161/");
    }

    @Test
    void test1() {
        driver.findElement(By.cssSelector("div#default-menu > ul:not(.navbar-right) > li.categories.dropdown a.dropdown-toggle")).click();
    }

    @Test
    void test2() {
        driver.findElement(By.cssSelector("div#default-menu > ul.navbar-right > li.account.dropdown a.dropdown-toggle")).click();
        boolean isElementPresent = isElementPresent(By.cssSelector("div#default-menu > ul.navbar-right > li.open"));
        driver.findElement(By.cssSelector("li.open form.navbar-form input[name=email]")).click();
        driver.findElement(By.cssSelector("li.open a[href$=create_account]")).click();
    }

    @Test
    void test3() {
        driver.findElement(By.cssSelector("section#box-popular-products a[href*=green-duck] div:first-child img:first-child")).click();
    }

    @Test
    void test4() {
        driver.findElement(By.cssSelector("section#box-latest-products a[href*=yellow-duck] div:last-child div.price-wrapper .campaign-price"));
    }

    @Test
    void test5() {
        driver.findElement(By.cssSelector("section#box-latest-products a[href*=red-duck]")).click();
    }

    @Test
    void test6() {
        boolean isElementPresent = isElementPresent(By.cssSelector("div#sidebar > section#box-recently-viewed-products"));
        System.out.println(isElementPresent);
        driver.findElement(By.cssSelector("div#sidebar > section#box-recently-viewed-products a[href*=green-duck]")).click();
    }
}