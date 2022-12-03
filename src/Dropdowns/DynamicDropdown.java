package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open a URL in the Chrome browser with full screen
		driver.get("https://beta.spicejet.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);

		// DROPDOWN (Origin: Agartala Airport)
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Agartala Airport')]")).getText());
		driver.findElement(By.xpath("//div[contains(text(),'Agartala Airport')]")).click();

		// DROPDOWN (Destination: Sardar Vallabhbhai Patel International Airport --
		// (Ahmedabad))
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sardar Vallabhbhai Patel International Airport')]"))
						.getText());
		// driver.findElement(By.xpath("//div[contains(text(),'Sardar Vallabhbhai Patel
		// International Airport')]")).click(); // Dynamic dropdown without index
		driver.findElement(By.xpath("(//div[contains(text(),'Sardar Vallabhbhai Patel International Airport')])[1]"))
				.click(); // Dynamic dropdown with index
		// driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']
		// //div[contains(text(),'Sardar Vallabhbhai Patel International
		// Airport')]")).click(); // Dynamic dropdown with Parent-child relationship
		Thread.sleep(2000);

		// driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-16ru68a.r-y47klf.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid")).click();
		// // Departure calendar for current day. Only current day has a unique class
		// identifier. (Spaces replaced by ".")
		driver.findElement(By.cssSelector(
				"div[data-testid='undefined-month-October-2021'] div[data-testid='undefined-calendar-day-29']"))
				.click(); // Departure calendar

		// Get attributes and its content
		System.out.println("- Attribute_Background_Hide: "
				+ driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
						.getAttribute("style"));
		if (driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
				.getAttribute("style").contains("rgb(238, 238, 238)")) {
			System.out.println("Calendar hide");
			Assert.assertTrue(true);
		} else {
			System.out.println("Calendar not hide");
			Assert.assertTrue(false);
		}

		// Open return menu
		driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).click();

		// Get attributes and its content
		System.out.println("- Attribute_Background_Display: "
				+ driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
						.getAttribute("style"));
		if (driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
				.getAttribute("style").contains("rgb(238, 238, 238)")) {
			System.out.println("Calendar hide");
			Assert.assertTrue(false);
		} else {
			System.out.println("Calendar not hide");
			Assert.assertTrue(true);
		}

		// Select return dater
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[data-testid='undefined-month-October-2021'] div[data-testid='undefined-calendar-day-30']")).click();

		// Radio buttons
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Students')]")).click();

		// Popup alert
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().dismiss();
		//Thread.sleep(1000);

		// Button (Search flight)
		driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
		
	}

}
