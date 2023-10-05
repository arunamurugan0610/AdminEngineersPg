package specificEmployee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leave {

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
driver.findElement(By.xpath("//a[normalize-space()='antony']")).click();
driver.findElement(By.xpath("//div[normalize-space()='Leave']")).click();
boolean PgName = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div")).getText().contains("KG HOSTEL");
boolean typeOfLeave = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[3]/div")).getText().contains("Half Day");
boolean reason = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div")).getText().contains("Sick Leave");	
boolean startDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div")).getText().contains("06/09/2023");	
boolean endDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[6]/div")).getText().contains("06/09/2023");
	WebElement status =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/select"));
	Select statusOption = new Select(status);
	statusOption.selectByVisibleText("Hold");
	
	if(PgName){
		System.out.println("PG Name listed Passed");
	}if(typeOfLeave){
		System.out.println("typeOfLeave listed Passed");
	}if(reason){
		System.out.println("reason listed Passed");
	}if(startDate){
		System.out.println("startDate listed Passed");
	}if(endDate){
		System.out.println("endDate listed Passed");
	}else{
		System.out.println("Leave listed Failed");
	}
	driver.close();
	
	}

}
