package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownWithSelectTag {

	public static void main(String[] args) throws InterruptedException {
		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		// Open a URL in the Chrome browser
		driver.get("https://spiceshuttle.com");
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@ng-model='Obj.DepartureSector']"));
		//Select dropdown = new Select(driver.findElement(By.xpath("//select[@ng-model='Obj.DepartureSector']")));
        Select dropdown = new Select(staticDropdown);
		Thread.sleep(5000);
		
        dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("SOUK-Statue of Unity, Kevadia");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByIndex(0); // Default value is SRFA (==$0), but it is written SOUK (¿BUG?)
		System.out.println(dropdown.getFirstSelectedOption().getText());

		//s.selectByValue("string:SRFA"); //Does not work. Maybe because ":".
		
		
	}

}

