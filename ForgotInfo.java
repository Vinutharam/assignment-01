import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ForgotInfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a"))).click().build().perform();
		
		driver.findElement(By.id("firstName")).sendKeys("rama");
		driver.findElement(By.id("lastName")).sendKeys("mohan");
		driver.findElement(By.id("address.street")).sendKeys("#12 3rd cross Btm layout bangalore");
		driver.findElement(By.id("address.city")).sendKeys(" bangalore");
		driver.findElement(By.id("address.state")).sendKeys("karnataka");
		driver.findElement(By.id("address.zipCode")).sendKeys("570014");
		driver.findElement(By.id("ssn")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input")).click();
		
		

	}

} 	 	
