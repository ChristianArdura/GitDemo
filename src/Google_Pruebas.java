import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Pruebas {

public static void main(String[] args) {
		
		//Create driver  object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();


		//Open a URL in the Chrome browser
		driver.get("https://www.google.com");
		
		//Write title and URL
		System.out.println(driver.getTitle()); //Validate if your page  title is correct.
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL

		//Get page source (Sometimes right-click to get the code in the pages is disabled, so this method is the solution)
		System.out.println(driver.getPageSource());
		
		
		//Navigate to another page from current page and come back
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.xpath("//button[contains(@title,'Permitir todas las cookies')]")).click();
		//driver.findElement(By.cssSelector("button[title*='Permitir todas las cookies']")).click();		

		
		
		//Insert data using locators (id, name, linkText)
		driver.findElement(By.id("email")).sendKeys("Email"); //If the id is alfanumeric ("0-2-e"), maybe is not a constant value and the search By.id could fail the next time.
		driver.findElement(By.name("pass")).sendKeys("Password");
		driver.findElement(By.linkText("¿Has olvidado los datos de la cuenta?")).click();

		//Insert data using locators (cssSelector, xpath)
		driver.findElement(By.cssSelector("input#pass.inputtext.login_form_input_box")).sendKeys("Email");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("Password");

		
		//Close browsers
		driver.close(); //Close current browser
		//driver.quit(); //Close all the browsers opened by selenium script (Parent and childs)
		
	}



}
