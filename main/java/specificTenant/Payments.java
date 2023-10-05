package specificTenant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Payments {

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
boolean paymentFor = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div")).getText().contains("Advance");
boolean paymentID = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[3]/div")).getText().contains("INVOICE_001");
boolean Amount =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/div")).getText().contains("₹5,000.00");
boolean paymentMethod = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div")).getText().contains("Cash");
boolean paymentDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[6]/div")).getText().contains("07-09-232023 19-09-69 pm");
boolean Status = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[7]/div/p")).getText().contains("Paid");
if(paymentFor){
	System.out.println("PaymentFor listing Passed");
}if(paymentID){
	System.out.println("paymentID listing Passed");
}if(Amount){
	System.out.println("Amount listing Passed");
}if(paymentMethod){
	System.out.println("paymentMethod listing Passed");
}if(paymentDate){
	System.out.println("paymentDate listing Passed");
}if(Status){
	System.out.println("Status listing Passed");
}else{
	System.out.println("Payments listing Failed");
}
driver.close();
	}

}
