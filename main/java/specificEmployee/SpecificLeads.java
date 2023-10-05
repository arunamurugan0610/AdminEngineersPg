package specificEmployee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificLeads {

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
		 driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
	     driver.findElement(By.xpath("//a[normalize-space()='Arunkumar v']")).click();
	     boolean PgName = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div")).getText().contains("KG HOSTEL");
	boolean name = driver.findElement(By.xpath("//div[normalize-space()='Sridhar Chandrasekar']")).getText().contains("Sridhar Chandrasekar");
	boolean phoneNo= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[2]/td[4]/div")).getText().contains("1234567890");
	boolean referredBy = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[2]/td[5]/div")).getText().contains("test");
	if(PgName){
		System.out.println("Lead PgName Passed");
	}if(name){
		System.out.println("Lead Name Passed");
	}if(phoneNo){
		System.out.println("Lead phoneNo Passed");
	}if(referredBy){
		System.out.println("Lead referredBy Passed");
	}else{
		System.out.println("Lead Listing Failed");
	}
	
	driver.close();

	}

}
