package Default;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {
    public static void main(String[] args) {
       // https://www.youtube.com/watch?v=rOAkHQWApmI
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");

        //full page screenshot
        // TakesScreenshot ts = (TakesScreenshot) driver;
        // File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        // File targetfile = new File("screenshots/fullscreenshot.png");
        // sourcefile.renameTo(targetfile); //copy source file to target file

        //specific section screenshot
        // WebElement featuredSection = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        // File sectionSourceFile = featuredSection.getScreenshotAs(OutputType.FILE);
        // File sectionTargetFile = new File("screenshots/featuredSection.png");
        // sectionSourceFile.renameTo(sectionTargetFile);

        //capture screenshot of web element
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File logoSourceFile = logo.getScreenshotAs(OutputType.FILE);
        File logoTargetFile = new File("screenshots/logo.png");
        logoSourceFile.renameTo(logoTargetFile);

        driver.quit();
    }
}
