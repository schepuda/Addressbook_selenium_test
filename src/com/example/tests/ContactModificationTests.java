package com.example.tests;

import static com.example.tests.ContactDataGenerator.loadContactsFromXmlFile;
import static com.example.tests.ContactDataGenerator.loadContactsFromCsvFile;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Random;
import com.example.utils.SortedListOf;

public class ContactModificationTests extends TestBase {
	
	  @DataProvider
	  public Iterator<Object[]> contactsFromFile() throws IOException {
		return wrapContactsForDataProvider(loadContactsFromXmlFile(new File("contacts.xml"))).iterator();
	  }
	
	//modify contact
	  @Test(dataProvider = "contactsFromFile")
		public void testContactModificationValidData(ContactData contact) throws Exception {

		//save old list
			SortedListOf<ContactData> oldList 
			= new SortedListOf<ContactData> (app.getHibernateHelper().listContacts());
			
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