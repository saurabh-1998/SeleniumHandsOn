package Default;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class mouseHover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://themes.woocommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.switchTo().frame("theme-demo");
        WebElement bedroom = driver.findElement(By.xpath("//*[@id=\"menu-item-204\"]/a"));
        WebElement pillows = driver.findElement(By.xpath("//*[@id=\"menu-item-206\"]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(bedroom).moveToElement(pillows).click().build().perform();
        String pillow = driver.findElement(By.xpath("//*[@id='main']/header/h1")).getText();
        Assert.assertEquals("Pillows",pillow);
        driver.quit();
    }
}
