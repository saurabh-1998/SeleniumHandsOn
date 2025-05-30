package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class multipleFileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        String file1 = "C:\\Users\\user\\Downloads\\aws-certified-cloud-practitioner.png";
        String file2 = "C:\\Users\\user\\Downloads\\GitHub-Logo.png";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
        int noOffilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
        if (noOffilesUploaded==2)
            System.out.println("Multiple files uploaded");
        else
            System.out.println("Not uploaded");
    }
}
