package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {	
	
	//checking send all contacts
	@Test
	public void testFullContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.firstname = "Евгений_Шуйский";
	    contact.lastname = "Мамин-Сибиряк";
	    contact.address = "443035 г. Бобруйск\nБелорусской респ.\nУл. Нагорная-Перевальная, д. 138/45, корпус 2, кв. 159";
	    contact.home = "8 (846) 999 77-00";
	    contact.mobile = "+79023217999";
	    contact.work = "89063443775";
	    contact.email = "schepuda2@mail.ru";
	    contact.email2 = "schepuda2@gmail.com";
	    contact.bday = "1";
	    contact.bmonth = "January";
	    contact.byear = "1801";
	    //contact.new_group = "Rob";
	    contact.address2 = "103035 Los-Angeles\nCalifornia st.\nPenny Lane str. - 50/4, office 4030";
	    contact.phone2 = "9994433";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	    //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	    //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
	//checking send of each contact
	@Test
	public void testFirstnameContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
	  //save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
	    app.getContactHelper().initContactCreation();
	    contact.firstname = "John-Connor";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	  //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
	@Test
	public void testLastnameContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
	  //save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		//actions
	    app.getContactHelper().initContactCreation();
	    contact.lastname = "Albert_Einstein";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	  //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
	@Test
	public void testAddressContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
	  //save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		//actions
	    app.getContactHelper().initContactCreation();
	    contact.address = "103035 Los-Angeles\nCalifornia st.\nPenny Lane str. - 50/4, office 4030";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	  //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
	@Test
	public void testHomeContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
	  //save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		//actions
	    app.getContactHelper().initContactCreation();
	    contact.home = "+7 (999) 888 77-66-11";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	  //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
	@Test
	public void testMobileContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
	  //save old list
	    List<ContactData> oldList = app.getContactHelper().getContacts();
	  //actions
	    app.getContactHelper().initContactCreation();
	    contact.mobile = "+7 (999) 888 77-66-22";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	  //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  	}
	
	@Test
	public void testWorkContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
	  //save old list
	    List<ContactData> oldList = app.getContactHelper().getContacts();
	  //actions
	    app.getContactHelper().initContactCreation();
	    contact.work = "+7 (999) 888 77-66-33";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	  //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
	@Test
	public void testEmailContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
	  //save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		//actions
	    app.getContactHelper().initContactCreation();
	    contact.email = "schepuda2@mail.ru";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	  //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
	@Test
	public void testEmail2ContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
	  //save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		//actions
	    app.getContactHelper().initContactCreation();
	    contact.email2 = "schepuda2@gmail.com";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	  //compare lists
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	
 
		@Test
		public void testBdayContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    ContactData contact = new ContactData();
		    contact.lastname = "";
		  //save old list
			List<ContactData> oldList = app.getContactHelper().getContacts();
			//actions
		    app.getContactHelper().initContactCreation();
		    contact.bday = "31";
		    app.getContactHelper().fillContactData(contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  //save new list
		    List<ContactData> newList = app.getContactHelper().getContacts();
		    
		  //compare lists
		    oldList.add(contact);
		    Collections.sort(oldList);
		    assertEquals(newList, oldList);
		  }
		
		@Test
		public void testBmonthContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    ContactData contact = new ContactData();
		    contact.lastname = "";
		  //save old list
			List<ContactData> oldList = app.getContactHelper().getContacts();
			//actions
		    app.getContactHelper().initContactCreation();
		    contact.bmonth = "December";
		    app.getContactHelper().fillContactData(contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  //save new list
		    List<ContactData> newList = app.getContactHelper().getContacts();
		    
		  //compare lists
		    oldList.add(contact);
		    Collections.sort(oldList);
		    assertEquals(newList, oldList);
		  }
		
		@Test
		public void testByearContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    ContactData contact = new ContactData();
		    contact.lastname = "";
		  //save old list
			List<ContactData> oldList = app.getContactHelper().getContacts();
			//actions
		    app.getContactHelper().initContactCreation();
		    contact.byear = "2001";
		    app.getContactHelper().fillContactData(contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  //save new list
		    List<ContactData> newList = app.getContactHelper().getContacts();
		    
		  //compare lists
		    oldList.add(contact);
		    Collections.sort(oldList);
		    assertEquals(newList, oldList);
		  }
		
		@Test
		public void testAddress2ContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    ContactData contact = new ContactData();
		    contact.lastname = "";
		  //save old list
			List<ContactData> oldList = app.getContactHelper().getContacts();
			//actions
		    app.getContactHelper().initContactCreation();
		    contact.address2 = "443035 г. Бобруйск\nБелорусской респ.\nУл. Нагорная-Перевальная, д. 138/45, корпус 2, кв. 159";
		    app.getContactHelper().fillContactData(contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  //save new list
		    List<ContactData> newList = app.getContactHelper().getContacts();
		    
		  //compare lists
		    oldList.add(contact);
		    Collections.sort(oldList);
		    assertEquals(newList, oldList);
		  }
		
		@Test
		public void testPhone2ContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    ContactData contact = new ContactData();
		    contact.lastname = "";
		  //save old list
			List<ContactData> oldList = app.getContactHelper().getContacts();
			//actions
		    app.getContactHelper().initContactCreation();
		    contact.phone2 = "+7 (999) 888 77-66-44";
		    app.getContactHelper().fillContactData(contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  //save new list
		    List<ContactData> newList = app.getContactHelper().getContacts();
		    
		  //compare lists
		    oldList.add(contact);
		    Collections.sort(oldList);
		    assertEquals(newList, oldList);
		}
		
		//check for empty contact
		  @Test
		  public void testEmptyContactCreation() throws Exception {
			  app.getNavigationHelper().openMainPage();
			    ContactData contact = new ContactData();
			    contact.lastname = "";
			  //save old list
				List<ContactData> oldList = app.getContactHelper().getContacts();
				//actions
				app.getContactHelper().initContactCreation();
				app.getContactHelper().submitContactCreation();
				app.getContactHelper().returnToHomePage();
			  //save new list
			    List<ContactData> newList = app.getContactHelper().getContacts();
			    
			  //compare lists
			    oldList.add(contact);
			    Collections.sort(oldList);
			    assertEquals(newList, oldList);
		  }
		  
		  //additional checks for select dates
			@Test
			public void testFakeDateContactCreation() throws Exception {
			    app.getNavigationHelper().openMainPage();
			    ContactData contact = new ContactData();
			    contact.lastname = "";
			  //save old list
				List<ContactData> oldList = app.getContactHelper().getContacts();
				//actions
			    app.getContactHelper().initContactCreation();
			    contact.bday = "-";
			    contact.bmonth = "-";
			    contact.byear = "18001";
			    app.getContactHelper().fillContactData(contact);
			    app.getContactHelper().submitContactCreation();
			    app.getContactHelper().returnToHomePage();
			  //save new list
			    List<ContactData> newList = app.getContactHelper().getContacts();
			    
			  //compare lists
			    oldList.add(contact);
			    Collections.sort(oldList);
			    assertEquals(newList, oldList);
		}

  }