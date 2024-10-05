package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/parent::div//span[text()='Show']")).click();

        // switching to alert
        Alert alert = driver.switchTo().alert();
        String msg = "Hello World";
        alert.sendKeys(msg);
        alert.accept();

        // saving the post confirmation message
        String confirmationText = driver.findElement(By.cssSelector("span#confirm_result")).getText().split(": ")[1];

        // comparing the input value against output value
        if (confirmationText.equals(msg)) {
            System.out.println("Message verified successfully");
        } else {
            System.out.println("Message not verified");
        }
        driver.quit();
    }


}
