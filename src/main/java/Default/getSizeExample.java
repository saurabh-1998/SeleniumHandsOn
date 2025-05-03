package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getSizeExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
        WebElement usrname = driver.findElement(By.id("user-name"));
        Dimension size = usrname.getSize();
        System.out.println(size);
        // Print the width and height
        System.out.println("Width: " + size.getWidth());
        System.out.println("Height: " + size.getHeight());
        driver.close();
    }
}
