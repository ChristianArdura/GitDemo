package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key_DOWN_UP {

	public static void main(String[] args) throws InterruptedException {

		// Create driver object for chrome browser and open page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		// Insert text "ind" in the search cell
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);

		// Move two positions down through the menu displayed and print the option selected
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		}
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		// Move one position up through the menu displayed and print the option selected
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.UP);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}
}
