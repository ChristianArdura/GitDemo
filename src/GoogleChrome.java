import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {

public static void main(String[] args) throws InterruptedException {
		
		//Create driver  object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//WebDriver driver2 =new ChromeDriver();


		//Open a URL in the Chrome browser
		driver.get("https://google.com");
		
		//Write title and URL
		System.out.println(driver.getTitle()); //Validate if your page  title is correct.
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL

		//Get page source (Sometimes right-click to get the code in the pages is disabled, so this method is the solution)
		System.out.println(driver.getPageSource());
		
		// Open another page
		//driver2.get("https://20minutos.com");

		
		//Navigate to another page from current page and come back
		driver.navigate().to("https://www.facebook.com");
		//driver.navigate().back();
		///driver.navigate().forward();

		//INSERT DATA USING LOCATORS (cssSelector, xpath)
		/* Insert data using CSS HTML attributes ( tagName[attribute*='value'] )  ---  ( tagName#value )*/
		driver.findElement(By.cssSelector("button[title*='Permitir todas las cookies']")).click();
		//driver.findElement(By.cssSelector("*[title*='Permitir todas las cookies']")).click();
		//driver.findElement(By.cssSelector("[title*='Permitir todas las cookies']")).click();
		/* Insert data using xPath regular expression ( //tagName[contains(@attribute,'value')]  )*/
		//driver.findElement(By.xpath("//button[contains(@title,'Permitir todas las cookies')]")).click();
		Thread.sleep(1000);

		
		/******** INSERT DATA USING LOCATORS (id, name, linkText, xpath and cssSelector )  ********************/

		/* LOCATOR id -- HTML ATTRIBUTE*/
		driver.findElement(By.id("email")).sendKeys("a"); //If the id is alfanumeric ("0-2-e"), maybe is not a constant value and the search By.id could fail the next time. Refreshh page to check it.
		
		/* LOCATOR name -- HTML ATTRIBUTE*/
		driver.findElement(By.name("pass")).sendKeys("a");

		/* LOCATOR xpath -- HTML ATTRIBUTES*/
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password");
		
		/* LOCATOR xpath -- REGULAR EXPRESSION ( tagName[attribute*,'value')]  )*/
		//driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Password");
	
		/* LOCATOR cssSelector -- HTML ATTRIBUTES*/
		//driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Password");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("Password");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("Password");
		
		/* LOCATOR cssSelector -- REGULAR EXPRESSION ( tagName[attribute*,'value')]  )*/
		//driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("Password");
		
		/*LOCATOR "linkText" is used for the tagName "a" (<a href="...">Texto </a>). */
		//driver.findElement(By.linkText("¿Has olvidado la contraseña?")).click();
		
        /*******************************************************************************************************/
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		Thread.sleep(2000);
		
		// Insert data using parent relationship (Father: //*[@id='email_container'] -- Child 2: div[2] )
		System.out.println(driver.findElement(By.xpath("//*[@id='email_container']/div[2]")).getText());

	
		//Close browsers
		//driver.close(); //Close current browser
		//driver2.close(); //Close current browser
		//driver.quit(); //Close all the browsers opened by selenium script (Parent and childs)
		
	}



}
