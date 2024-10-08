package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlesPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications"));

        driver.get("https://www.irctc.co.in/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.xpath("//a[contains(text(),' FLIGHTS ')]")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles);
        String parentWindow = windowHandlesList.get(0);
        String chileWindow = windowHandlesList.get(1);

        driver.switchTo().window(chileWindow);
        String childWindowTitle = driver.getTitle();
        System.out.println("Child window title is: " + childWindowTitle);

        driver.switchTo().window(parentWindow);

        driver.close();
        Actions act = new Actions(driver);
        act.build();

    }
}
