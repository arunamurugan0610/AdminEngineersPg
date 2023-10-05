package leaveManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoldToApproved {

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
	    driver.findElement(By.xpath("//a[normalize-space()='Leave Management']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Hold']")).click();
        
        WebElement Status = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr[2]/td[8]/div/div/select"));
          Select dropdown = new Select(Status);   
        dropdown.selectByVisibleText("Approved"); 
	    driver.findElement(By.xpath("//span[normalize-space()='Approved']")).click();
	
boolean StatusChange =driver.findElement(By.xpath("//div[contains(text(),'Admin')]")).getText().contains("Admin");
System.out.println(StatusChange);		
if (StatusChange){
	    	System.out.println("Status changed to rejected");
	    }else{ 
	    	System.out.println("Status not changed to rejected");
	    }
	driver.close();
	}

}
