import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Certifications {

	public static void main(String[] args) {

		//Desired capabilities=general chrome profile
		DesiredCapabilities ch = new DesiredCapabilities();
		
		//Accept insecure certificates
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		//Accept SSL certificates
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belows to your local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		// Create driver object for chrome browser and open page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("http://qaclickacademy.com/practice.php");

	}

}