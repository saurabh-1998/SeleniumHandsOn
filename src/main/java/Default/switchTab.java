package Default;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class switchTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //click on link to open a new window
        driver.findElement(By.linkText("Open Tab")).click();
        //fetch handles of all windows, there will be two, [0]- default, [1] - new window
        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        //assert on title of new window
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
