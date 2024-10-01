package marathon1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PvrTestCase {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
				
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Selected Cinema Option from quick book
		driver.findElement(By.xpath("//div[@class='date-show']//span[contains(text(),'Cinema')]")).click();
		
		// Selecting the cinema
		driver.findElement(By.id("cinema")).click();
		driver.findElement(By.xpath("//span[contains(text(),'NCS Mall')]")).click();
		
		// Select date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		
		// Selecting Movie		
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/child::span[text()='MATHU VADALARA 2']")).click();
		Thread.sleep(5000);
		//selecting timing
		driver.findElement(By.xpath("//li[contains(@class,'p-dropdown-item')][1]")).click();
		
		// Booking
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Accept Terms and condition
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		
		// selecting seat
		driver.findElement(By.xpath("//span[contains(text(),'M')]/ancestor::tr//span[contains(text(),'9')]")).click();
		
		// Clicking on Proceed button
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		System.out.println("--------------------------------------------------");
		
		// Printing the movie summary
		WebElement movieSummary = driver.findElement(By.className("summary-movies-content"));
		System.out.println("Movie Name: " + movieSummary.findElement(By.xpath("./h5")).getText());
		System.out.println("Movie Type: " + movieSummary.findElement(By.xpath("./ul")).getText());
		System.out.println("Movie Time: " + movieSummary.findElement(By.xpath("./p")).getText());
		System.out.println("Movie Type: " + movieSummary.findElement(By.xpath("./p[2]")).getText());
		System.out.println("--------------------------------------------------");
		// Printing the Seat Details
		WebElement seatInfo = driver.findElement(By.className("seat-info"));
		System.out.println("Seat Type: "+ seatInfo.findElement(By.xpath("./p")).getText());
		System.out.println("Seat Number: " + seatInfo.findElement(By.xpath(".//div[@class='seat-number']/p")).getText());
		System.out.println("--------------------------------------------------");
		// Grand Price
		System.out.println("Grand Price: " +driver.findElement(By.className("grand-prices")).getText());
		System.out.println("--------------------------------------------------");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		//close the dialogue box
		driver.findElement(By.xpath("(//i[contains(@class,'pi-times')])[2]")).click();
		
		// Printing the current page title
		System.out.println("Current Page Title: "+ driver.getTitle());
		
		driver.quit();

	}

}
