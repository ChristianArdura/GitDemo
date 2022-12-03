package Dropdowns;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

public static void main(String[] args) throws InterruptedException {

	// Create driver object for chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	//Open page
	driver.get("https://www.iberia.com//");
	driver.manage().window().fullscreen();

	//Accept cookies
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
	//Open doubts menu
	driver.findElement(By.xpath("//a[@data-dudes='dudes']")).click();
	
	Thread.sleep(3000);

	//Insert the character "pu" in the search field
	driver.findElement(By.id("search")).sendKeys("pu");
	
	Thread.sleep(3000);

	//Store all the elements found in a list
	List<WebElement> options =driver.findElements(By.cssSelector("ul[role='presentation'] li a"));

	// Search the option desired to click on.
	for(WebElement option:options)
	{
		System.out.println(option.getText());

		if(option.getText().equalsIgnoreCase("¿Puedo comprar los billetes en iberia.com con la bonificación de familia numerosa?"))
		{
			System.out.println("Found: " + option.getText());
			option.click();
			break;
		}
	}
	

	
}

}
