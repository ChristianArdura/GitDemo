import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		//Create driver  object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Open window
		driver.get("https://google.com");
		//Write title
		System.out.println(driver.getTitle());
		
	}

}
