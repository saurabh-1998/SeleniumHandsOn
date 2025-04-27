package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;

public class handleCalender2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        LocalDate previousDate = LocalDate.now().minusDays(1); // Change the number of days as needed
        int day = previousDate.getDayOfMonth();
        int month = previousDate.getMonthValue();
        int year = previousDate.getYear();

        // Click on the date picker to open the calendar
        WebElement datePicker = driver.findElement(By.id("datepicker")); // Replace with the actual ID or locator
        datePicker.click();

        // Navigate to the correct month and year
        while (true) {
            // Get the currently displayed month and year
            WebElement monthYearElement = driver.findElement(By.className("ui-datepicker-title")); // Replace with actual class
            String displayedMonthYear = monthYearElement.getText(); // e.g., "January 2023"
            //System.out.println(displayedMonthYear);

            // Check if the displayed month and year match the target month and year
            if (displayedMonthYear.equalsIgnoreCase(getMonthName(month) + " " + year)) {
                break; // We are in the correct month
            }

            // Click the "previous" button to go back a month
            //WebElement previousButton = driver.findElement(By.className("previousButtonClass")); // Replace with actual class
            //previousButton.click();
        }

        // Select the day
        WebElement dayElement = driver.findElement(By.xpath("//a[text()='" + day + "']")); // Adjust the XPath as needed
        dayElement.click();

        Thread.sleep(2000);
        @SuppressWarnings("deprecation") String previousDateValue = datePicker.getAttribute("value");

        System.out.println(previousDateValue);

        driver.close();
    }

    // Method to convert month number to month name
    private static String getMonthName(int month) {
        return java.time.Month.of(month).name().charAt(0) + java.time.Month.of(month).name().substring(1).toLowerCase();
    }

}
