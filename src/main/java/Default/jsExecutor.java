package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //JavascriptExecutor js = driver;

        js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox );

        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()", radiobtn);
    }
}
