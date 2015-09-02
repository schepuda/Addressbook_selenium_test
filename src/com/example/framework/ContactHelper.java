package com.example.framework;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import com.example.tests.FillContactForm;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactCreation (ApplicationManager applicationManager, TestBase testBase, FillContactForm contact) {
		type(By.name("firstname"), contact.firstname);
		type(By.name("lastname"), contact.lastname);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.home);
		type(By.name("mobile"), contact.mobile);
		type(By.name("work"), contact.work);
		type(By.name("email"), contact.email);
		type(By.name("email2"), contact.email2);
	    select(By.name("bday"), contact.bday);
	    select(By.name("bmonth"), contact.bmonth);
	    //select(By.name("new_group"), contact.new_group);
		type(By.name("byear"), contact.byear);
		type(By.name("address2"), contact.address2);
		type(By.name("phone2"), contact.phone2);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}

}
