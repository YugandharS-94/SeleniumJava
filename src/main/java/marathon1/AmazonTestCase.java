package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// entering the search details
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		
		// Clicking on the search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// Printing the search results
		System.out.println("Results : " + driver.findElement(By.xpath("//span[contains(text(),'Bags for boys')]/parent::div")).getText());
		
		// Selecting more than 1 product
		for (int i = 1; i <=2; i++) {
			
			driver.findElement(By.xpath("(//div[@id='brandsRefinements']//label)["+ i + "]")).click();
			
		}
		
		// Sorting the product by new arrival
		driver.findElement(By.xpath("//span[contains(text(),'Sort')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
		
		// Selecting the First result
		WebElement firstBag = driver.findElement(By.xpath("(//div[contains(@class,'puis-card-container')])[1]"));
		
		//Printing the required details from the selected first element
		System.out.println("----------------------------------------------");
		// Brand name
		System.out.println("Brand Name: "+ firstBag.findElement(By.xpath(".//div[@data-cy='title-recipe']//h2/span")).getText());
		// Product name
		System.out.println("Bag Details: " + firstBag.findElement(By.xpath(".//div[@data-cy='title-recipe']/h2")).getText());
		// Product price
		System.out.println("Price: "+ firstBag.findElement(By.className("a-price-whole")).getText());
		System.out.println("----------------------------------------------");
		
		// Printing the current page title
		System.out.println("Current Page Title: "+ driver.getTitle());
		
		driver.quit();
		

	}

}
