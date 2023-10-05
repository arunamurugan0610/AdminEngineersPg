package specificEmployee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Complaints {

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
driver.findElement(By.xpath("//div[normalize-space()='Complaints']")).click();
boolean pGName =driver.findElement(By.xpath("//div[normalize-space()='KG HOSTEL']")).getText().contains("KG HOSTEL");
boolean raisedBy = driver.findElement(By.xpath("//a[normalize-space()='Kamal']")).getText().contains("Kamal");
boolean complaintType = driver.findElement(By.xpath("//div[contains(text(),'Food')]")).getText().contains("Food");
boolean complaintDescription = driver.findElement(By.xpath("//div[normalize-space()='the food is worst..']")).getText().contains("the food is worst..");
boolean date = driver.findElement(By.xpath("//div[normalize-space()='05-09-2023 08:09:78 am']")).getText().contains("05-09-2023 08:09:78 am");
boolean status = driver.findElement(By.xpath("//div[normalize-space()='Rejected']")).getText().contains("Rejected");

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr/td[8]/div/div/p")).click();
driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/div[1]/div/div/div[4]/div[1]/p")).sendKeys("Testing");
driver.findElement(By.xpath("//button[normalize-space()='Post comment']")).click();
boolean comment =driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[4]/article/div/p[1]/p")).getText().contains("Testing");
if(pGName){
	System.out.println("PG Name Listed Passed");
}if(raisedBy){
	System.out.println("Raised By Listed Passed");
}if(complaintType){
	System.out.println("Complaint Type Listed Passed");
}if(complaintDescription){
	System.out.println("complaint Description Listed Passed");
}if(date){
	System.out.println("Date & Time Listed Passed");
}if(status){
	System.out.println("Status Listed Passed");
}if(comment){
	System.out.println("comment Listed Passed");
}else{
	System.out.println("Complaints Listed Failed");
}
	  driver.close();   
	}

}
