package SpecificPollDetails;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class overview {

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
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[6]/a")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Dinner For October Seven']")).click();
boolean visitorCount =driver.findElement(By.xpath("//span[normalize-space()='1']")).getText().contains("1");
boolean responedCount =driver.findElement(By.xpath("//span[normalize-space()='0']")).getText().contains("0");	
	
	if(visitorCount){
		System.out.println("Visitor Count Passed");
	}if(responedCount){
		System.out.println("Responded Count Passed");
	}else{
		System.out.println("Overview Listing Failed");
	}
	
	driver.close();	
	}

}
