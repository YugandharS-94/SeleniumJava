package week4.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class WindowHandlingAssignment {

    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://leaftaps.com/opentaps/");

        // Login page
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // selecting CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();

        // click on Contacts tab
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

        //Fetching the From contact
        driver.findElement(By.xpath("//input[@id='partyIdFrom']//following-sibling::a/img")).click();
        Set<String> fromWindowHandles = driver.getWindowHandles();
        List<String> fromWindowHandleList = new ArrayList<>(fromWindowHandles);
        String fromParentWindow = fromWindowHandleList.get(0);
        String fromChildWindow = fromWindowHandleList.get(1);

        driver.switchTo().window(fromChildWindow);

        //selection the first resulting contact
        driver.findElement(By.xpath("//div[contains(text(),'Contact ID')]/following::tr[1]/td[1]//a")).click();
        //switching to default
        driver.switchTo().window(fromParentWindow);

        // Fetching the To contact
        driver.findElement(By.xpath("//input[@id='partyIdTo']//following-sibling::a/img")).click();

        Set<String> toWindowHandles = driver.getWindowHandles();
        List<String> toWindowHandleList = new ArrayList<>(toWindowHandles);
        String toParentWindow = toWindowHandleList.get(0);
        String toChildWindow = toWindowHandleList.get(1);
        driver.switchTo().window(toChildWindow);
        //Selecting the second contact
        driver.findElement(By.xpath("//div[contains(text(),'Contact ID')]/following::tr[3]/td[1]//a")).click();

        driver.switchTo().window(toParentWindow);

        // Clicking on merge button
        driver.findElement(By.className("buttonDangerous")).click();

        // Switching to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String title = driver.getTitle();

        if (title.contains("Merge Contacts | opentaps CRM")) {
            System.out.println("Title Verified: " + title);
        } else {
            System.out.println("Title not Verified");
        }

        driver.quit();
    }
}
