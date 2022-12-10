package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.CleartripPages;
import com.qa.utility.ExcelUtility;

public class CleartripBooking extends Testbase {
	
	@DataProvider(name="data")
	public String[][] getData() throws IOException {
		
		String xFile="C:\\Users\\Bhavankumar\\eclipse-workspace\\Cleartrip\\src\\test\\java\\com\\qa\\testdata\\CleartripData.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
}
	
	@Test(dataProvider = "data")
	public void test_001(String arrival,String depature,String day,String month,String year) throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		Thread.sleep(5000);
		CleartripPages.from.click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		CleartripPages.to.click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		CleartripPages.from.sendKeys(arrival);
		Thread.sleep(5000);
		CleartripPages.fromdropdown.click();
		CleartripPages.to.sendKeys(depature);
		Thread.sleep(5000);
		CleartripPages.todropdown.click();
//		CleartripPages.date.click();
//		Thread.sleep(10000); 
//		//WebElement date = Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/div/ul/div[3]/div/div[2]/div[1]/div[3]/div/div/div/div[contains(text(),'15')]"));
//		CleartripPages.day.click();
//		Thread.sleep(10000);
		CleartripPages.search.click();
		Thread.sleep(10000);
		Driver.navigate().back();
		System.out.println(Driver.getTitle());
	}
}
