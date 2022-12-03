package ajaxCalls_childWindows_iframes;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Window_Exercise {

	public static void main(String[] args) {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open to child page
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

		//Get windows handlers
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		//Go to child window
		driver.switchTo().window(childId);
		System.out.println("Child page: " + driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		//Get the email from a sentence in the child window and insert it in the parent window cell.
		driver.switchTo().window(parentId);
		System.out.println("Parent page: " + driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

	}

}
