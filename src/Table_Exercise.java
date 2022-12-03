import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Exercise {

	public static void main(String[] args) throws InterruptedException {

		// Create driver object for chrome browser and open page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(	"https://rahulshettyacademy.com/AutomationPractice/");
		
		// Print table rows and columns number
		WebElement table=driver.findElement(By.id("product"));
		System.out.println("Rows: " + table.findElements(By.tagName("tr")).size());
		System.out.println("Columns: " + table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		//Print the content of the second row
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println("Row 2 - Column 1: " + secondrow.get(0).getText());
		System.out.println("Row 2 - Column 2: " + secondrow.get(1).getText());
		System.out.println("Row 2 - Column 3: " + secondrow.get(2).getText());	
	}

}