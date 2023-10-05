package paymentsHistory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentsListing {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("https://3.110.102.12/");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
driver.findElement(By.xpath("//a[contains(@href,'/app/payment-history')]")).click();
boolean PGName =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div/a")).getText().contains("KG HOSTEL");	
boolean roomNo = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[3]/div")).getText().contains("1");	
boolean paymentBy = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/a")).getText().contains("Kamal raj");
boolean PaymentFor = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div")).getText().contains("Advance");	
boolean orderID = driver.findElement(By.xpath("//div[normalize-space()='ORDER_001']")).getText().contains("ORDER_001");
boolean invoiceID = driver.findElement(By.xpath("//div[normalize-space()='INVOICE_001']")).getText().contains("INVOICE_001");
boolean paymentmethod = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[9]/div")).getText().contains("Cash");
boolean Amount = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[10]/div")).getText().contains("₹5,000.00");	
boolean status = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[3]/table/tbody/tr[1]/td[11]/div")).getText().contains("Paid");	
	if(PGName){
	System.out.println("PGName listing Passed");	
	}if(roomNo){
	System.out.println("roomNo listing Passed");	
	}if(paymentBy){
	System.out.println("paymentBy listing Passed");	
	}if(PaymentFor){
	System.out.println("PaymentFor listing Passed");	
	}if(orderID){
	System.out.println("orderID listing Passed");	
	}if(invoiceID){
	System.out.println("invoiceID listing Passed");	
	}if(paymentmethod){
	System.out.println("paymentmethod listing Passed");	
	}if(Amount){
	System.out.println("Amount listing Passed");	
	}if(status){
	System.out.println("status listing Passed");	
	}else{
	System.out.println("Payment History Listing Failed");
	}
	
	driver.close();
}

}
