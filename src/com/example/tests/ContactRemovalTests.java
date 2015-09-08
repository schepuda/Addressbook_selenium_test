package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {

	//remove top contact
	  @Test
	  public void deleteSomeContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
	    //actions
	    app.getContactHelper().initContactEditByIndex(index);
	    app.getContactHelper().deleteContact();
	    app.getContactHelper().returnToHomePage();
	    //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	    //compare lists
	    oldList.remove(index);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
}
