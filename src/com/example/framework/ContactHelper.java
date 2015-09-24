package com.example.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;
import com.example.utils.SortedListOf;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

 	private boolean CREATION;
	private boolean MODIFY;
	private SortedListOf<ContactData> cashedContacts;
	
	public SortedListOf<ContactData> getContacts() {
 		if (cashedContacts == null) {
 			return rebuildCashe();
 		}
		return cashedContacts;
	}

	public SortedListOf<ContactData> rebuildCashe() {
		SortedListOf<ContactData> cashedContacts  = new SortedListOf<ContactData>();
		manager.NavigateTo().toMainPage();
		List<WebElement> rows = driver.findElements(By.xpath("(.//td[2])[position() != last()]"));
		for (WebElement row : rows) {
			String lastname = row. getText();
			cashedContacts.add(new ContactData().withLastname(lastname));
		}
		return cashedContacts ;
	}
	
	public ContactHelper createContact(ContactData contact) {
	    manager.NavigateTo().toMainPage();
		initContactCreation();
	    fillContactData(contact, CREATION);
	    submitContactCreation();
	    returnToHomePage();
	    rebuildCashe();
		return this;
	}

	public ContactHelper modifyContact(ContactData contact, int index) {
		manager.NavigateTo().toMainPage();
		initContactEditByIndex(index);
		fillContactData(contact, MODIFY);
		submitContactModification();
		returnToHomePage();
	    rebuildCashe();
		return this;
	}
	
	public ContactHelper deleteContact(int index) {
		manager.NavigateTo().toMainPage();
		initContactEditByIndex(index);
	    deleteContact();
	    returnToHomePage();
	    rebuildCashe();
		return this;
	}
	
//-----------------------------------------------------------------------------------
	
	public ContactHelper initContactCreation() {
		click(By.linkText("add new"));
		return this;
	}	

	public void fillContactData (ContactData contact, boolean formType) {
		type(By.name("firstname"), contact.getFirstname());
		type(By.name("lastname"), contact.getLastname());
		type(By.name("address"), contact.getAddress());
		type(By.name("home"), contact.getHome());
		type(By.name("mobile"), contact.getMobile());
		type(By.name("work"), contact.getWork());
		type(By.name("email"), contact.getEmail());
		type(By.name("email2"), contact.getEmail2());
	    select(By.name("bday"), contact.getBday());
	    select(By.name("bmonth"), contact.getBmonth());
	    if (formType == CREATION) {
	    //select(By.name("new_group"), "VIP-group");
	    } else {
	    	if (driver.findElements(By.name("new_group")).size() !=0) {
	    		throw new Error("Group selector not exists in contact modification form");
	    	}
	    }
		type(By.name("byear"), contact.getByear());
		type(By.name("address2"), contact.getAddress2());
		type(By.name("phone2"), contact.getPhone2());
	}

	public ContactHelper returnToHomePage() {
		click(By.linkText("home page"));
		return this;
	}
	
	public ContactHelper initContactEditByIndex(int index) {
			click(By.xpath("(//img[@alt='Edit'])[" + (index+1) + "]"));
			return this;
	}
	
	public ContactHelper submitContactCreation() {
		click(By.name("submit"));
		return this;
	}
	
	public ContactHelper submitContactModification() {
		click(By.name("update"));
		return this;
	}
	
	public ContactHelper deleteContact() {
		click(By.xpath("(//input[@name='update'])[2]"));
		return this;
	}

}