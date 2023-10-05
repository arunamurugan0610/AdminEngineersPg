package pollManagement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ExistedData {

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
driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[6]/a")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div[3]/table/tbody/tr[1]/td[8]/div/div/span[1]")).click();
boolean Title =driver.findElement(By.name("title")).getAttribute("Value").contains("Dinner");
boolean description = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[7]/div/div/div[4]/div[1]")).getText().contains("Description");
boolean pollFor= driver.findElement(By.xpath("//div[@id='mui-component-select-for']")).getText().contains("Tenant");
boolean StartDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/form/div[1]/div[5]/div/div/input")).getAttribute("Value").contains("2023-10-04");
boolean EndDate = driver.findElement(By.name("endDate")).getAttribute("Value").contains("2023-10-04");
boolean pollOption1 = driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).getText().contains("Yes");
boolean pollOption2 = driver.findElement(By.xpath("//div[contains(text(),'No')]")).getText().contains("No");
boolean choosePG1 = driver.findElement(By.xpath("//div[contains(text(),'KG HOSTEL')]")).getText().contains("KG HOSTEL");
boolean choosePG2 = driver.findElement(By.xpath("//div[contains(text(),'Boys PG')]")).getText().contains("Boys PG");
if(Title){
	System.out.println("Title existed Passed");
}if(description){
	System.out.println("description existed Passed");
}if(pollFor){
	System.out.println("pollFor existed Passed");
}if(StartDate){
	System.out.println("StartDate existed Passed");
}if(EndDate){
	System.out.println("EndDate existed Passed");
}if(pollOption1){
	System.out.println("pollOption1 existed Passed");
}if(pollOption2){
	System.out.println("pollOption2 existed Passed");
}if(choosePG1){
	System.out.println("choosePG1 existed Passed");
}if(choosePG2){
	System.out.println("choosePG2 existed Passed");
}else{
	System.out.println("PG existed details Failed");
}

driver.close();
	}

}