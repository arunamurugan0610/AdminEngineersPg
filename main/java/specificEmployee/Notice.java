package specificEmployee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notice {

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
         driver.findElement(By.xpath("//a[normalize-space()='antony']")).click();
         driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[5]")).click();
	boolean DateTime = driver.findElement(By.xpath("//div[normalize-space()='23-09-2023 11:09:11 am']")).getText().contains("23-09-2023 11:09:11 am");
	boolean status = driver.findElement(By.xpath("//div[normalize-space()='Accepted']")).getText().contains("Accepted");
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr/td[3]/div/div/div")).click();
	boolean reason = driver.findElement(By.xpath("//h3[normalize-space()='Description']")).getText().contains("Description");
	driver.findElement(By.xpath("/html/body/div/div[4]/div/button")).click();
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr/td[5]/div/div/p")).click();
	driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/div[1]/div/div/div[4]/div[1]/p")).sendKeys("Testing");
	driver.findElement(By.xpath("//button[normalize-space()='Post comment']")).click();
	boolean comment =driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[11]/article/div/p[1]/p[1]")).getText().contains("Testing Team");
	if(DateTime){
		System.out.println("Date & Time Listed in Notice Passed");
	}if(status){
		System.out.println("status Listed in Notice Passed");
	}if(reason){
		System.out.println("reason Listed in Notice Passed");
	}if(comment){
		System.out.println("Comment Listed in Notice Passed");
	}else{
		System.out.println("Listed in Notice Failed");
	}
driver.close();
	
	}

}
