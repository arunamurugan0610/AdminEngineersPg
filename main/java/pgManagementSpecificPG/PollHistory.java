package pgManagementSpecificPG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollHistory {

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
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[10]")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[10]")).click();	
}
boolean pollTitle =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div/div/a")).getText().contains("Who Will Win Today's World Cup Match?");	
boolean startDate = driver.findElement(By.xpath("//div[normalize-space()='05-10-2023']")).getText().contains("05-10-2023");
boolean endDate = driver.findElement(By.xpath("//div[normalize-space()='06-10-2023']")).getText().contains("06-10-2023");	
boolean pollFor = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div")).getText().contains("Tenant");
boolean pollStatus = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[6]/div/div/span")).getText().contains("Open");
	if(pollTitle){
		System.out.println("pollTitle Listing Passed");
	}if(startDate){
		System.out.println("startDate Listing Passed");
	}if(endDate){
		System.out.println("endDate Listing Passed");
	}if(pollFor){
		System.out.println("pollFor Listing Passed");
	}if(pollStatus){
		System.out.println("pollStatus Listing Passed");
	}else{
		System.out.println("Poll History Listing Failed");
	}
	driver.close();
	}

}
