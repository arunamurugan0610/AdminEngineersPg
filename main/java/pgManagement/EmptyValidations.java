package pgManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyValidations {

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
driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
try {
    WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/main/div[1]/div[1]/div/div/button"));
    element.click();
} catch (StaleElementReferenceException e) {
    WebElement newElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/main/div[1]/div[1]/div/div/button"));
    newElement.click();
}
driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
WebElement title = driver.findElement(By.xpath("//span[contains(text(),'PG name')]"));
WebElement googlemap = driver.findElement(By.xpath("//span[contains(text(),'Google map url')]"));
WebElement EBperUnit = driver.findElement(By.xpath("//span[contains(text(),'Eb per unit')]"));
WebElement PgType = driver.findElement(By.xpath("//span[contains(text(),'Pg type')]"));
WebElement PgManager = driver.findElement(By.xpath("//span[contains(@class,'text-error')][contains(text(),'Manager')]"));
WebElement description = driver.findElement(By.xpath("//small[contains(text(),'Description')]"));
WebElement termsConditions = driver.findElement(By.xpath("//small[contains(text(),'Terms and Conditions')]"));
WebElement Address = driver.findElement(By.xpath("//span[contains(@class,'text-error')][contains(text(),'Address')]"));
WebElement Amenities = driver.findElement(By.xpath("//small[normalize-space()='Amenities is Required']"));
WebElement selectEmployees = driver.findElement(By.xpath("//small[normalize-space()='Pg Employees is Required']"));
    if(title.isDisplayed()){
 	   System.out.println("title Validations done");
    }if(googlemap.isDisplayed()){
    	System.out.println("googlemap Validations done");
    }if(EBperUnit.isDisplayed()){
    	System.out.println("EBperUnit Validations done");
    }if(PgType.isDisplayed()){
    	System.out.println("PgType Validations done");
    }if(PgManager.isDisplayed()){
    	System.out.println("Validations");
    }if(description.isDisplayed()){
    	System.out.println("description Validations done"); 
    }if(termsConditions.isDisplayed()){
    	System.out.println("termsConditions Validations done");
    }if(Address.isDisplayed()){
    	System.out.println("Address Validations done");
    }if(Amenities.isDisplayed()){
    	System.out.println("Amenities Validations done");
    }if(selectEmployees.isDisplayed()){
    	System.out.println("selectEmployees Validations done");
    }
        else{
 	   System.out.println("No Validations");
    }
	driver.close(); 	
	}

}
