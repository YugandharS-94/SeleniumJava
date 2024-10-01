package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-search-engine-choice-screen"));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
