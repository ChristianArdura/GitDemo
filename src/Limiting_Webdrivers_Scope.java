import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limiting_Webdrivers_Scope {

	public static void main(String[] args) {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open page
		driver.get("https://qaclickacademy.com/practice.php");

		// Print number of links present in the WebDriver
		System.out.println("WebDriver links number: " + driver.findElements(By.tagName("a")).size());

		// Print number of links present in a specific WebElement inside the WebDriver
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("WebElement links number: " + footerDriver.findElements(By.tagName("a")).size());

		// Print number of links present in a specific WebElement section inside the previous WebElement
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("WebElement section links number: " + columnDriver.findElements(By.tagName("a")).size());

		// Open the links in new tabs
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}
		
		// Print titles of all the new tabs
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}
}
