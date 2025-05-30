package Default;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.PageLoadStrategy;


import java.io.File;
import java.time.Duration;

public class enableExtensionRuntime {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        File extension = new File("F:\\SeleniumJava\\crx\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx");
        options.addExtensions(extension);
        options.setPageLoadStrategy(PageLoadStrategy.EAGER); // Change page load strategy

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); // Increase timeout
        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60)); // Increase script timeout

        try {
            driver.get("https://www.google.com");
            // Other operations...
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
