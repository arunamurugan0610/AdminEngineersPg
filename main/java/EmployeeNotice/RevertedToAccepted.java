package EmployeeNotice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RevertedToAccepted {

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
	    driver.findElement(By.xpath("//a[normalize-space()='Employee Notice']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Reverted']")).click();
        
        WebElement Status = driver.findElement(By.xpath(""));
          Select dropdown = new Select(Status);   
        dropdown.selectByVisibleText("Accepted"); 
       driver.findElement(By.xpath("//div[@class='se-wrapper-inner se-wrapper-wysiwyg sun-editor-editable']")).sendKeys("Your resignation accepted");
	    driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
       driver.findElement(By.xpath("//span[normalize-space()='Accepted']")).click();
	
boolean StatusChange =driver.findElement(By.xpath("//div[@class='font-bold capitalize cursor-pointer']")).getText().contains("Antony");
System.out.println(StatusChange);		
if (StatusChange){
	    	System.out.println("Status changed to hold");
	    }else{
	    	System.out.println("Status not changed to hold");
	    }
	driver.close();
	}

}
