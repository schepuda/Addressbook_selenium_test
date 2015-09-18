package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;


public class ContactCreationTests extends TestBase {	
	
	//new contact
	@Test(dataProvider = "randomValidContactGenerator")
	public void testContactCreationValidData(ContactData contact) throws Exception {
	    app.getNavigationHelper().openMainPage();
	//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();

	//action
		app.getContactHelper().createContact(contact);
		
	//save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	//compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
  }