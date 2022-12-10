package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.CleartripPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase 
{
  WebDriver Driver;
  @Parameters({"Browser","Url"})
  @BeforeClass
  public void setup(String Browser,String Url)throws IOException,InterruptedException
  {
	  if(Browser.equalsIgnoreCase("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  Driver=new ChromeDriver();
	  }
	  if(Browser.equalsIgnoreCase("firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  Driver=new FirefoxDriver();
	  }
	  if(Browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhavankumar\\Documents\\selenium webdriver\\edgedriver_win64 (1)\\msedgedriver.exe");
			Driver = new EdgeDriver();
		  }
	  CleartripPages driver=new CleartripPages(Driver);
	  Driver.navigate().to(Url);
	  System.out.Print("here changed your code");
	  Thread.sleep(3000);
	  CleartripPages.cancelbtn.click();
  }
	
@AfterClass
public void tearDown() 
{
	Driver.close();
}
}
