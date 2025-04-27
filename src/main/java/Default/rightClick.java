package Default;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class rightClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement ele= driver.findElement(By.xpath("//div[@class='document']/p/span"));
        Actions act = new Actions(driver);
        act.contextClick(ele).build().perform();
        driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();
    }
}
