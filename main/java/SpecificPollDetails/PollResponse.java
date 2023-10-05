package SpecificPollDetails;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollResponse {

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
	driver.findElement(By.xpath("//a[normalize-space()='Dinner for october four']")).click();
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[3]/div[1]/div/div[2]")).click();
boolean respondedName =	driver.findElement(By.xpath("//div[normalize-space()='Kamal raj']")).getText().contains("Kamal raj");
boolean respondedOption= driver.findElement(By.xpath("//div[normalize-space()='Yes']")).getText().contains("Yes");
	if(respondedName){
		System.out.println("Responded Name Listing Passed");
	}if(respondedOption){
		System.out.println("Responded option Listing Passed");
}else{
	System.out.println("Poll response Listing Failed");
}
	//driver.close();
	
	}

}
