package specificTenant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MealHistory {

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
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[1]/div/div/div[2]")).click();
boolean mealType=driver.findElement(By.xpath("//div[normalize-space()='Lunch']")).getText().contains("Lunch");
boolean mealTaken = driver.findElement(By.xpath("//div[normalize-space()='15-09-2023 13:09:83 pm']")).getText().contains("15-09-2023 13:09:83 pm");
boolean mealMenu = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div")).getText().contains("test");
if(mealType){
	System.out.println("Meal Type listing Passed ");
}if(mealTaken){
	System.out.println("Meal Taken listing Passed ");
}if(mealMenu){
	System.out.println("Meal Menu listing Passed ");
}else{
	System.out.println("Meal history listing Failed");
}
driver.close();
	}

}
