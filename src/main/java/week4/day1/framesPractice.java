package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

public class framesPractice {
    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.INFO);
        WebDriver driver = new EdgeDriver();


        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Set<String> windowHandles = driver.getWindowHandles();
        // Switching to the frame
        driver.switchTo().frame("iframeResult");
        // Clicked on the "Try it" button
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        // Switching to alert to accept
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // Extracted the confirmation message
        String message = driver.findElement(By.id("demo")).getText();
        // Compared the message
        if (message.contains("OK")) {
            System.out.println("Alert Accepted successfully");
        } else {
            System.out.println("Alert Dismissed");
        }
        driver.switchTo().defaultContent();
        driver.quit();

    }
}
