package remote_tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Remote_Test {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		//dc.setBrowserName("firefox");
		dc.setPlatform(Platform.LINUX);
		//dc.setPlatform(Platform.MAC);
		
		//WebDriver driver = new RemoteWebDriver(new URL("http://10.10.10.5:4444/wd/hub"),dc);
		//WebDriver driver = new RemoteWebDriver(new URL("http://10.10.10.5:4444"),dc);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.45:4444"),dc);
		driver.get("http://google.com");
		
		//Accept cookies
		driver.findElement(By.xpath("//div[contains(text(),'Acepto')]")).click();
		
		//Write title and URL
		System.out.println(driver.getTitle()); //Validate if your page  title is correct.
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL
	
	}

}
