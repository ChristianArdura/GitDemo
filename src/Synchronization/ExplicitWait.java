package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		//driver.findElement(By.cssSelector("a[href*='loadAjax']")).click(); // Other option
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='results']")));
		
        System.out.println(driver.findElement(By.cssSelector("div[id='results']")).getText());

		driver.close();

	}
}
