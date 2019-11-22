package com.mayab.calidad.funcionales;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;


public class TestingCRUD {
	
	private WebDriver webdriver;
	private String Url;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	  
	@Before
	public void setUp() throws Exception {
		
		Url = "https://mern-crud.herokuapp.com/";
	   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\KHP\\Escritorio\\Calidad\\chromedriver.exe");
		
	    webdriver = new ChromeDriver();
	    webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	 @After
	  public void tearDown() throws Exception {
	    webdriver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

//	@Test
//	public void testAdd() {
//		String alert;
//		webdriver.get(Url);
//		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/button")).click();
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).click();
//		
//		webdriver.findElement(By.name("name")).sendKeys("karla Huchin");
//		webdriver.findElement(By.name("email")).click();
//		webdriver.findElement(By.name("email")).clear();
//		webdriver.findElement(By.name("email")).sendKeys("karlitha100@gmail.com");
//		webdriver.findElement(By.name("age")).click();
//		webdriver.findElement(By.name("age")).clear();
//		webdriver.findElement(By.name("age")).sendKeys("20");
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div[2]/div")).click();
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div[2]/div/div[2]/div[2]")).click();
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
//	    pause(1000);
//	    
//	    WebElement webelement = webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p"));
//	    alert = webelement.getText();
//	    assertEquals("Successfully added!", alert);
//	    
//	    
//	}
	
//	@Test
//	public void testfail() {
//		String alert;
//		webdriver.get(Url);
//		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/button")).click();
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).click();
//		
//		webdriver.findElement(By.name("name")).sendKeys("karla Huchin");
//		webdriver.findElement(By.name("email")).click();
//		webdriver.findElement(By.name("email")).clear();
//		webdriver.findElement(By.name("email")).sendKeys("karlitha100@gmail.com");
//		webdriver.findElement(By.name("age")).click();
//		webdriver.findElement(By.name("age")).clear();
//		webdriver.findElement(By.name("age")).sendKeys("20");
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div[2]/div")).click();
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div[2]/div/div[2]/div[2]")).click();
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
//	    pause(1000);
//	    
//	    WebElement webelement = webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[5]/div/p"));
//	    alert = webelement.getText();
//	    assertEquals("That email is already taken.", alert);
//	    
//	    
//	}
	
//	@Test 
//	public void testedit() {
//	String alert;
//	webdriver.get(Url);
//	webdriver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]/td[5]/button[1]")).click();
//	webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).clear();
//	webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).click();
//	
//	webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("karla");
//
//	webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
//    pause(1000);
//    
//    WebElement webelement = webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p"));
//    alert = webelement.getText();
//    assertEquals("Successfully updated!", alert);
//    
//		
//	}
//	 
//	@Test 
//	public void testeditfail() {
//		String alert;
//		webdriver.get(Url);
//		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]/td[5]/button[1]")).click();
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).click();
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).clear();
//		
//		
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("karla.@ho.com");
//
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
//	    pause(1000);
//	    
//	    WebElement webelement = webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[5]/div/p"));
//	    alert = webelement.getText();
//	    assertEquals("Email must be valid.", alert);}
	    
	@Test 
	public void testdelite() {

		webdriver.get(Url);
		WebElement first = webdriver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody"));
		String previous = first.getText();
		System.out.println(previous);
		String deleted = "/html/body/div/div/div[2]/table/tbody/tr[1]";
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]/td[5]/button[2]")).click();
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
	    pause(2000);
	    
	    WebElement element = webdriver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody"));
	    String text = element.getText();
	    assertNotEquals(previous.contains("/html/body/div/div/div[2]/table/tbody/tr[1]"), text.contains("/html/body/div/div/div[2]/table/tbody/tr[2]"));
	
	}
	    
	

	
	
	
	
	
	private void pause(long mils) {
		  try {
			  Thread.sleep(mils);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	  }
	  private boolean isElementPresent(By by) {
	    try {
	      webdriver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      webdriver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = webdriver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }


}
