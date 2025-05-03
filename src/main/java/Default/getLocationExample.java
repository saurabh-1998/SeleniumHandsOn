package Default;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getLocationExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
        WebElement usrname = driver.findElement(By.id("user-name"));
        Point location = usrname.getLocation();
        System.out.println(location);
        // Print the x and y coordinates
        System.out.println("X Coordinate: " + location.getX());
        System.out.println("Y Coordinate: " + location.getY());
        driver.close();
    }
}
