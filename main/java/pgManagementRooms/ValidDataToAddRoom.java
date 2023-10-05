package pgManagementRooms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidDataToAddRoom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("http://192.168.1.12:3000/");
		driver.manage().window().maximize();
//         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
//         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
         driver.findElement(By.xpath("//div[contains(text(),'BoyS PG')]")).click();
		 driver.findElement(By.xpath("//div[normalize-space()='Rooms']")).click();
		 driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();
	 driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[1]/div")).click();
	 
		
	 WebElement selectField = driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[1]/div/div/div[1]/div[2]/input"));
	 selectField.sendKeys("abc");
	 selectField.sendKeys(Keys.ENTER);
	driver.findElement(By.name("rentAmount")).sendKeys("4000");
	driver.findElement(By.name("advanceAmount")).sendKeys("1000");
	driver.findElement(By.name("roomNumber")).sendKeys("300");
	driver.findElement(By.name("roomSharing")).sendKeys("3");
	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	boolean roomPresent = driver.findElement(By.xpath("//b[normalize-space()='300']")).getText().contains("300");
	if (roomPresent){
		System.out.println("Room added - passed");
	}else{
		System.out.println("Room not added - failed");
	}
	
	driver.close();
	}

}
