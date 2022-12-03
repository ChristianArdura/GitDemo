package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
		// Create driver object for chrome browser and open page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\Documents\\Cursos\\Curso_Selenium\\eclipse\\Browser_Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet-herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
	}
}
