package pollManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatePollDetails {

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
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[1]/td[8]/div/div/span[1]")).click();
	
		 WebElement Title =driver.findElement(By.name("title"));
		 Title.sendKeys(Keys.CONTROL + "a");
		 Title.sendKeys(Keys.DELETE);
		 Title.sendKeys("Dinner For October Seven");
	
		 WebElement description = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[7]/div/div/div[4]/div[1]"));
		 description.sendKeys(Keys.CONTROL + "a");
		 description.sendKeys(Keys.DELETE);
		 description.sendKeys("Because its weekend");
	
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[3]/div/div")).click();;
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		 
		 CharSequence[]	StartDate ={"06-10-2023"};
		 WebElement Start_Date = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[4]/div/div/input"));
		 Start_Date.click();
		 Start_Date.clear();			    
		 Start_Date.sendKeys(StartDate);
		 Start_Date.sendKeys(Keys.ENTER);

		 CharSequence[]	EndDate ={"08-10-2023"};
		 WebElement End_Date = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[5]/div/div/input"));
		 End_Date.click();
		 End_Date.clear();			    
		 End_Date.sendKeys(EndDate);
		 End_Date.sendKeys(Keys.ENTER);
		 
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[6]/div/div[1]/div[1]/div[1]/div[2]")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[6]/div/div[1]/div[1]/div[1]/div[2]")).click();
WebElement pollOption1 =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[6]/div/div[1]/div[1]/div[2]/input"));
pollOption1.sendKeys("I Need");
pollOption1.sendKeys(Keys.ENTER);	 
WebElement pollOption2 =driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
pollOption2.sendKeys("I don't Need");
pollOption2.sendKeys(Keys.ENTER);

driver.findElement(By.xpath("//div[@aria-label='Remove KG HOSTEL']")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[2]/div/div[1]/div[1]/div[2]")).click();
driver.findElement(By.xpath("//div[contains(text(),'Boys Hostel')]")).click();
driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
WebElement compare = driver.findElement(By.xpath("//button[normalize-space()='Add New Poll']"));
if(compare.isDisplayed()){
	System.out.println("Poll updated Passed");
}else{
	System.out.println("Poll Updated Failed");
}

driver.close();
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
	
	}

}
