package pollManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeletePoll {

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
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[2]/td[8]/div/div/span[2]")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[2]/td[8]/div/div/span[2]")).click();
	driver.findElement(By.xpath("//button[@id='btn-yes-1']")).click();
	boolean title =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[3]/td[2]/div/div/a")).getText().contains("Dinner For Today");
if(title){
	System.out.println("Delete Poll Passed");
}else{
	System.out.println("Failed");
}
	
driver.close();		
	}

}
