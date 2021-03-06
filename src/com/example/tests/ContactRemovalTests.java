package com.example.tests;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Random;
import org.testng.annotations.Test;
import com.example.utils.SortedListOf;

public class ContactRemovalTests extends TestBase {

	//delete contact
	  @Test
	  public void deleteSomeContact() throws Exception {

	//save old list
			SortedListOf<ContactData> oldList 
			= new SortedListOf<ContactData> (app.getHibernateHelper().listContacts());
	    
	    Random rnd = new Random();
	    int index = rnd.nextInt(oldList.size()-1);	    
	//actions
	    app.getContactHelper().deleteContact(index);
	    
	//save new list
		SortedListOf<ContactData> newList = app.getContactHelper().getContacts();
	    
	//compare lists
	    assertThat(newList, equalTo(oldList.without(index)));
	  }

}
