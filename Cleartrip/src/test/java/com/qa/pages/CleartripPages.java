package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testscripts.CleartripBooking;

public class CleartripPages {
	 WebDriver Driver;
	 
	 @FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]")
	 public static WebElement cancelbtn;
	 
	 @FindBy(xpath="//input[@placeholder=\"Where from?\"]")
	 public static WebElement from;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[2]")
	 public static WebElement fromdropdown;
	 
	 @FindBy(xpath="//input[@placeholder=\"Where to?\"]")
	 public static WebElement to;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/div[2]")
	 public static WebElement todropdown;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/button[1]")
	 public static WebElement date;
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/div/ul/div[3]/div/div[2]/div[1]/div[3]/div/div/div/div[contains(text(),'22')]")
	 public static WebElement day;
	 //public static WebElement dates = Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[3]/div/div[1]/div/div/div/ul/div[3]/div/div[2]/div[1]/div[3]/div/div/div/div[contains(text(),"+day+")]"));
	 
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[2]")
	 public static WebElement search;
	 
	 public CleartripPages(WebDriver Driver)
	 {
		this.Driver=Driver;
		PageFactory.initElements(Driver,this); 
	 }
}
