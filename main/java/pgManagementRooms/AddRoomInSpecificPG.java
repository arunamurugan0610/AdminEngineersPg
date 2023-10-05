package pgManagementRooms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddRoomInSpecificPG {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("https://3.110.102.12/");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
         driver.findElement(By.xpath("//div[contains(text(),'BoyS PG')]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Rooms']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		boolean room = driver.findElement(By.xpath("//p[normalize-space()='Room type is Required']")).getText().contains("Room type is Required");
		boolean roomRent = driver.findElement(By.xpath("//p[normalize-space()='Rent Amount is Required']")).getText().contains("Rent Amount is Required");
		boolean advanceAmt = driver.findElement(By.xpath("//p[normalize-space()='Advance Amount is Required']")).getText().contains("Advance Amount is Required");
		boolean roomNumber = driver.findElement(By.xpath("//p[normalize-space()='Room number is Required']")).getText().contains("Room number is Required");
		boolean roomSharing = driver.findElement(By.xpath("//p[normalize-space()='Room sharing is Required']")).getText().contains("Room sharing is Required");
		
		if(room){
			System.out.println("room textbox error - passed");
		}if(roomRent){
			System.out.println("roomRent textbox error - passed");
		}if(advanceAmt){
			System.out.println("advanceAmt textbox error - passed");
		}if(roomNumber){
			System.out.println("roomNumber textbox error - passed");
		}if(roomNumber){
			System.out.println("roomNumber textbox error - passed");
		}if(roomSharing){
			System.out.println("roomSharing textbox error - passed");
		}else{
			System.out.println("No error - Failed");
		}
		
		
		driver.close();
		
	}

}
