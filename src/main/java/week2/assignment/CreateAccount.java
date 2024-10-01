package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateAccount {

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
		
		// click on Accounts tab
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//Creating Account
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("TestLeaf_Selenium_Training");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("52");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		// Clicking on create button		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		if (title.contains("Account Details | opentaps CRM")) {
			System.out.println("Title Verified");
		} else {
			System.out.println("Title not Verified");
		}
		
		driver.quit();
}	
}
