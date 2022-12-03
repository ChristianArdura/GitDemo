import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize window and delete all cookies
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Open a URL in the Chrome browser with full screen
		getScreenshot(driver);

	}

	public static void getScreenshot(WebDriver driver) throws IOException {
		driver.get("https://beta.spicejet.com/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\ChristianArdura\\Documents\\Cursos\\Selenium\\screenshot.png"));
	}
}
