package core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linear {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver.sh");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://alex.academy/exe/signup/www/index.php");
		
		driver.findElement(By.id("id_fname")).sendKeys("Dzmitry");
		driver.findElement(By.id("id_lname")).sendKeys("Slizh");
		driver.findElement(By.id("id_email")).sendKeys("dima@gmail.com");
		driver.findElement(By.id("id_phone")).sendKeys("302 111-1111");
		driver.findElement(By.id("id_submit_button")).click();
		System.out.println(driver.getTitle().equals("Confirmation") ? "pass" : "fail");
		driver.quit();
	}
}
