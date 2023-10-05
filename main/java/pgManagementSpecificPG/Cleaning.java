package pgManagementSpecificPG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cleaning {

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
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[4]")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[4]")).click();	
}
boolean CleanedOn =driver.findElement(By.xpath("//div[contains(text(),'27/09/2023 05:09:00')]")).getText().contains("27/09/2023 05:09:00");
boolean roomNum = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[3]/div")).getText().contains("2");
boolean CleanedType = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[4]/div")).getText().contains("test room");
boolean cleanedBy = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[5]/div")).getText().contains("Cleaner");
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[6]/div/span")).click();
WebElement images = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[6]/div/span"));
if(images.isDisplayed()){
	System.out.println("Images displayed Passed");
}if(CleanedOn){
	System.out.println("Cleaned on Listing Passed");
}if(roomNum){
	System.out.println("roomNum Listing Passed");
}if(CleanedType){
	System.out.println("CleanedType Listing Passed");
}if(cleanedBy){
	System.out.println("cleanedBy Listing Passed");
}else{
	System.out.println("Cleaning Listing Failed");
}
driver.close();
	}

}
