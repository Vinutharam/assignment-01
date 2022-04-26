package com.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register extends WebDriverInitializer {
	
	
	public void test () {
		
		
		WebDriver driver= initDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a"))).click().build().perform();
		
		driver.findElement(By.id("customer.firstName")).sendKeys("rama");
		driver.findElement(By.id("customer.lastName")).sendKeys("mohan");
		driver.findElement(By.id("customer.address.street")).sendKeys("#12 3rd cross Btm layout bangalore");
		
		driver.findElement(By.id("customer.address.city")).sendKeys(" bangalore");
		driver.findElement(By.id("customer.address.state")).sendKeys("karnataka");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("570014");
		driver.findElement(By.id("customer.ssn")).sendKeys("123");
		
		driver.findElement(By.id("customer.username")).sendKeys("rama");
		driver.findElement(By.id("customer.password")).sendKeys("Welcome"); 	
		driver.findElement(By.id("repeatedPassword")).sendKeys("Welcome"); 	
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	}

	public static void main(String[] args) {
		new Register().test();
	}

}
