import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Variable_Exercise {

	public static void main(String[] args) {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open page
		driver.get("https://qaclickacademy.com/practice.php");
		
		// Click on checkbox "Option1" and store value in a variable
		driver.findElement(By.id("checkBoxOption1")).click();
		String option =driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		System.out.println("Option selected: " + option);
		
		//Select dropdown option
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(option);
		
		// Insert the option in the text cell
		driver.findElement(By.id("name")).sendKeys(option);
		
		// Click on button to display the alert with the option selected
		driver.findElement(By.id("alertbtn")).click();			
	}
}
