package pgManagementSpecificPG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Complaints {

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
	driver.findElement(By.xpath("//div[normalize-space()='Complaints']")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("//div[normalize-space()='Complaints']")).click();	
}
boolean tenantName =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[2]/div/a")).getText().contains("Kamal raj");
boolean roomNum = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[3]/div")).getText().contains("1");
boolean complaintType =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div")).getText().contains("Food");
boolean acknowledgedBy=driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[5]/div/a")).getText().contains("Aruna");
boolean description = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[6]/div")).getText().contains("Food is not enough ");
boolean complaintdate = driver.findElement(By.xpath("//div[normalize-space()='03-10-2023 18:10:37 pm']")).getText().contains("03-10-2023 18:10:37 pm");


if(tenantName){
	System.out.println("Tenant name Listing Passed");
}if(roomNum){
	System.out.println("roomNum Listing Passed");
}if(complaintType){
	System.out.println("complaintType Listing Passed");
}if(acknowledgedBy){
	System.out.println("acknowledgedBy Listing Passed");
}if(description){
	System.out.println("description Listing Passed");
}if(complaintdate){
	System.out.println("complaintdate Listing Passed");
}else{
	System.out.println("Complaints History Listing Failed");
}
driver.close(); 
}

}
