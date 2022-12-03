package ajaxCalls_childWindows_iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajax_Mouse {

	public static void main(String[] args) {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.es/");
		driver.manage().window().maximize();
		
		WebElement move =driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		//Move mouse to specific element to display a panel
		Actions a = new Actions (driver);
		//a.moveToElement(driver.findElement(By.cssSelector("[id='nav-link-accountList']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();


	}

}
