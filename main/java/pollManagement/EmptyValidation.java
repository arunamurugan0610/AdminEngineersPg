package pollManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyValidation {

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
driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[6]/a")).click();
try{
	driver.findElement(By.xpath("//button[normalize-space()='Add New Poll']")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("//button[normalize-space()='Add New Poll']")).click();
}
driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
boolean PollTitle = driver.findElement(By.xpath("//p[normalize-space()='Title is Required']")).getText().contains("Title is Required");
boolean choosePG = driver.findElement(By.xpath("//p[normalize-space()='PG is Required']")).getText().contains("PG is Required");
boolean pollFor = driver.findElement(By.xpath("//p[normalize-space()='Field is rquired']")).getText().contains("Field is rquired");
boolean startdate = driver.findElement(By.xpath("//p[normalize-space()='Start date is Required']")).getText().contains("Start date is Required");
boolean endDate = driver.findElement(By.xpath("//p[normalize-space()='End date is Required']")).getText().contains("End date is Required");	 
boolean PollOptions = driver.findElement(By.xpath("//p[normalize-space()='Options are required']")).getText().contains("Options are required");
boolean description = driver.findElement(By.xpath("//p[normalize-space()='Description is Required']")).getText().contains("Description is Required");	
if(PollTitle){
	System.out.println("PollTitle error Passed");
}if(choosePG){
	System.out.println("choosePG error Passed");
}if(pollFor){
	System.out.println("pollFor error Passed");
}if(startdate){
	System.out.println("startdate error Passed");
}if(endDate){
	System.out.println("endDate error Passed");
}if(PollOptions){
	System.out.println("PollOptions error Passed");
}if(description){
	System.out.println("description error Passed");
}else{
	System.out.println("Empty validations Failed");
}
driver.close();


	}

}
