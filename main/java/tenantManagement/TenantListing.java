package tenantManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TenantListing {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		 driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[5]/a")).click();
boolean TennatName =driver.findElement(By.xpath("//div[contains(text(),'Kamal raj')]")).getText().contains("Kamal Raj");
boolean PgRoom =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[3]/div/div")).getText().contains("KG HOSTEL");
boolean RoomNo =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div")).getText().contains("1");
boolean mobileNo=driver.findElement(By.xpath("//div[normalize-space()='1234567890']")).getText().contains("1234567890");
boolean profession =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[6]/div")).getText().contains("Working");
	if(TennatName){
		System.out.println("Tenant Name listing Passed");
	}if(PgRoom){
		System.out.println("PgRoom listing Passed");
	}if(RoomNo){
		System.out.println("RoomNo listing Passed");
	}if(mobileNo){
		System.out.println("mobileNo listing Passed");
	}if(profession){
		System.out.println("profession listing Passed");
	}else{
		System.out.println("Tenant Listing Failed");
	}
		 //driver.close();		 
	}

}
