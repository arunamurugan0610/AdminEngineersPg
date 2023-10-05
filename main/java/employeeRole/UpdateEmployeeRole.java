package employeeRole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateEmployeeRole {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
  		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.xpath("//li[3]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Employee Role']")).click();
		 try{
		WebElement element= driver.findElement(By.xpath("//button[normalize-space()='Add Employee Role']"));
		element.click();
		 }catch (StaleElementReferenceException e) {
			    WebElement newElement = driver.findElement(By.xpath("//button[normalize-space()='Add Employee Role']"));
			    newElement.click();
		 }
	
		 driver.findElement(By.xpath("//input[@placeholder='Enter role title']")).sendKeys("Sub Manager");
		 driver.findElement(By.xpath("//div[3]//div[2]//div[1]//div[1]//div[1]//div[1]//label[1]//input[1]")).click();
		 driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]/div/div/span[1]")).click();	 
	WebElement updateRole=driver.findElement(By.xpath("//input[@placeholder='Enter role title']"));
	updateRole.sendKeys(Keys.CONTROL + "a");
	updateRole.sendKeys(Keys.DELETE);
	updateRole.sendKeys("SubAdmin");
	driver.findElement(By.xpath("//div[3]//div[2]//div[1]//div[1]//div[1]//div[1]//label[1]//input[1]")).click();
	driver.findElement(By.xpath("//div[3]//div[2]//div[1]//div[1]//div[1]//div[1]//label[1]//input[1]")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		try {
	    
	    WebElement roleElement = driver.findElement(By.xpath("//input[@placeholder='Enter role title']"));
	    boolean containsSubAdmin = roleElement.getAttribute("value").contains("SubAdmin");
	    if (containsSubAdmin) {
	        System.out.println("Updated role title");
	    } else {
	        System.out.println("Not updated");
	    }
	} catch (StaleElementReferenceException e) {
	    System.out.println("StaleElementReferenceException occurred. Handling it here.");
	}

	try {
	    WebElement pageAccessElement = driver.findElement(By.xpath("//div[3]//div[2]//div[1]//div[1]//div[1]//div[1]//label[1]//input[1]"));
	    boolean pageaccess = pageAccessElement.getAttribute("value").contains("true");

	    if (pageaccess) {
	        System.out.println("Updated page Access");
	    } else {
	        System.out.println("Not updated the field");
	    }
	} catch (StaleElementReferenceException e) {
	    System.out.println("StaleElementReferenceException occurred. Handling it here.");
	}	
	driver.close();
	
	}

}
