package leadManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NullCheck {

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
	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	boolean name=driver.findElement(By.xpath("//p[normalize-space()='Name is Required']")).getText().contains("Name is Required");
	boolean title = driver.findElement(By.xpath("//p[normalize-space()='Title is Required']")).getText().contains("Title is Required");
	boolean description =driver.findElement(By.xpath("//p[normalize-space()='Description is Required']")).getText().contains("Description is Required");
	boolean phoneNo =driver.findElement(By.xpath("//p[normalize-space()='Phone No is Required']")).getText().contains("Phone No is Required");
	boolean address =driver.findElement(By.xpath("//p[normalize-space()='Address is Required']")).getText().contains("Address is Required");
	boolean referedBy =driver.findElement(By.xpath("//p[normalize-space()='Refered By is Required']")).getText().contains("Refered By is Required");
	boolean leadType =driver.findElement(By.xpath("//p[normalize-space()='Lead Type is Required']")).getText().contains("Lead Type is Required");
	boolean selectPG = driver.findElement(By.xpath("//p[normalize-space()='PG is Required']")).getText().contains("PG is Required");
	if(name){
		System.out.println("Name error - Passed");
	}if(title){
		System.out.println("title error - Passed");
	}if(description){
		System.out.println("description error - Passed");
	}if(phoneNo){
		System.out.println("phoneNo error - Passed");
	}if(address){
		System.out.println("address error - Passed");
	}if(referedBy){
		System.out.println("address error - Passed");
	}if(selectPG){
		System.out.println("selectPG error - Passed");
	}if(leadType){
		System.out.println("leadType error - Passed");
	}else{
		System.out.println("No error - Failed");
	}
	
	driver.close();
	
	}

}
