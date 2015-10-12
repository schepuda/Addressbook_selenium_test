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

import com.example.utils.SortedListOf;

public class ContactCreationTests extends TestBase {
	
	  @DataProvider
	  public Iterator<Object[]> contactsFromFile() throws IOException {
		return wrapContactsForDataProvider(loadContactsFromXmlFile(new File("contacts.xml"))).iterator();
	  }

	//new contact
	@Test(dataProvider = "contactsFromFile")
	public void testContactCreationValidData(ContactData contact) throws Exception {

	//save old list
		SortedListOf<ContactData> oldList 
		= new SortedListOf<ContactData> (app.getHibernateHelper().listContacts());

	//action
		app.getContactHelper().createContact(contact);
		
	//save new list
		SortedListOf<ContactData> newList 
		= new SortedListOf<ContactData> (app.getHibernateHelper().listContacts());
	    
	//compare lists
	    assertThat(newList, equalTo(oldList.withAdded(contact)));
	  }
	
  }