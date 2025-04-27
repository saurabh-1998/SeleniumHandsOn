package Default;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class alert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement alertText = driver.findElement(By.id("name"));
        alertText.sendKeys("subu");
        driver.findElement(By.id("alertbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String text1 = alert.getText();
        System.out.println(text1);
        Assert.assertTrue(text1, text1.contains("subu"));
        alert.accept();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        alertText.sendKeys("Bulbul");
        driver.findElement(By.id("confirmbtn")).click();
        String text2 = alert.getText();
        System.out.println(text2);
        Assert.assertTrue(text2, text2.contains("Bulbul"));
        alert.dismiss();
        driver.quit();
    }
}
