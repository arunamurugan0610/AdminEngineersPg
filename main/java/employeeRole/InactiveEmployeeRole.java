package employeeRole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InactiveEmployeeRole {

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
		 driver.findElement(By.xpath("//li[3]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Employee Role']")).click();
//			driver.findElement(By.xpath("//button[normalize-space()='Add Employee Role']")).click();
//			driver.findElement(By.xpath("//input[@placeholder='Enter role title']")).sendKeys("Sub Manager");
//		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/main/div[1]/div[3]/div[2]/div[1]/div/div/div/div/label/input")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[4]/div/div/label")).click();
		 driver.findElement(By.xpath("//span[normalize-space()='Inactive Role']")).click();
		boolean message= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr/td[2]/div/div")).getText().contains("Sub Manager");
	
	if(message){
		System.out.println("Inactivated");
	}else{
		System.out.println("Not Inactivated");
	}	

	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr/td[4]/div/div/label")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Active Role']")).click();
	boolean message1= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr/td[2]/div/div")).getText().contains("Sub Manager");
	if(message1){
		System.out.println("Activated");
	}else{
		System.out.println("Not Activated");
	}	
	
	driver.close();	
	}

}
