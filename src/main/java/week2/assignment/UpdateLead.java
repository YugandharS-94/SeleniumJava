package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdateLead {

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
		
		// click on leads tab
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Creating Lead
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("User");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testemail@dummy.com");
		
		// Selecting the state
		Select stateSelect = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		stateSelect.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		// Editing the lead details
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		// Clearing the description 
		driver.findElement(By.id("updateLeadForm_description")).clear();
		// Filling the important field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important notes...........");
		// Updating
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
}	
}
