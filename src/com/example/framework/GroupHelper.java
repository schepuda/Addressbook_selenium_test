package com.example.framework;

import org.openqa.selenium.By;

import com.example.tests.FillGroupForm;
import com.example.tests.TestBase;

public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitGroupCreation() {
		driver.findElement(By.name("submit")).click();
	}

	public void returnToGroupPage() {
		driver.findElement(By.linkText("group page")).click();
	}

	public void fillGroupCreation(ApplicationManager applicationManager, TestBase testBase, FillGroupForm parameterObject) {
		driver.findElement(By.name("group_name")).clear();
	    driver.findElement(By.name("group_name")).sendKeys(parameterObject.name);
	    driver.findElement(By.name("group_header")).clear();
	    driver.findElement(By.name("group_header")).sendKeys(parameterObject.header);
	    driver.findElement(By.name("group_footer")).clear();
	    driver.findElement(By.name("group_footer")).sendKeys(parameterObject.footer);
	}

	public void initGroupCreation() {
		driver.findElement(By.name("new")).click();
	}

}
