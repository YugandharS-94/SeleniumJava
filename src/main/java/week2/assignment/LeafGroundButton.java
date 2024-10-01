package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Clicking on the basic check box
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		String title = driver.getTitle();
		System.out.println("-----------------------------------------------------");
		if (title.equals("Dashboard")) {
			System.out.println("Title Verified!");
		} else {
			System.out.println("Title not Verified!");
		}
		driver.navigate().back();
		System.out.println("-----------------------------------------------------");
		WebElement buttonCheck = driver.findElement(By.xpath("//h5[contains(text(),'Find the position of the Submit button')]/following-sibling::button"));
		
		if (!buttonCheck.isEnabled()) {
			System.out.println("Button is disabled");
		} else {
			System.out.println("Button is enabled");
		}
		System.out.println("-----------------------------------------------------");
		// finding the location of the button
		WebElement buttonLocation = driver.findElement(By.xpath("//h5[contains(text(),'Find the position of the Submit button')]/following-sibling::button//span[text()='Submit']"));
		System.out.println("X Position: "+ buttonLocation.getLocation().x);
		System.out.println("Y Position: "+ buttonLocation.getLocation().y);
		System.out.println("-----------------------------------------------------");
		// finding the size of the button
		WebElement buttonPosition = driver.findElement(By.xpath("//h5[contains(text(),'Find the height and width of this button')]/following-sibling::button"));
		System.out.println("Height of the button: "+ buttonPosition.getSize().height);
		System.out.println("Width of the button: "+ buttonPosition.getSize().width);
		System.out.println("-----------------------------------------------------");
		// finding the color of the button
		WebElement buttonColor = driver.findElement(By.xpath("//h5[contains(text(),'Find the Save button color')]/following-sibling::button"));
		System.out.println("Color of the button: "+ buttonColor.getCssValue("background-color"));
		System.out.println("-----------------------------------------------------");
		driver.quit();

	}

}
