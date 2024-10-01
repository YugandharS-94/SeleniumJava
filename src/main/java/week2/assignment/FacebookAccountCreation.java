package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		
		String firstName = "Test";
		String lastName = "User";
		String[] dob = "2-Mar-1975".split("-");
		String email = firstName + lastName +  "@dummymail.com";
		String password = "afjsjfnasoin34434nfufs#4";
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Create account link
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		// Signup page
		//FirstName
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
		
		//LastName
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		
		// DOB
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		selectDay.selectByValue(dob[0]);
		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText(dob[1]);
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue(dob[2]);
		
		//Selecting Gender
		driver.findElement(By.xpath("//label[contains(text(),'Male')]/input")).click();
		
		// Enter mobile number or email address
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]/following-sibling::input")).sendKeys(email);
		
		// Entering password
		driver.findElement(By.xpath("//div[contains(text(),'New password')]/following-sibling::input")).sendKeys(password);
		
		
		driver.quit();
	}

}
