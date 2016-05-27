package ksichenko.TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestYahooSearch {


    private final WebDriver driver = new FirefoxDriver();

    @Test
    public void testYahooSearch() {

        driver
                .get("https://www.yahoo.com");

        driver
                .findElement(By.xpath(".//*[@id='uh-search-box']"))
                .sendKeys("test automation");

        driver
                .findElement(By.xpath(".//*[@id='uh-search-button']"))
                .click();

        String actualTitle = "Test Automation Software | Atlassian.com";
        String expectedTitle = driver.getTitle();

        Assert
                .assertTrue(driver.getTitle()
                .contains("test automation"));
    }
}


