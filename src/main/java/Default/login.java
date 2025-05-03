package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        System.out.println(title);
        //validation
        Assert.assertEquals(title, "OrangeHRM");
        //sleep(3000);

        driver.findElement(By.cssSelector("input[name=username]")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement Logo = driver.findElement(By.className("oxd-brand-banner"));
        //boolean isLogoDisplayed = Logo.isDisplayed();
        //Assert.assertTrue(isLogoDisplayed);
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> Logo.isDisplayed());

        driver.close();
    }
}
