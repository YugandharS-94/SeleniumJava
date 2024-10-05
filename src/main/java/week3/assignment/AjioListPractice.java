package week3.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AjioListPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Launching the URL
        driver.get("https://www.ajio.com/");
        driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
        driver.findElement(By.cssSelector(".rilrtl-button")).click();
        // selecting gender
        driver.findElement(By.xpath("//label[@for='Men']")).click();
        Thread.sleep(3000);
        // Selecting bagtype
        driver.findElement(By.xpath("//label[contains(@for,'Fashion Bags')]")).click();
        Thread.sleep(3000);
        // Getting the count of bags returned
        String bagcount = driver.findElement(By.xpath("//div[@class='filter']//strong")).getText();
        System.out.println(bagcount);

        List<WebElement> bagBrandList = driver.findElements(By.xpath("//div[@class='items']//div[@role='gridcell']//div[@class='brand']//strong"));

        System.out.println("--------------------------------------");
        for (int i = 0; i < bagBrandList.size(); i++) {
            System.out.println("Brand Name  : "+bagBrandList.get(i).getText());

        }
        System.out.println("--------------------------------------");
        List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='items']//div[@role='gridcell']//div[@class='nameCls']"));
        for (int i = 0; i < bagNameList.size(); i++) {
            System.out.println("Brand Name  : "+bagNameList.get(i).getText());
        }
        System.out.println("--------------------------------------");

        driver.quit();
    }

}
