package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListLearning {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
	}

}
