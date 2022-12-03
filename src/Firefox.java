import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

public static void main(String[] args) {
		
		//Create driver  object for Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		//Open window
		driver.get("https://login.salesforce.com/?locale=es");
		
		
		//Insert data using locators (id, name, xpath)
		driver.findElement(By.id("username")).sendKeys("user"); //If the id is alfanumeric ("0-2-e"), maybe is not a constant value and the search By.id could fail the next time.
		driver.findElement(By.name("pw")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id='Login']")).click();

		//Insert data using locators (cssSelector)
		driver.findElement(By.cssSelector("#username")).sendKeys("Email");
		driver.findElement(By.cssSelector("#password")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id='Login']")).click();

		//Imprimir error de login
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
		//Write title
		System.out.println(driver.getTitle());
		
	}

}
