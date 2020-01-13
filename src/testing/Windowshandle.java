package testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement serch=driver.findElement(By.id("inputValEnter"));
		serch.sendKeys("bluetooth headphone");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='Gio Zone HBS 730 Neckband Wireless With Mic Headphones/Earphones']")).click();
		String par=driver.getWindowHandle();
		Set<String> chld=driver.getWindowHandles();
		for (String x:chld) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	
	
	
	
	}
	
}
 