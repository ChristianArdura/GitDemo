

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Labels2 {

public static void main(String[] args) throws InterruptedException {

	// Create driver object for chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	//Open page
	driver.get("https://www.booking.com/");
	driver.manage().window().fullscreen();

	//Accept cookies
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	
	
	//Checkbox selected
	System.out.println("BEFORE CLICK - Checkbox is checked:" + driver.findElement(By.name("sb_travel_purpose")).isSelected());
	Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input[id*='paywithAvios']")).click(); //Is not working, maybe because the label
	driver.findElement(By.name("sb_travel_purpose")).click();
	System.out.println("AFTER CLICK - Checkbox is checked:" + driver.findElement(By.id("paywithAvios")).isSelected());
	
	//Store all the elements found in a list
	System.out.println("Number of labels: " + driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label[1]")).size());

	List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label[1]"));
	for(WebElement checkbox:checkboxList) {
		if (checkbox.isDisplayed()) {
			System.out.println("-----------------------");
			System.out.println("Text: " + checkbox.getText());
			System.out.println("Size: " + checkbox.getSize());
			System.out.println("-----------------------");
		}
	}
		
}

}
