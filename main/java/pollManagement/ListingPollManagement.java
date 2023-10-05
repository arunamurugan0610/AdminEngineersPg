package pollManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListingPollManagement {

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
	
	boolean Title =driver.findElement(By.xpath("//a[normalize-space()='Test Poll']")).getText().contains("Test Poll");
System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[2]/td[3]/div/div/div")));
System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[1]/td[3]/div/div/div[2]")));
boolean PGName1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[1]/td[3]/div/div/div[1]")).getText().contains("Vidhya PG");
boolean PGName2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[1]/td[3]/div/div/div[2]")).getText().contains("KG HOSTEL");
boolean StartDate = driver.findElement(By.xpath("//div[normalize-space()='04-10-2023']")).getText().contains("04-10-2023");
boolean EndDate = driver.findElement(By.xpath("//div[contains(text(),'07-10-2023')]")).getText().contains("07-10-2023");	
boolean pollFor = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[1]/td[6]/div")).getText().contains("Tenant");
boolean pollStatus = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[1]/td[7]/div/div/span")).getText().contains("Open");
if(Title){
	System.out.println("Title Listing Passed");
}if(PGName1){
	System.out.println("PGName1 Listing Passed");
}if(PGName2){
	System.out.println("PGName2 Listing Passed");
}if(StartDate){
	System.out.println("StartDate Listing Passed");
}if(EndDate){
	System.out.println("EndDate Listing Passed");
}if(pollFor){
	System.out.println("pollFor Listing Passed");
}if(pollStatus){
	System.out.println("pollStatus Listing Passed");
}
driver.close();
	}

}
