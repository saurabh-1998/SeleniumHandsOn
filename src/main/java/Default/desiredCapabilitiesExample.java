package Default;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapabilitiesExample {
    public static void main(String[] args) {
        // Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Start browser maximized
        options.addArguments("--disable-popup-blocking"); // Disable popup blocking

        // Create an instance of DesiredCapabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "latest"); // Specify the browser version
        capabilities.setCapability("platform", "ANY"); // Specify the platform

        // Create a new instance of the Chrome driver with capabilities
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.close();

    }
}
