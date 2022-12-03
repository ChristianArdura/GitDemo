import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Labels {

public static void main(String[] args) throws InterruptedException {

	// Create driver object for chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	//Open page
	driver.get("https://www.iberia.com/");
	driver.manage().window().fullscreen();

	//Accept cookies
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	
	
	//Checkbox selected
	System.out.println("BEFORE CLICK - paywithAvios before being checked:" + driver.findElement(By.id("paywithAvios")).isSelected());
	//Check expected result (False)
	Assert.assertFalse(driver.findElement(By.id("paywithAvios")).isSelected());
	Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input[id*='paywithAvios']")).click(); //Is not working, maybe because the label
	driver.findElement(By.cssSelector("label[for='paywithAvios']")).click();
	System.out.println("AFTER CLICK - paywithAvios is checked:" + driver.findElement(By.id("paywithAvios")).isSelected());
	//Check expected result (True)
	Assert.assertTrue(driver.findElement(By.id("paywithAvios")).isSelected());

	//Store all the elements found in a list
	System.out.println("Number of labels: " + driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label[1]")).size());
	//Check expected result (12)
	Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label[1]")).size(), 12);
	List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label[1]"));
	for(WebElement checkbox:checkboxList) {
		if (checkbox.isDisplayed()) {
			System.out.println("-----------------------");
			System.out.println("Text: " + checkbox.getText());
			System.out.println("Size: " + checkbox.getSize());
			//Check expected result ("Pagar con Avios")
			Assert.assertEquals(checkbox.getText(), "Pagar con Avios");
			System.out.println("-----------------------");
		}
	}
		
}

}
