package pollManagement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatePoll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		 driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[6]/a")).click();
try{
	driver.findElement(By.xpath("//button[normalize-space()='Add New Poll']")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("//button[normalize-space()='Add New Poll']")).click();
}
driver.findElement(By.name("title")).sendKeys("Dinner");
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[3]/div/div")).click();;
driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
CharSequence[]	StartDate ={"06-10-2023"};
WebElement Start_Date = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[4]/div/div/input"));
Start_Date.click();
Start_Date.clear();			    
Start_Date.sendKeys(StartDate);
Start_Date.sendKeys(Keys.ENTER);

CharSequence[]	EndDate ={"06-10-2023"};
WebElement End_Date = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[5]/div/div/input"));
End_Date.click();
End_Date.clear();			    
End_Date.sendKeys(EndDate);
End_Date.sendKeys(Keys.ENTER);

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[7]/div/div/div[4]/div[1]")).sendKeys("Description");

WebElement selectField =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[6]/div/div[1]/div[1]/div[2]/input"));
selectField.sendKeys("Yes");
selectField.sendKeys(Keys.ENTER);

WebElement SelectOptions =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[6]/div/div[1]/div[1]/div[2]/input"));
SelectOptions.sendKeys("No");
SelectOptions.sendKeys(Keys.ENTER);

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[2]/div/div[1]/div[1]/div[2]")).click();
driver.findElement(By.xpath("//div[contains(text(),'KG HOSTEL')]")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[2]/div/div[1]/div[1]/div[2]")).click();
driver.findElement(By.xpath("//div[contains(text(),'Boys PG')]")).click();
driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
WebElement compare = driver.findElement(By.xpath("//button[normalize-space()='Add New Poll']"));
	if(compare.isDisplayed()){
		System.out.println("Poll Created Passed");
	}else{
		System.out.println("Poll Creation Failed");
	}
	
	driver.close();
	}

}


