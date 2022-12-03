import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IExplorer {

public static void main(String[] args) {
		
		//Create driver  object for Internet explorer browser
		/* Selenium version: 3.141.59 --> IExplorer driver version: 3.141.59) *
		 * IE ZOOM must be 100%                                               */
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	
		//Open window
		driver.get("https://google.com");

		//Write title
		System.out.println(driver.getTitle());
		
	}

}
