package com.example.tests;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Random;

import org.testng.annotations.Test;

import com.example.utils.SortedListOf;

public class ContactModificationTests extends TestBase {
	
	//modify contact
	  @Test(dataProvider = "randomValidContactGenerator")
		public void testContactModificationValidData(ContactData contact) throws Exception {

		//save old list
		  SortedListOf<ContactData> oldList = app.getContactHelper().getContacts();
			
		    Random rnd = new Random();
		    int index = rnd.nextInt(oldList.size()-1);
		//actions
		    app.getContactHelper().modifyContact(contact, index);
			
		//save new list
		    SortedListOf<ContactData> newList = app.getContactHelper().getContacts();
		    
		//compare lists
		    assertThat(newList, equalTo(oldList.without(index).withAdded(contact)));
		  }
  
}