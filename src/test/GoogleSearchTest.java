package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GooglePage;
public class GoogleSearchTest {
	private static WebDriver driver=null;
public static void main(String[] args) {
	googlesearch();
}
public static void googlesearch() {
	
	System.setProperty("webdriver.chrome.driver","G:\\softwares\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("wwww.google.com");
	GooglePage.Get_text(driver).sendKeys("Allu Arjun Images");
	GooglePage.Button(driver).sendKeys(Keys.RETURN);
	driver.close();
}
}
