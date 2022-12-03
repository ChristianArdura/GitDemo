import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Relationship {

	public static void main(String[] args) throws InterruptedException {

		//Create driver  object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Open a URL in the Chrome browser
		driver.get("https://www.facebook.com");
		
		//INSERT DATA USING LOCATORS (cssSelector, xpath)
		driver.findElement(By.cssSelector("button[title*='Permitir todas las cookies']")).click();
		Thread.sleep(1000);

		/******** INSERT DATA USING LOCATORS ********************/

		/* LOCATOR id -- HTML ATTRIBUTE*/
		driver.findElement(By.id("email")).sendKeys("a"); //If the id is alfanumeric ("0-2-e"), maybe is not a constant value and the search By.id could fail the next time. Refreshh page to check it.
		
		/* LOCATOR name -- HTML ATTRIBUTE*/
		driver.findElement(By.name("pass")).sendKeys("a");
		
        /*******************************************************************************************************/
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		Thread.sleep(5000);
		
		// Insert data using parent relationship (Father: //*[@id='email_container'] -- Child 2: div[2] )
		System.out.println(driver.findElement(By.xpath("//*[@id='email_container']/div[2]")).getText());

		
		//Close browsers
		//driver.close(); //Close current browser
		//driver.quit(); //Close all the browsers opened by selenium script (Parent and childs)
		
	}

}
