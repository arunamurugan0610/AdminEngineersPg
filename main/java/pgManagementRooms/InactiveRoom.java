package pgManagementRooms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InactiveRoom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
	     driver.findElement(By.xpath("//div[contains(text(),'Boys PG')]")).click();
	     driver.findElement(By.xpath("//div[normalize-space()='Rooms']")).click();
	
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[2]/div/div[3]/table/tbody/tr/td[8]/div/div/label/span/span[1]/input")).click();
	driver.findElement(By.xpath("//span[normalize-space()='InActive']")).click();
	
boolean inactiveRoom = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[2]/div/div[3]/table/tbody/tr/td[2]/div/b")).getText().contains("300");	
	
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[2]/div/div[3]/table/tbody/tr/td[8]/div/div/label/span/span[1]/input")).click();
driver.findElement(By.xpath("//span[normalize-space()='Active']")).click();

boolean activeRoom = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[2]/div/div[3]/table/tbody/tr/td[2]/div/b")).getText().contains("300");	

if(inactiveRoom){
		System.out.println("Inactivated Room");
	}else{
		System.out.println("Not inactivated Room");
	}
	
if(activeRoom){
	System.out.println("Activated Room");
}else{
	System.out.println("Not Activated Room");
}
	driver.close();
	}

}
