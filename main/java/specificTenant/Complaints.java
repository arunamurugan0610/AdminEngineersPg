package specificTenant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Complaints {

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
driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[5]/a")).click();
driver.findElement(By.xpath("//div[contains(text(),'Kamal raj')]")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[1]/div/div/div[5]")).click();
boolean complaintType = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[2]/div/div")).getText().contains("Food");
boolean complaintDescription = driver.findElement(By.xpath("//div[normalize-space()='Food is not enough']")).getText().contains("Food is not enough ");
boolean complaintDate = driver.findElement(By.xpath("//div[normalize-space()='03-10-2023 18:10:37 pm']")).getText().contains("03-10-2023 18:10:37 pm");
boolean status = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[5]/div")).getText().contains("Acknowledge");
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div[3]/table/tbody/tr[1]/td[6]/div/div/p")).click();
driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/div[1]/div/div/div[4]/div[1]/p")).sendKeys("Testing");
driver.findElement(By.xpath("//button[normalize-space()='Post comment']")).click();
boolean comment =driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div/article/div/p[1]/p[1]")).getText().contains("Testing");
	if(complaintType){
		System.out.println("complaintType listing passed");
	}if(complaintDescription){
		System.out.println("complaintDescription listing passed");
	}if(complaintDate){
		System.out.println("complaintDate listing passed");
	}if(status){
		System.out.println("status listing passed");
	}if(comment){
		System.out.println("comment listing passed");
	}else{
		System.out.println("complaint listing passed");
	}	
	driver.close();
	}

}
