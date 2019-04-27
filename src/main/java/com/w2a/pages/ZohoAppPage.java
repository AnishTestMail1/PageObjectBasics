package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{

	public void gotoConnect() {
	
		driver.findElement(By.xpath("//div[@id='zl-myapps']//div[1]//div[3]//div//a//span")).click();
	}
	
	public CRMHomePage gotoCRM() {
		
		click("crmlink_XPATH");
		return new CRMHomePage();
	}
	
	public void gotoSalesIQ() {
		
		driver.findElement(By.xpath("//div[@id='zl-myapps']//div[1]//div[8]//div//a//span")).click();
	}
}
