package pgManagementSpecificPG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wastages {

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
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
         driver.findElement(By.xpath("//div[contains(text(),'KG HOSTEL')]")).click();
try{
	driver.findElement(By.xpath("//div[normalize-space()='Wastages']")).click();
}catch(StaleElementReferenceException e){
	driver.findElement(By.xpath("//div[normalize-space()='Wastages']")).click();	
}

boolean mealType = driver.findElement(By.xpath("//div[normalize-space()='Breakfast']")).getText().contains("Breakfast");
boolean foodName = driver.findElement(By.xpath("//div[normalize-space()='dosa']")).getText().contains("dosa");
boolean addedBy = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div")).getText().contains("antony");
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/div")).click();
boolean Description = driver.findElement(By.xpath("/html/body/div/div[4]/div/div")).getText().contains("test");
driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[6]/div/span")).click();
boolean images = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div/div[1]/div[1]/div/img")).getAttribute("src").contains("https://d2v4bybytnkmx7.cloudfront.net/https://theosia-assert.s3.amazonaws.com/skynovalogo99/skynovalogo99");
	if(mealType){
		System.out.println("MealType Listing Passed");
	}	if(foodName){
		System.out.println("foodName Listing Passed");
	}	if(addedBy){
		System.out.println("addedBy Listing Passed");
	}	if(Description){
		System.out.println("Description Listing Passed");
	}	if(images){
		System.out.println("images Listing Passed");
	}else{
		System.out.println("Meal Wastages Listing Failed");
	}
driver.close();		
	}

}
