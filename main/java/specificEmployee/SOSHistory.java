package specificEmployee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SOSHistory {

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
    try{
    	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[2]")).click();
    }catch(StaleElementReferenceException e){
    	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[2]")).click();
    }
	     
	boolean raisedBy = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[3]/div/a")).getText().contains("arun003");
	boolean raisedOn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div")).getText().contains("14-09-2023 16:09:09 pm");
	boolean respondedOn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div")).getText().contains("14-09-2023 16:09:09 pm");     
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[6]/div/div/div")).click();
	boolean description = driver.findElement(By.xpath("/html/body/div/div[4]/div/h3")).getText().contains("Description");
	 boolean status = driver.findElement(By.xpath("//div[contains(text(),'Closed')]")).getText().contains("Closed");    
	     
	  if(raisedBy){
		  System.out.println("Rasied by listed Passed");
	  } if(raisedOn){
		  System.out.println("Raised On listed Passed");
	  } if(respondedOn){
		  System.out.println("Responded On listed Passed");
	  } if(description){
		  System.out.println("Description listed Passed");
	  } if(status){
		  System.out.println("Status listed Passed");
	  }else{
		  System.out.println("SOS history Listing Failed");
	  }
	     driver.close();
	     
	}

}
