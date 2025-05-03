package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyBoardActionMultipleKeys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://text-compare.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement input1 = driver.findElement(By.id("inputText1"));
        WebElement input2 = driver.findElement(By.id("inputText2"));

        input1.sendKeys("Hello World!!!");
        Actions act = new Actions(driver);
        //CTRL + A
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();
        //CTRL + C
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();
        //swift to input2 box
        act.sendKeys(Keys.TAB).perform();
        //CTRL + V
        act.keyDown(Keys.CONTROL).sendKeys("v");
        act.keyUp(Keys.CONTROL).perform();

        //text compare
        if(input1.getAttribute("value").equals(input2.getAttribute("value")))
            System.out.println("Text copied");
        else
            System.out.println("Text not copied");
        driver.close();
    }
}
