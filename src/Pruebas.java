import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pruebas {

public static void main(String[] args) {
		
		//Create driver  object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//WebDriver driver2 =new ChromeDriver();


		//Open a URL in the Chrome browser
		driver.get("https://www.20minutos.es/");
		
		//Write title and URL
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("didomi-notice-agree-button")).click();
		//Get page source (Sometimes right-click to get the code in the pages is disabled, so this method is the solution)
		System.out.println(driver.getPageSource());
		

		

		
		//Close browsers
		//driver.close(); //Close current browser
		//driver2.close(); //Close current browser
		//driver.quit(); //Close all the browsers opened by selenium script (Parent and childs)
		
	}

}
