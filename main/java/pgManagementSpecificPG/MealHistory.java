package pgManagementSpecificPG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MealHistory {

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
	driver.findElement(By.xpath("//div[normalize-space()='Meal History']")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("//div[normalize-space()='Meal History']")).click();	
}
boolean mealtakenBy = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/div/div/div[3]/table/tbody/tr[1]/td[2]/div")).getText().contains("Raj Kamal");
boolean roomNo = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/div/div/div[3]/table/tbody/tr[1]/td[3]/div")).getText().contains("1");
boolean mealDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/div/div/div[3]/table/tbody/tr[1]/td[4]/div")).getText().contains("28/09/2023 10:09:55");
boolean mealMenu = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[3]/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div")).getText().contains("test");
if(mealtakenBy){
	System.out.println("mealtakenBy Listing Passed");
}if(roomNo){
	System.out.println("roomNo Listing Passed");	
}if(mealDate){
	System.out.println("mealDate Listing Passed");	
}if(mealMenu){
	System.out.println("mealMenu Listing Passed");	
}else{
System.out.println("Meal History Listing Failed");
}
driver.close();
	}

}
