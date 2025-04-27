package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class SuggestionClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("input[id=autocomplete]")).sendKeys("ind");
        //Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Waiting for the suggestion to appear...");
        WebElement suggestion = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ui-id-1']/li[2]")));
        System.out.println("Suggestion found: " + suggestion.getText());
        suggestion.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.quit();
    }
}
