package ajaxCalls_childWindows_iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Exercise {

	public static void main(String[] args) {
		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open page
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	
		//Switch to top frame
		System.out.println("Number of frames: " + driver.findElements(By.tagName("frame")).size());
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		driver.switchTo().frame("frame-top");
		
		//Switch to middle frame (Inside top frame)
		System.out.println("Number of frames: " + driver.findElements(By.tagName("frame")).size());
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		driver.switchTo().frame("frame-middle");
		
		//Print middle frame text
		System.out.println("Frame content: " + driver.findElement(By.id("content")).getText());
		//System.out.println("Frame content: " + driver.findElement(By.cssSelector("div[id='content']")).getText());

		//Come back to default window
		driver.switchTo().defaultContent();
	}
}
