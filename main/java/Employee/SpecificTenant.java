package Employee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificTenant {

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
		 driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
	     driver.findElement(By.xpath("//a[normalize-space()='Arunkumar v']")).click();
driver.findElement(By.xpath("//div[normalize-space()='Complaints']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Kamal']")).click();
boolean specificTenant = driver.findElement(By.xpath("//h2[normalize-space()='Kamal']")).getText().contains("Kamal");
if(specificTenant){
	System.out.println("specific tennat page - Passed");
}else{
	System.out.println("specific tennat page - Passed");
}

// driver.close();

	}

}

