package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class AjioActionsPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Launching the URL
        driver.get("https://www.ajio.com/");


        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[text()='MEN']"))).perform();
        action.moveToElement(driver.findElement(By.xpath("(//a[text()='CATEGORIES'])[1]"))).perform();
        action.click(driver.findElement(By.linkText("Bags & Wallets"))).perform();

        Thread.sleep(3000);
        // Selecting bagtype
        driver.findElement(By.xpath("//label[contains(@for,'Fashion Bags')]")).click();
        Thread.sleep(3000);
        // Getting the count of bags returned
        String bagcount = driver.findElement(By.xpath("//div[@class='filter']//strong")).getText();
        System.out.println("Total Number of bags returned: " + bagcount);
        System.out.println("--------------------------------------");
        List<WebElement> bagBrandList = driver.findElements(By.xpath("//div[@class='items']//div[@role='gridcell']//div[@class='brand']//strong"));

        for (WebElement element : bagBrandList) {
            System.out.println("Brand Name  : " + element.getText());

        }
        System.out.println("--------------------------------------");
        List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='items']//div[@role='gridcell']//div[@class='nameCls']"));
        for (WebElement webElement : bagNameList) {
            System.out.println("Bag Name  : " + webElement.getText());
        }
        System.out.println("--------------------------------------");



        driver.quit();
    }

}
