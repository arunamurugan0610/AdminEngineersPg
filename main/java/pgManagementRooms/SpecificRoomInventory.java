package pgManagementRooms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificRoomInventory {

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
         driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div/div/div[2]")).click();
    try{
    	driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();
    }catch(StaleElementReferenceException e){
    	driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();
    }
      driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[1]/div")).click();
      driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
       driver.findElement(By.name("quantity")).sendKeys("20");
driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
boolean inventorylist = driver.findElement(By.xpath("//h3[normalize-space()='Add Inventory']")).getText().contains("Add Inventory");
if(inventorylist){
	System.out.println("Inventory Added - Failed");
}else{
	System.out.println("Inventory Added - Passed");
}
//driver.close();


	}

}
