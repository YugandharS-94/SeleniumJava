package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadioButton {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("------------------------Choosing favourite browser-----------------------------");
		driver.findElement(By.xpath(
				"//h5[contains(text(),'Your most favorite browser')]/parent::div//label[contains(text(),'Chrome')]"))
				.click();
		System.out.println("Check box selected");

		System.out.println("-------------------------Selecting and Unselecting----------------------------");
		WebElement elementClick = driver.findElement(
				By.xpath("//h5[contains(text(),'UnSelectable')]/parent::div//label[contains(text(),'Chennai')]"));
		elementClick.click();
		elementClick.click();

		if (!elementClick.isSelected()) {
			System.out.println("Checkbox is unselected");
		} else {
			System.out.println("Checkbox is selected");
		}
		System.out.println("-----------------------Checking the selected element------------------------------");

		int i = 0;
		boolean checked = true;

		while (checked) {
			++i;
			WebElement elementSelected = driver.findElement(By.xpath(
					"(//h5[contains(text(),'Find the default select radio button')]/parent::div//div[contains(@class,'ui-radiobutton-box')])[" + i + "]"));
			String elemAttribute = elementSelected.getAttribute("class");
			String elemText = driver.findElement(By.xpath("(//h5[contains(text(),'Find the default select radio button')]/parent::div//div[contains(@class,'ui-radiobutton-box')]/parent::div/following-sibling::label)["+i+"]")).getText();
			if (elemAttribute.contains("ui-state-active")) {
				
				System.out.println("Check box selected by default is: " 
				+ elemText);
				checked = false;
				break;
			}
		}
		System.out.println("------------------------Selecting the Age group-----------------------------");
		int j = 0;
		boolean isSelected = true;
		int age = 22;
		String group = null;
		if (age >= 1 && age <= 20) {
			group = "1-20 Years";
		} else if (age >= 21 && age <= 40) {
			group = "21-40 Years";
		} else if (age >= 41 && age <= 60) {
			group = "41-60 Years";
		} else {
			System.out.println("age not eligible");
			group = "21-40 Years";
		}

		while (isSelected) {
			++j;
			WebElement ageGroup = driver.findElement(
					By.xpath("(//h5[contains(text(),'Select the age group')]/parent::div//div[contains(@class,'ui-radiobutton-box')])[" + j + "]"));
			String ageElemAttrib = ageGroup.getAttribute("class");
			String ageText = driver.findElement(By.xpath("(//h5[contains(text(),'Select the age group')]/parent::div//div[contains(@class,'ui-radiobutton-box')]/parent::div/following-sibling::label)["+j+"]")).getText();
			
			if (ageText.equals(group) && !ageElemAttrib.contains("ui-state-active")) {
				driver.findElement(By.xpath("(//h5[contains(text(),'Select the age group')]/parent::div//div[contains(@class,'ui-radiobutton-box')]/parent::div/following-sibling::label)["+j+"]")).click();
				System.out.println("Selected the age group - "+ ageText +" for the given age - " + age);
				isSelected = false;
				break;
			} else if (ageText.equals(group) && ageElemAttrib.contains("ui-state-active")) {
				System.out.println("Age group - "+ageText +" already selected for the given age");
				isSelected = false;
				break;
			}

		}
		System.out.println("-----------------------------------------------------");
		driver.quit();

	}

}
