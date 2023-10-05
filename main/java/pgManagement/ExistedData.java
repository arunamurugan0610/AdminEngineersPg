package pgManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExistedData {

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

         driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[3]/table/tbody/tr[5]/td[8]/div/div/span[1]")).click();
    boolean pgName =driver.findElement(By.xpath("//input[@placeholder='Enter PG name']")).getAttribute("value").contains("Boys PG");
    boolean googleMap =driver.findElement(By.xpath("//input[@placeholder='Enter google map url']")).getAttribute("value").contains("https://www.google.com/maps");
    boolean ebPerUnit =driver.findElement(By.xpath("//input[@placeholder='Enter EB Per Unit']")).getAttribute("value").contains("400");
    boolean pgType=driver.findElement(By.xpath("//option[contains(@value,'Boys')]")).getAttribute("value").contains("Boys");         
    boolean manager =driver.findElement(By.xpath("//option[contains(@value,'6513c9a67f0ba814d5f843a9')]")).getAttribute("value").contains("6513c9a67f0ba814d5f843a9");
    boolean description=driver.findElement(By.xpath("//p[normalize-space()='Description']")).getText().contains("Description");
    boolean termsandCondition=driver.findElement(By.xpath("//p[normalize-space()='Terms & conditions']")).getText().contains("Terms & conditions");
    boolean address=     driver.findElement(By.xpath("//textarea[@placeholder='Enter address']")).getText().contains("Address");
       WebElement amenities=   driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[9]/div[1]/div[1]/div[1]/div[2]"));
    boolean amenities1=amenities.getText().contains("WIFI");
    boolean amenities2=amenities .getText().contains("refrigerator");	
       WebElement Employees= driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[10]/div[1]/div[1]/div[1]"));
    boolean Employee1 =Employees.getText().contains("Arunkumar v");
    boolean Employee2=Employees.getText().contains("Michael antony");
	     driver.findElement(By.xpath("//button[normalize-space()='View']")).click();
	boolean image1= driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div/div[1]/div[1]/div/img")).getAttribute("src").contains("https://d2v4bybytnkmx7.cloudfront.net/pg-images/202309271157550");
	boolean image2=  driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div/div[1]/div[2]/div/img")).getAttribute("src").contains("https://d2v4bybytnkmx7.cloudfront.net/pg-images/202309271157551");
	
	if(pgName){
		System.out.println("Existed Pg Title");
	}if(googleMap){
		System.out.println("Existed googleMap");
	}if(ebPerUnit){
		System.out.println("Existed ebPerUnit");
	}if(pgType){
		System.out.println("Existed pgType");
	}if(manager){
		System.out.println("Existed manager");
	}if(description){
		System.out.println("Existed description");
	}if(termsandCondition){
		System.out.println("Existed termsandCondition");
	}if(address){
		System.out.println("Existed address");
	}if(amenities1){
		System.out.println("Existed amenities1");
	}if(amenities2){
		System.out.println("Existed amenities2");
	}if(Employee1){
		System.out.println("Existed Employee1");
	}if(Employee2){
		System.out.println("Existed Employee2");
	}if(image1){
		System.out.println("Existed image1");
	}if(image2){
		System.out.println("Existed image2");
	}
	else{
		System.out.println("Not Existed");
	}
	
	driver.close();	
	}

}
