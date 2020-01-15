
package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("CMBT, Chennai");
		driver.findElement(By.id("dest")).sendKeys("Karur");
		driver.findElement(By.id("search_btn")).click();

	}

}
