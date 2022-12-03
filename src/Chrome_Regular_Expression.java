import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Regular_Expression {

	public static void main(String[] args) throws InterruptedException {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open a URL in the Chrome browser
		driver.get("https://rediff.com");

		// Insert data using xPath regular expression ( //tagName[contains(@attribute,'value')]  )
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();

		Thread.sleep(2000);
		
		// Insert data using CSS regular expression ( tagName[attribute*='value'] )
		driver.findElement(By.cssSelector("input[id*='log']")).sendKeys("Login");
	}

}
