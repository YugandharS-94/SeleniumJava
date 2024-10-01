package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

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

		// click on leads tab
		driver.findElement(By.linkText("Leads")).click();
		// clicking on find leads tab
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		// Clicking on the phone number tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		// Getting the first lead ID
		WebElement firstLead = driver.findElement(By.xpath("//div[text()='Lead ID']/following::tr[1]/td[1]//a"));
		String firstLeadId = firstLead.getText();
		
		// Clicking on the first lead id
		firstLead.click();

		// Deleting the lead
		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		// Clicking on find the leads again
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		// Finding the saved lead id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLeadId);

		// Clicking on find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Collecting the results message
		String deletionMessage = driver.findElement(By.xpath("//button[text()='Export To Excel']/following::div[1]"))
				.getText();

		if (deletionMessage.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead not deleted");
		}
		driver.quit();
	}
}
