package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeafGroundCheckbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Clicking on the basic checkbox
		driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();

		// Clicking on the Notification check box
		driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
		String checkMsgValidate = driver.findElement(By.className("ui-growl-title")).getText();

		// Verifying the message displayed
		if (checkMsgValidate.equals("Checked")) {

			System.out.println("Check box selected successfully");
		} else {
			System.out.println("Check box not selected");
		}

		// Selecting the favorite language
		driver.findElement(By.xpath("//label[contains(text(),'Java')]")).click();

		// selecting the no name check box
		driver.findElement(By.xpath("//h5[contains(text(),'Tri')]/parent::div//div[contains(@class,'ui-chkbox-box')]"))
				.click();
		
		// This step is returning empty string. Hence validation was not working
		WebElement stMsg = driver.findElement(By.cssSelector("div[class='ui-growl-message'] p"));
		String stMsg1 = (String) ((JavascriptExecutor) driver).executeScript("arguments[0].textContent",stMsg);
		String stateMessage = stMsg1;
		System.out.println("Try 1: " + stMsg1.toString());
//		if (stateMessage.equals("")) {
//			stateMessage = stMsg.getAttribute("innerHTML");
//			System.out.println("Try 2: " + stateMessage);
//			if (stateMessage.equals("")) {
//				stateMessage = stMsg.getAttribute("textContent");
//				System.out.println("Try 3: " + stateMessage);
//			}
//		}

//		System.out.println(st);

		if (stateMessage.contains("State = 0")) {
			System.out.println("State '0' is selected");
		} else if (stateMessage.contains("State = 1")) {
			System.out.println("State '1' is selected");
		} else {
			System.out.println("State '2' is selected");
		}

		// enable toggle switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		String toggleText = driver.findElement(By.className("ui-growl-title")).getText();
		if (toggleText.contains("Checked")) {
			System.out.println("Toggled");
		} else {
			System.out.println("Untoggled");
		}
		// Verifying the check box
		WebElement checkBoxIsEnabled = driver.findElement(By.xpath(
				"//h5[contains(text(),'Verify if check box is disabled')]/parent::div//input[@type='checkbox']"));
		System.out.println(checkBoxIsEnabled.isEnabled());
		if (!checkBoxIsEnabled.isEnabled()) {
			System.out.println("Check box is disbabled");
		} else {
			System.out.println("Check box is enabled");
		}

		// Selecting multiple cities
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		String[] cities = { "London", "Rome" };
		Thread.sleep(3000);
		for (int i = 0; i < cities.length; i++) {
			driver.findElement(By.xpath("//li[@data-item-value='" + cities[i] + "']//div")).click();
		}

		driver.quit();

	}

}
