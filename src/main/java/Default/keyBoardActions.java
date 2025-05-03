package Default;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyBoardActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).build().perform();
        act.sendKeys(Keys.SPACE).build().perform();
        act.sendKeys(Keys.BACK_SPACE).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        driver.close();
    }
}
