import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    private final WebDriver driver = new FirefoxDriver();

    @Test
    public void testLogin(){
    driver.get("https://www.yahoo.com/");

        driver
                .get("https://www.yahoo.com/");

        driver
                .findElement(By.xpath(".//*[@id='3463']//strong[1]"))
                .sendKeys("TEST AUTOMATION");

        driver
                .findElement(By.xpath(".//*[@id='3463']//strong[1]"))
                .click();
        Assert.assertTrue(driver.getPageSource().contains("TEST AUTOMATION"));

    }
}
