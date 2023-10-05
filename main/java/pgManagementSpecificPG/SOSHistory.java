package pgManagementSpecificPG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SOSHistory {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("https://3.110.102.12/");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
         driver.findElement(By.xpath("//div[contains(text(),'KG HOSTEL')]")).click();
try{
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[3]")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[3]")).click();
}
boolean RaisedBy =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div/a")).getText().contains("Vidhya");
boolean RaisedOn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[3]/div")).getText().contains("03-10-2023 13:10:73 pm");
boolean ResponsedBy = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/a")).getText().contains("Aruna");
boolean RespondedOn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]")).getText().contains("03-10-2023 13:10:73 pm");
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[6]/div/div/div")).click();
	boolean description = driver.findElement(By.xpath("//h3[normalize-space()='Description']")).getText().contains("Description");
	
	if(RaisedBy){
		System.out.println("Raised By Listing Passed");
	}if(RaisedOn){
		System.out.println("Raised On Listing Passed");
	}if(ResponsedBy){
		System.out.println("Responsed By Listing Passed");
	}if(RespondedOn){
		System.out.println("Responded On Listing Passed");
	}if(description){
		System.out.println("description On Listing Passed");
	}else{
		System.out.println("SOS history Listing Failed");
	}
	driver.close();	
	}

}
