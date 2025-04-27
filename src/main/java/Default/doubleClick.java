package Default;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class doubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement ele= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act = new Actions(driver);
        act.doubleClick(ele).build().perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();
    }
}
