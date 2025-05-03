package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class dropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByVisibleText("Option1");
        // Check if the dropdown allows multiple selections
        boolean isMultiple = dropdown.isMultiple();
        System.out.println("Is the dropdown multiple? " + isMultiple);
        List<WebElement> options = dropdown.getOptions();
        for (WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }

        // Get the first selected option
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        System.out.println("Selected Option: " + selectedOption.getText());
        driver.quit();
    }
}
