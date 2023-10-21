package com.app.locators;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class LocatorsTest {
public static void main(String[] args) throws InterruptedException {
	  WebDriver driver;
	System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	/*
	
	//className and TagName by using findElents method
	driver.get("https://www.flipkart.com/");
    int images=driver.findElements(By.className("_396cs4")).size();
	System.out.println(images);
	int findLinks=driver.findElements(By.tagName("a")).size();
	System.out.println(findLinks);
	/*/
	//driver.get("https://www.facebook.com");
	
	//Exceptions in selenium
    //driver.findElement(By.id("email")).sendKeys("9704661656");
   // driver.switchTo().window("abcd");
    //driver.switchTo().alert();

    
	//By using className as xpath and check box as well
	
	//driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']")).sendKeys("9704661656");
//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("555");
	//driver.findElement(By.name("pass")).sendKeys("Subbu165689$");
	// driver.findElement(By.name("login")).click();
	 
	//By using tagName
	
	// driver.findElement(By.tagName("button")).click();
	 //By using className as xpath and check box as well
	 //driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
  
	//By using linktext and partial linktext methods
//	 driver.findElement(By.linkText("Forgotten password?")).click();
//	 driver.findElement(By.partialLinkText("password?")).click();

	 /*
	
	//tooltip concepts
	driver.get("https://demo.guru99.com/test/social-icon.html");
	String expectedToolTip="Github";
	WebElement GithubIcon=driver.findElement(By.xpath("//div[@class='socialbtns']/div/a[4]"));
	String actualToolTip=GithubIcon.getAttribute("title");
	Assert.assertEquals(actualToolTip, expectedToolTip);
	System.out.println("Get actualToolTip: "+actualToolTip);
	*/
	
	
	
	//Radio button and check boxes
	
/*	
   driver.get("https://demo.guru99.com/test/radio.html");
	
   WebElement Radio1=driver.findElement(By.id("vfb-7-1"));	
   WebElement Radio2=driver.findElement(By.id("vfb-7-2"));
   Radio1.click();
   Thread.sleep(2000);
   Radio2.click();
   if(Radio2.isSelected()) {
	   System.out.println("Radio2 button toggled on!");
   }else {
	   System.out.println("Radio2 button toggled is off!!");
   }
   Thread.sleep(2000);
   Radio2.click();
   if(!Radio2.isSelected()) {
	  
	   System.out.println("Radio2 button is now toggled off!!");
	   
   }
}
   
	
						WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
						checkbox2.click();
						
						if(checkbox2.isSelected()) {
							System.out.println("checkbox2 is toggled on");
							
						}else {
							System.out.println("checkbox2 is toggled off");
				}
						Thread.sleep(2000);
						//is checkbox is toggled off!! Now
				          checkbox2.click();
				          
				          if(!checkbox2.isSelected()){
				        	  System.out.println("checkbox2 is now toggeled off!!");
				          }
}
   
    */
	
	/* 
	//dropdown and select classes
	 * 
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	Select dropdownCountry=new Select(driver.findElement(By.name("country")));
	dropdownCountry.selectByVisibleText("ANGOLA");

     driver.get("http://jsbin.com/osebed/2");
     Select fruits=new Select(driver.findElement(By.id("fruits")));
     fruits.selectByVisibleText("Grape");
     fruits.selectByIndex(3);
     */
	
	//findelements method
	/*
	driver.get("http://demo.guru99.com/test/ajax.html");
	
   List<WebElement> elements = driver.findElements(By.name("name"));
   System.out.println("Number of elements:" +elements.size());

   for (int i=0; i<elements.size();i++){
   System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
   }
	
	List<WebElement> ObjLinktext=driver.findElements(By.tagName("ac"));
	for(WebElement ObjCurrentlink: ObjLinktext) {
		String StrLinkText=ObjCurrentlink.getText();
		System.out.println(StrLinkText);
    }
  }
	 */
	//driver.get("https://www.facebook.com");
	
	//Tag and Id 
//	 driver.findElement(By.cssSelector("input#email")).sendKeys("9704661656");
//	 driver.findElement(By.cssSelector("#email")).sendKeys("9704661656");
//	 driver.findElement(By.cssSelector("input#pass")).sendKeys("subbu165689$");
//	 driver.findElement(By.cssSelector("button[name=login]")).click();
//	 
//	 Using Tag and Class
 //    driver.findElement(By.cssSelector("input.inputtext")).sendKeys("9704661656");
	   
//	 Tag, Class and Attrabute
//	 driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("9704661656");
//	 driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("subbu165689$");
//	 driver.findElement(By.cssSelector("button[name=login]")).click();

//	 Tag and Attribute and value
//	 driver.findElement(By.cssSelector("input[name=email]")).sendKeys("9704661656");
//     driver.findElement(By.cssSelector("[id=pass]")).sendKeys("subbu165689$");
//     driver.findElement(By.cssSelector("button[name=login]")).click();

	/*
	driver.get("https://www.redbus.in/");
	
	 //child-select the all childrens of current node(one or more)
	List<WebElement> childs=driver.findElements(By.xpath("//span[@class='name_rb_vertical']/ancestor::ul/child::li"));
      System.out.println("list of webelements: "+childs.size());

     // self-select the current node 
    String text=driver.findElement(By.xpath("//span[text()='Train Tickets']/self::span")).getText();
       System.out.println(text);
     
     //parent-select the parent of current node (always one)
    text=driver.findElement(By.xpath("//span[text()='Train Tickets']/parent::li")).getText();
    System.out.println(text);
     
     //Ancestor-select parent and grand parent etc
    text=driver.findElement(By.xpath("//span[@class='name_rb_vertical']/ancestor::ul")).getText();
    System.out.println("getting text: "+text);
    
    //Descedants- slect all descendants(children, grandchildren etc) of current node.
    List<WebElement> descedants=driver.findElements(By.xpath("//span[@class='name_rb_vertical']/ancestor::ul/descendant::*"));
    System.out.println("descedants elements:" +descedants.size());
    
    List<WebElement> followingElements=driver.findElements(By.xpath("//span[@class='name_rb_vertical']/ancestor::ul/following::ul"));
    System.out.println("followingElements:" +followingElements.size());
      
    List<WebElement> followingSibling=driver.findElements(By.xpath("//span[@class='name_rb_vertical']/ancestor::ul/following-sibling::ul"));
    System.out.println("followingSibling:" +followingSibling.size());
    */
 
    /*
    driver.navigate().to("https://www.facebook.com/reg/?app_id=0&logger_id");
    //followings
    List<WebElement> followingElement=driver.findElements(By.xpath("//input[@name='reg_email__']/following::input[2]"));
    System.out.println(followingElement.size());
     */
    //driver.get("https://www.amazon.in/");
//    WebElement dropdownElemet=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//    
//    Select selectdropdown=new Select(dropdownElemet);
//    selectdropdown.selectByVisibleText("Baby");
//    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//    selectdropdown.selectByValue("search-alias=amazon-pharmacy");
//    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//    selectdropdown.selectByIndex(1); 
    
    //select the option from dropdown withoud using the above methods
    
//    WebElement dropdownAll=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//    selectdropdownelement(dropdownAll, "Baby" );
//    WebElement dropdownLanguage=driver.findElement(By.xpath("//span[@class=\"nav-icon nav-arrow\"]"));
//    selectdropdownelement(dropdownLanguage, "icp-radio");
	 driver.get("https://demo.mobiscroll.com/jquery/select/responsive#");
  WebElement dropdownAll=driver.findElement(By.xpath("//input[@data-dropdown='true']']"));
  selectdropdownelement(dropdownAll, "Atlanta" );
    //System.out.println(dropdownAll.getText());
}


    public static void selectdropdownelement(WebElement element,String value) {
    	Select dropdownselect=new Select(element) ;
    		List<WebElement> listeOptionlements=dropdownselect.getOptions();
    		for(WebElement options: listeOptionlements) {
    			if(options.getText().equals(value)) {
    				options.click();
    			break;	
    			}
    			
    		}
	}
}
