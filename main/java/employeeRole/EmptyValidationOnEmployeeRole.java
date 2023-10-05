package employeeRole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyValidationOnEmployeeRole {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/login");         
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.xpath("//li[3]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Employee Role']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Add Employee Role']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
			WebElement title=  driver.findElement(By.xpath("//small[contains(text(),'Title')]"));
			WebElement pageAccess=  driver.findElement(By.xpath("//small[contains(text(),'Any access')]"));
        if (title.isDisplayed()){
     	   System.out.println("Employee Role 'Title' error message displayed");
        }  
        if(pageAccess.isDisplayed()){
        	 System.out.println("Employee Role 'Page Access' error message displayed");
        }
        else{
     	   System.out.println("No validations");
        }
        
        
        
		driver.close(); 
	}

}

