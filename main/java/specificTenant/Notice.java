package specificTenant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notice {

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
driver.findElement(By.xpath("//div[contains(text(),'Kamal raj')]")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[1]/div/div/div[8]")).click();
boolean NoticeRaisedDateTime =driver.findElement(By.xpath("//div[normalize-space()='09-09-2023 10:09:56 am']")).getText().contains("09-09-2023 10:09:56 am"); 
boolean reason = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[3]/div")).getText().contains("description");
boolean status =driver.findElement(By.xpath("//div[normalize-space()='Submited']")).getText().contains("Submited");

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/p")).click();
driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/div[1]/div/div/div[4]/div[1]")).sendKeys("Testing");
driver.findElement(By.xpath("//button[normalize-space()='Post comment']")).click();
boolean comment =driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/div[1]/div/div/div[4]/div[1]")).getText().contains("Testing");

if(NoticeRaisedDateTime){
	System.out.println("NoticeRaisedDateTime Listing Passed");
}if(reason){
	System.out.println("reason Listing Passed");
}if(status){
	System.out.println("status Listing Passed");
}if(comment){
	System.out.println("comment Listing Passed");
}else{
	System.out.println("Notice history listing Failed");
}

driver.close();
	}

}
