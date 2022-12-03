package uploadFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadFiles {

	public static void main(String[] args) throws InterruptedException, IOException {

		String downloadPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ChristianArdura\\Documents\\Cursos\\Curso_Selenium\\eclipse\\Browser_Drivers\\chromedriver.exe");


		//Set the download path in the chrome preferences
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);

		//Apply the Chrome preferences to the new driver
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);

		// Open web page and click on button "Select files"
		driver.get("https://pdflike.online/jpg-to-pdf");
		driver.findElement(By.xpath("//span[contains(text(),'Select files')]")).click();
		Thread.sleep(3000);

		// Execute the script "FileUploadScript.exe" created with "SciTE-Lite" to select
		// the file "C:\Users\ChristianArdura\Desktop\Config.png"
		Runtime.getRuntime()
				.exec("C:\\Users\\ChristianArdura\\Documents\\Cursos\\Curso_Selenium\\Apuntes\\FileUploadScript.exe");

		// Wait until button "Convert to PDF" appears and click on it.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='pdf submit']")));
		driver.findElement(By.xpath("//button[@class='pdf submit']")).click();

		// Wait until button "Download files" appears, modify file name and click on
		// button to download.
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Download files')]")));
		driver.findElement(By.xpath("//input[@id='filename']")).clear();
		driver.findElement(By.xpath("//input[@id='filename']")).sendKeys("test");
		driver.findElement(By.xpath("//span[contains(text(),'Download files')]")).click();
		Thread.sleep(5000);

		// Check the file has been downloaded
		File f = new File(downloadPath + "/pdflike.online_test_converted.pdf");
		if (f.exists()) {
			Assert.assertTrue(f.exists());
			if (f.delete()) {
				System.out.println("file deleted");
			}
		}

	}

}
