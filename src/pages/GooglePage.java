package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
private static WebElement element=null;

public static WebElement Get_text(WebDriver driver) {
	element=driver.findElement(By.name("q"));
	return element;
}
public static WebElement Button(WebDriver driver) {
	element=driver.findElement(By.name("btnk"));
	return element;
}
}
