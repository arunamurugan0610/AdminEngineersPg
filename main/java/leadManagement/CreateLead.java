package leadManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
	driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();
	driver.findElement(By.name("name")).sendKeys("Ramya");
	driver.findElement(By.name("tittle")).sendKeys("Lead");
	driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[3]/div/div/div[4]/div[1]")).sendKeys("Description");
	driver.findElement(By.name("phoneNo")).sendKeys("9876543211");
	driver.findElement(By.name("address")).sendKeys("no.1 dr. subbaraya nagar kodabakkam - 600024");
	driver.findElement(By.name("referedBy")).sendKeys("friend");
	driver.findElement(By.xpath("//div[@id='mui-component-select-pgId']")).click();
	driver.findElement(By.xpath("//li[normalize-space()='BoyS PG']")).click();
	driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[7]/div")).click();
	WebElement selectField = driver.findElement(By.xpath("//input[@name='LeadTypeId']"));
	 selectField.sendKeys("magazine");
	 selectField.sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	
	
	boolean compare = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[1]")).getText().contains("Lead List");
	
	if(compare){
		System.out.println("lead created - Passed");
	}else{
		System.out.println("Lead not created - Failed");
	}
	
	driver.close();
	
	
	}

}
