package week4.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;
import java.util.logging.Level;

public class framesAssignment {
    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.INFO);
        ChromeDriver driver = new ChromeDriver();


        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
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
        if (message.contains("Hello")) {
            System.out.println("Alert is accepted and the message displayed is: " + message);
        } else if (message.contains("cancelled")) {
            System.out.println("Alert is dismissed and the message displayed is: " + message);
        }
        driver.switchTo().defaultContent();
        driver.quit();

    }
}
