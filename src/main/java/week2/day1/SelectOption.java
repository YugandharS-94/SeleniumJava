package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {

	public static void main(String[] args) {
		

		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("User");
		
		Select sourceSelect = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		sourceSelect.selectByIndex(4);
		
		Select mcSelect = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		mcSelect.selectByVisibleText("Car and Driver");
		
		Select ownerSelect = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		ownerSelect.selectByValue("OWN_CCORP");
		
		driver.findElement(By.className("smallSubmit")).click();
		

}
}
