package com.app.crossTesting;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class CrossBrowserTesting {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//img[@alt='redbus_facebook']")).click();
	driver.findElement(By.xpath("//img[@alt='redbus_linkedin']")).click();
	driver.findElement(By.xpath("//img[@alt='redbus_twitter']")).click();
	driver.findElement(By.xpath("//img[@alt='redbus_instagram']")).click();
	
 
	Set<String> handles=driver.getWindowHandles();
	List<String> hlist=new ArrayList<String>(handles);
	System.out.println(hlist.size());
	driver.switchTo().window(hlist.get(2));
	
/*  
	if(switchToRightWindow("Facebook", hlist)) {
	System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
	}
	}
	public static boolean switchToRightWindow(String windowTitle, List<String> hlist) {
		WebDriver driver=null;
	    for(String e:hlist) {
			
			String title=driver.switchTo().window(e).getTitle();
		if(title.contains(windowTitle)) {
			System.out.println("found the right window....");
		return true;
		}
		
	}
		return false;
		*/
}
}