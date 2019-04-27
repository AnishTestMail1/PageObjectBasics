package com.w2a.pages.crm;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CRMHomePage extends Page{

	public void verifyRefreshBtn() {
		driver.findElement(By.id("tb_small_loader")).click();
	}
	
	public void verifyWelcomeLabel() {
		
	}
}
