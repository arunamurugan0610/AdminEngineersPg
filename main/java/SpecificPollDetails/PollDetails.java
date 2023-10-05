package SpecificPollDetails;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollDetails {

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
	boolean visitorName = driver.findElement(By.xpath("//div[normalize-space()='Admin']")).getText().contains("Admin");
	
	if(visitorName){
		System.out.println("visitor Name Listing Passed");
	}else{
		System.out.println("Vistor Name Listing Failed");
	}
	
	driver.close();	
	}

}
