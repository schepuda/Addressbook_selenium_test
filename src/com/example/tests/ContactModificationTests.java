package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	//modify contact
	  @Test(dataProvider = "randomValidContactGenerator")
		public void testContactModificationValidData(ContactData contact) throws Exception {
		    app.getNavigationHelper().openMainPage();
		//save old list
			List<ContactData> oldList = app.getContactHelper().getContacts();
			
		    Random rnd = new Random();
		    int index = rnd.nextInt(oldList.size()-1);
		//actions
			app.getContactHelper().initContactEditByIndex(index);
		    app.getContactHelper().fillContactData(contact);
		    app.getContactHelper().submitContactModification();
		    app.getContactHelper().returnToHomePage();
		//save new list
		    List<ContactData> newList = app.getContactHelper().getContacts();
		    
		//compare lists
		    oldList.remove(index);
		    oldList.add(contact);
		    Collections.sort(oldList);
		    assertEquals(newList, oldList);
		  }
	  
}