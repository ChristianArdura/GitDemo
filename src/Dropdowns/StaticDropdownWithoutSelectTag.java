package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		// Open a URL in the Chrome browser with full screen
		driver.get("https://beta.spicejet.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		//DROPDOWN (Adults) - Select 4 adults
		driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();
		//driver.findElement(By.xpath("//div[@id='react-root']/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]")).click(); //Alternative
		for(int i=0;i<3;i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
	
				//Check final value (4 adults)
		System.out.println(driver.findElement(By.xpath("//div[@id='react-root']/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText());


	
	}

}

