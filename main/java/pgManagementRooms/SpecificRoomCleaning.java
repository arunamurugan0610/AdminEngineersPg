package pgManagementRooms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificRoomCleaning {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("http://192.168.1.2:3000/");
		driver.manage().window().maximize();
//         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
//         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
         driver.findElement(By.xpath("//div[contains(text(),'BoyS PG')]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Rooms']")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[2]/div/div[3]/table/tbody/tr/td[2]/div/b")).click();
   try{
	driver.findElement(By.xpath("//div[normalize-space()='Cleaning']")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("//div[normalize-space()='Cleaning']")).click();
}
boolean cleaningPage= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/section/div/div/div[1]")).getText().contains("Cleaning Info");
if(cleaningPage){
	System.out.println("Cleaning page - Passed");
}else{
	System.out.println("Cleaning Page - Failed");
}
	
//	driver.close();
		
	}

}
