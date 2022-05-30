package enhanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loop {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanna\\eclipse-workspace\\enhanced\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	  WebElement serach = driver.findElement(By.name("q"));
	  serach.sendKeys("redmi mobiles",Keys.ENTER);
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  WebElement ds = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	  ds.click();
	  String parentid = driver.getWindowHandle();
	  System.out.println(parentid);
	 Set<String> Childid = driver.getWindowHandles();
	 
	 for (String good : Childid) {
		 if (!parentid.equals(good)) 
			 driver.switchTo().window(good);
			 
			
	 }
	 
	 WebElement hhh = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
			 System.out.println(hhh.getText());
				
	}
		 
	 }
	 
	
	 
	
	 
	 
	 

	  
     

	    
	 
	
	
	
	
		
		
	
		
		
		
