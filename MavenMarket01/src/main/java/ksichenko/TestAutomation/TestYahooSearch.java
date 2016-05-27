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

        Assert
                .assertTrue(driver.findElements(By.xpath("//div[@id='yui_3_10_0_1_1464285672612_1028']//a[@id='yui_3_10_0_1_1464285672612_1026']"))
                .contains("test automation"));
    }
}
