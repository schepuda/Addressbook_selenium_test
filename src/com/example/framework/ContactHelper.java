package com.example.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.FillContactForm;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		driver.findElement(By.linkText("add new")).click();
	}

	public void fillContactCreation (ApplicationManager applicationManager, TestBase testBase, FillContactForm parameterObject) {
	    driver.findElement(By.name("firstname")).clear();
	    driver.findElement(By.name("firstname")).sendKeys(parameterObject.firstname);
	    driver.findElement(By.name("lastname")).clear();
	    driver.findElement(By.name("lastname")).sendKeys(parameterObject.lastname);
	    driver.findElement(By.name("address")).clear();
	    driver.findElement(By.name("address")).sendKeys(parameterObject.address);
	    driver.findElement(By.name("home")).clear();
	    driver.findElement(By.name("home")).sendKeys(parameterObject.home);
	    driver.findElement(By.name("mobile")).clear();
	    driver.findElement(By.name("mobile")).sendKeys(parameterObject.mobile);
	    driver.findElement(By.name("work")).clear();
	    driver.findElement(By.name("work")).sendKeys(parameterObject.work);
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys(parameterObject.email);
	    driver.findElement(By.name("email2")).clear();
	    driver.findElement(By.name("email2")).sendKeys(parameterObject.email2);
	    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(parameterObject.bday);
	    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(parameterObject.bmonth);
	    //new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("Rob");
	    driver.findElement(By.name("byear")).clear();
	    driver.findElement(By.name("byear")).sendKeys(parameterObject.byear);
	    driver.findElement(By.name("address2")).clear();
	    driver.findElement(By.name("address2")).sendKeys(parameterObject.address2);
	    driver.findElement(By.name("phone2")).clear();
	    driver.findElement(By.name("phone2")).sendKeys(parameterObject.phone2);
	}

	public void submitContactCreation() {
		driver.findElement(By.name("submit")).click();
	}

	public void returnToHomePage() {
		driver.findElement(By.linkText("home page")).click();
	}

}
