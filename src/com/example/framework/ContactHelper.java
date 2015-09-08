package com.example.framework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactData (ContactData contact) {
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
	
	public void initContactEditByIndex(int index) {
			click(By.xpath("(//img[@alt='Edit'])[" + (index+1) + "]"));
	}
	
	public void submitContactModification() {
		click(By.name("update"));
	}
	
	public void deleteContact() {
		click(By.xpath("(//input[@name='update'])[2]"));
	}
	
	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			ContactData contact = new ContactData();
			String title = checkbox.getAttribute("title");
			contact.lastname = title.substring(title.lastIndexOf(" ") + 1, title.length() - ")".length());
			contacts.add(contact);
		}
		return contacts;
	}
}
