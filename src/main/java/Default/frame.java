package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class frame {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Sourya");

        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        Select dropdown = new Select(driver.findElement(By.id("course")));
        Thread.sleep(2000);
        dropdown.selectByVisibleText("Java");
        driver.switchTo().defaultContent();
        textbox.clear();
        textbox.sendKeys("Hello World");
        driver.close();
    }
}
