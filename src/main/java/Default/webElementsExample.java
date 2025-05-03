package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class webElementsExample {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
        WebElement element = driver.findElement(By.id("user-name"));
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4"));
        // Using various methods
        System.out.println("Text: " + element1.getText());
        System.out.println("Attribute Value: " + element.getAttribute("placeholder"));
        System.out.println("Is displayed: " + element.isDisplayed());
        System.out.println("Is enabled: " + element.isEnabled());
        System.out.println("Is selected: " + element.isSelected());
        String color = element.getCssValue("color");
        System.out.println("Color: " + color);
        // Validate the color (example: checking if it matches a specific RGB value)
        String expectedColor = "rgba(72, 76, 85, 1)";
        if (color.equals(expectedColor)) {
            System.out.println("The color is as expected.");
        } else {
            System.out.println("The color is not as expected.");
        }
        System.out.println("Tag Name: " + element.getTagName());

        // Interacting with the element
        element.click();
        element.sendKeys("Some text");
        element.clear();
    }
}
