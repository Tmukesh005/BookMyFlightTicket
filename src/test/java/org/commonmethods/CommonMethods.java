package org.commonmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	
	public static  WebDriver driver;
	public static WebDriverWait wait;
	
	public  void bLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void clickelement(WebElement element) {
		element.click();
	}
	
	public  static void select_gender(WebElement element,int value) {
		Select s1=new Select(element);
		s1.selectByIndex(value);
				
	}
	
	public static void scrollUp_Down() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000);");
	}
	
	public static void pause() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void wait_of_sometime() {
		wait=new WebDriverWait(driver, 2);
		//wait.until(ExpectedConditions.visibilityOf());
	}
	
	public  void cLaunch() {
		driver.close();
	}

}
