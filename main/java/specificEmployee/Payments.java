package specificEmployee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Payments {
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
      driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[6]")).click();
      boolean paymentBy = driver.findElement(By.xpath("//a[normalize-space()='arun003']")).getText().contains("arun003");
	boolean paymentFor = driver.findElement(By.xpath("//div[normalize-space()='Advance']")).getText().contains("Advance");
	boolean amount = driver.findElement(By.xpath("//div[contains(text(),'₹1,000.00')]")).getText().contains("₹1,000.00");
      boolean paymentID = driver.findElement(By.xpath("//div[normalize-space()='INVOICE_002']")).getText().contains("INVOICE_002");
      boolean dateTime = driver.findElement(By.xpath("//div[normalize-space()='07-09-232023 19-09-69 pm']")).getText().contains("07-09-232023 19-09-69 pm");
      boolean status = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr/td[8]/div/p")).getText().contains("Paid");     
      if(paymentBy){
    	  System.out.println("Payment By listed Passed");
      }if(paymentFor){
    	  System.out.println("payment For listed Passed");
      }if(amount){
    	  System.out.println("amount listed Passed");
      }if(paymentID){
    	  System.out.println("payment ID listed Passed");
    	  }if(dateTime){
    		  System.out.println("Date & Time Listed Passed");
    	  }if(status){
    		  System.out.println("Status Listed Passed");
    	  }else{
    		  System.out.println("Payments Listed Failed");
    	  }  
    	  driver.close(); 
	}
}
