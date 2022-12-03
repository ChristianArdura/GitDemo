
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_For_Text_Siblings_Parent {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChristianArdura\\eclipse\\Browser_Drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://www.qaclickacademy.com/interview.php");
			
			Thread.sleep(2000);
			/*XPATH-TEXT -- Object identify by text */
			driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

			/*XPATH-SIBLING -- Object identify by sibling */
			driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

			/*XPATH-PARENT -- Object identify by parent */
			System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
			//
	}

}
