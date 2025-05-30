package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll down page by pixel number
//        js.executeScript("window.scrollBy(0,3000)", "");
//        System.out.println(js.executeScript("return window.pageYOffset;"));

        //scroll the page till element is visible
//        WebElement cty = driver.findElement(By.xpath("//td[normalize-space()='Gabon']"));
//        js.executeScript("arguments[0].scrollIntoView();",cty);
//        System.out.println(js.executeScript("return window.pageYOffset;"));

        //scroll page till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        Thread.sleep(3000);

        //scroll page to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }
}