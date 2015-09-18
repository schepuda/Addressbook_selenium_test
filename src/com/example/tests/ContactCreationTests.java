package com.example.tests;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;

import com.example.utils.SortedListOf;


public class ContactCreationTests extends TestBase {

	//new contact
	@Test(dataProvider = "randomValidContactGenerator")
	public void testContactCreationValidData(ContactData contact) throws Exception {

	//save old list
		SortedListOf<ContactData> oldList = app.getContactHelper().getContacts();

	//action
		app.getContactHelper().createContact(contact);
		
	//save new list
		SortedListOf<ContactData> newList = app.getContactHelper().getContacts();
	    
	//compare lists
	    assertThat(newList, equalTo(oldList.withAdded(contact)));
	  }
	
  }