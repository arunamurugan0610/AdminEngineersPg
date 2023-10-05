package SpecificPollDetails;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicInfo {

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
try{
	boolean polltitle =driver.findElement(By.xpath("//td[normalize-space()='Dinner For October Seven']")).getText().contains("Dinner For October Seven");
	if(polltitle){
		System.out.println("polltitle listing passed");
	}
}catch(StaleElementReferenceException e){
	boolean polltitle =driver.findElement(By.xpath("//td[normalize-space()='Dinner For October Seven']")).getText().contains("Dinner For October Seven");
	if(polltitle){
		System.out.println("polltitle listing passed");
	}
}
boolean pollfor=driver.findElement(By.xpath("//td[normalize-space()='Employee']")).getText().contains("Employee");
boolean startdate=driver.findElement(By.xpath("//td[normalize-space()='06-10-2023']")).getText().contains("06-10-2023");
boolean endDate =driver.findElement(By.xpath("//td[normalize-space()='08-10-2023']")).getText().contains("08-10-2023");
boolean choosePG1 =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[1]/div/div/table/tbody/tr[5]/td[3]")).getText().contains("Boys Hostel");	
boolean choosePg2=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/span[1]")).getText().contains("Boys PG");	
boolean option1 =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[1]/div/div/table/tbody/tr[6]/td[3]/span[1]")).getText().contains("I Need");
boolean option2 =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[1]/div/div/table/tbody/tr[6]/td[3]/span[2]")).getText().contains("I don't Need");
boolean description =driver.findElement(By.xpath("//td[contains(@class,'pl-1')]//div")).getText().contains("");
if(pollfor){
	System.out.println("pollfor listing passed");
}if(startdate){
	System.out.println("startdate listing passed");
}if(endDate){
	System.out.println("endDate listing passed");
}if(choosePG1){
	System.out.println("choosePG1 listing passed");
}if(choosePg2){
	System.out.println("choosePg2 listing passed");
}if(option1){
	System.out.println("option1 listing passed");
}if(option2){
	System.out.println("option2 listing passed");
}if(description){
	System.out.println("description listing passed");
}else{
	System.out.println("poll Details listing Failed");
}
driver.close();
	}

}
