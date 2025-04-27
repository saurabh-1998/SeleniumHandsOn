package Default;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class switchWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.cssSelector("button[id=openwindow]")).click();
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://www.qaclickacademy.com/",url);
        //closing current window
        driver.close();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Switch back to the old tab or window
        driver.switchTo().window((String) windowHandles[0]);
        driver.quit();

    }
}
