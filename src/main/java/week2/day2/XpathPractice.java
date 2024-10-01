package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find your account')]")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
