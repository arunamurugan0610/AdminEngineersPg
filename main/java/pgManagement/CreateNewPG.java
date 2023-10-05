package pgManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewPG {

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
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
         try {
        	    WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/main/div[1]/div[1]/div/div/button"));
        	    element.click();
        	} catch (StaleElementReferenceException e) {
        	    WebElement newElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/main/div[1]/div[1]/div/div/button"));
        	    newElement.click();
        	}  
driver.findElement(By.xpath("//input[@placeholder='Enter PG name']")).sendKeys("BoyS PG");
driver.findElement(By.xpath("//input[@placeholder='Enter google map url']")).sendKeys("https://www.google.com/maps");
driver.findElement(By.xpath("//input[@placeholder='Enter EB Per Unit']")).sendKeys("400");
WebElement PgType = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div[1]/div[3]/select")); 
Select Type = new Select(PgType);               
Type.selectByVisibleText("Boys");     
WebElement PgManager = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div[1]/div[4]/select")); 
Select manager = new Select(PgManager);
manager.selectByVisibleText("Aruna Murugan");  

driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[7]/div[1]/div[1]/div[4]/div[1]")).sendKeys("Description");
driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[8]/div[1]/div[1]/div[4]/div[1]/p[1]")).sendKeys("Terms & conditions");
driver.findElement(By.xpath("//textarea[@placeholder='Enter address']")).sendKeys("Address");

driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[9]/div[1]/div[1]/div[1]/div[2]")).click();
driver.findElement(By.xpath("//div[contains(text(),'WIFI')]")).click();
driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[9]/div[1]/div[1]/div[1]/div[2]")).click();
driver.findElement(By.xpath("//div[contains(text(),'refrigerator')]")).click();

driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[10]/div[1]/div[1]/div[1]")).click();
driver.findElement(By.xpath("//div[contains(text(),'Michael antony')]")).click();
driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[10]/div[1]/div[1]/div[1]")).click();
driver.findElement(By.xpath("//div[contains(text(),'Arunkumar v')]")).click();

WebElement fileInput = driver.findElement(By.id("customFileEg1"));
String imagePath1 = "C:/Users/Yuvasri/Downloads/dummy/Cute-Books-Pfp.jpg"; 
String imagePath2 = "C:/Users/Yuvasri/Downloads/dummy/depositphotos_252391082-stock-photo-sweet-chocolate-cake-on-wooden.jpg";
fileInput.sendKeys(imagePath1 + "\n"+imagePath2);
driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
boolean message = driver.findElement(By.xpath(" //div[contains(text(),'Boys PG')]")).getText().contains("Boys PG");
if (message){
	System.out.println("PG created - Passed");
}else{
	System.out.println("PG not created - Passed");
}

driver.close();
	}

}
