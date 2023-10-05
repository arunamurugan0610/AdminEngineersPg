package specificTenant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SosHistory {

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
driver.findElement(By.xpath("//div[normalize-space()='SOS History']")).click();
boolean RaisedOn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div")).getText().contains("26-09-2023 11:09:65 am");
boolean RespondedBy = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[3]/div/a")).getText().contains("Aruna Murugan");
boolean RespondedOn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div")).getText().contains("26-09-2023 11:09:65 am");
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/div")).click();
boolean description = driver.findElement(By.xpath("/html/body/div/div[4]/div/h3")).getText().contains("Description");
driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
boolean status = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[6]/div/div")).getText().contains("Acknowledge");
if(RaisedOn){
	System.out.println("Raised On listing Passed");
}if(RespondedBy){
	System.out.println("Responded By listing Passed");
}if(RespondedOn){
	System.out.println("Responded On listing Passed");
}if(description){
	System.out.println("Description listing Passed");
}if(status){
	System.out.println("Status listing Passed");
}else{
	System.out.println("SOS History Listing Failed");
}
driver.close();
	}

}
