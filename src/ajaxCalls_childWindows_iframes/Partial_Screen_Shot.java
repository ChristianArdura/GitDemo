package ajaxCalls_childWindows_iframes;

import java.io.File;

import java.io.IOException;

import java.util.Iterator;

import java.util.Set;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_Screen_Shot {

	public static void main(String[] args) throws IOException {

		// Create driver object for chrome browser and open page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys("PartialScreenShot");

		//Screenshot
		File file = name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("PartialScreenShot.png"));

		//driver.quit();

		//GEt Height & Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

	}

}
