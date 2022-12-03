import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {

public static void main(String[] args) throws InterruptedException {
		
		//Create driver  object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//WebDriver driver2 =new ChromeDriver();


		//Open a URL in the Chrome browser
		driver.get("https://google.com");
		
		//Write title and URL
		System.out.println(driver.getTitle()); //Validate if your page  title is correct.
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL

		//Get page source (Sometimes right-click to get the code in the pages is disabled, so this method is the solution)
		System.out.println(driver.getPageSource());
		
		
	
		//Close browsers
		//driver.close(); //Close current browser

		
	}



}
