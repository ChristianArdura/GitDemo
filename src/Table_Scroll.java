import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Table_Scroll {

	public static void main(String[] args) throws InterruptedException {

		// Create driver object for chrome browser and open page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(	"https://rahulshettyacademy.com/AutomationPractice/");
		
		// Create a Javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// Move the window scroll 500 pixels (Y axis)
		js.executeScript("window.scrollBy(0,500)"); //window.scrollBy(X, Y);
		Thread.sleep(3000);
		
		// Move the window scroll top 5000 pixels (Y axis)
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		// Store the WebElements associated to the fourth column of the table "tableFixHead".
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); //nth-child(4): Select every fourth element from among any sibling group
		
		//Add the numbers stored in List "values"
		int sum=0;
		for (int i = 0; i < values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());// 103
		}
		System.out.println(sum);

		// Get the total amount displayed in the page (total) and compare it with the one calculated (sum)
		int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
	}

}