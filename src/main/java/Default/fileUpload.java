package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class fileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user\\Downloads\\sample.png");
        driver.findElement(By.id("file-submit")).click();
        String header = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(header,"File Uploaded!");
        driver.quit();
    }
}
