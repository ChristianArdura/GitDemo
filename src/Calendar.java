import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open page
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();

		//Open date calendar
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();

		//Search May
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) {
			//While May is not found click on next button to pass to the next month
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		//List<WebElement> dates = driver.findElements(By.className("day"));
		
		// Get WebElement size
		int count = driver.findElements(By.className("day")).size();
		System.out.println("Day count: " + count);

		// Search day one in the calendar WebElement selected
		int dayOne =0;
		String text= driver.findElements(By.className("day")).get(dayOne).getText();
		while(!text.equalsIgnoreCase("1")) {
			text = driver.findElements(By.className("day")).get(dayOne).getText();
			dayOne++;
		}
		
		//Search day 21
		for (int i = dayOne; i < count; i++) {
			text= driver.findElements(By.className("day")).get(i).getText();

			if (text.equalsIgnoreCase("26")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
	}

}
