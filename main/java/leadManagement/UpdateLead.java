package leadManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();		
		driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[7]/a")).click();
	   driver.findElement(By.xpath("//span[normalize-space()='Lead Information']")).click();
	   driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[8]/div/div/div")).click();   
WebElement name = driver.findElement(By.xpath("//input[@id=':rj:']"));
name.sendKeys(Keys.CONTROL + "a");
name.sendKeys(Keys.DELETE);
name.sendKeys("Arun");
WebElement title = driver.findElement(By.xpath("//input[@id=':rk:']"));   
title.sendKeys(Keys.CONTROL + "a");
title.sendKeys(Keys.DELETE);
title.sendKeys("Regrading PG Cleaning");
WebElement Description = driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[3]/div/div/div[4]/div[1]/p"));   
Description.sendKeys(Keys.CONTROL + "a");
Description.sendKeys(Keys.DELETE);
Description.sendKeys("Testing");
WebElement phoneNo = driver.findElement(By.xpath("//input[@id=':rl:']"));   
phoneNo.sendKeys(Keys.CONTROL + "a");
phoneNo.sendKeys(Keys.DELETE);
phoneNo.sendKeys("9876543222");	   
WebElement Address = driver.findElement(By.xpath("//textarea[@id=':rm:']"));   
Address.sendKeys(Keys.CONTROL + "a");
Address.sendKeys(Keys.DELETE);
Address.sendKeys("Address");	   
WebElement referedBy = driver.findElement(By.xpath("//input[@id=':rn:']"));   
referedBy.sendKeys(Keys.CONTROL + "a");
referedBy.sendKeys(Keys.DELETE);
referedBy.sendKeys("Aruna");
driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[7]/div/div")).click();
driver.findElement(By.xpath("//li[normalize-space()='new paper']")).click();;   	   	   
 driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[8]/div/div")).click();      
	driver.findElement(By.xpath("//li[normalize-space()='BoyS PG']")).click();  
	driver.findElement(By.xpath("//li[normalize-space()='Aruna']")).click();
	
	boolean editPage = driver.findElement(By.xpath("//h3[normalize-space()='Edit List']")).getText().contains("Edit List");
	
	if(editPage){
		System.out.println("Failed");
	}else{
		System.out.println("Passed");
	}
	driver.close();
	
	}

}
