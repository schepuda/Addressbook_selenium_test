package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	//checking send all contacts
	  @Test
	  public void modifyAllContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 0;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.firstname = "Евгений_Шуйский";
	    contact.lastname = "Мамин-Сибиряк";
	    contact.address = "543035 г. Бобруйск\nБелорусской респ.\nУл. Нагорная-Перевальная, д. 138/45, корпус 2, кв. 159";
	    contact.home = "+8 (999) 888 77-66-11";
	    contact.mobile = "+8 (999) 888 77-66-22";
	    contact.work = "+8 (999) 888 77-66-33";
	    contact.email = "schepuda2@mail.ru";
	    contact.email2 = "schepuda2@gmail.com";
	    contact.bday = "1";
	    contact.bmonth = "January";
	    contact.byear = "1901";
	    //contact.new_group = "Rob";
	    contact.address2 = "203035 Los-Angeles\nCalifornia st.\nPenny Lane str. - 50/4, office 4030";
	    contact.phone2 = "+8 (999) 888 77-66-44";
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

	//checking send each contact
	  @Test
	  public void modifyFirstnameContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.firstname = "Albert Einstein";
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

	  @Test
	  public void modifyLastnameContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.lastname = "John-Connor";
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
	  
	  @Test
	  public void modifyAddressContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.address = "303035 Los-Angeles\nCalifornia st.\nPenny Lane str. - 50/4, office 4030";
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
	  
	  @Test
	  public void modifyHomeContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.home = "+8 (999) 888 77-44";
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
	  
	  @Test
	  public void modifyMobileContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.mobile = "+8 (999) 888 77-33";
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
	  
	  @Test
	  public void modifyWorkContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.work = "+8 (999) 888 77-22";
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
	  
	  @Test
	  public void modifyEmailContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.email = "schepuda2@mail.ru";
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
	  
	  @Test
	  public void modifyEmail2Contact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.email2 = "schepuda2@gmail.com";
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
	  
	  @Test
	  public void modifyBdayContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.bday = "31";
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
	  
	  @Test
	  public void modifyBmonthContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.bmonth = "December";
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
	  
	  @Test
	  public void modifyByearContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.byear = "2901";
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
	  
	  @Test
	  public void modifyAddress2Contact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.address2 = "543035 г. Бобруйск\nБелорусской респ.\nУл. Нагорная-Перевальная, д. 138/45, корпус 2, кв. 159";
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
	  
	  @Test
	  public void modifyPhone2Contact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.phone2 = "+8 (999) 888 77-11";
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
	  
	//additional checks for select dates
	  @Test
	  public void modifyFakeDateContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 2;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.bday = "-";
	    contact.bmonth = "-";
	    contact.byear = "18001";
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
	  
	//check send empty attributes: create full contact and send to it empty attributes
	  @Test
	  public void modifyFullContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
		int index = 3;
	    app.getContactHelper().initContactEditByIndex(index);
	    ContactData contact = new ContactData();
	    contact.firstname = "Евгений Шуйский";
	    contact.lastname = "Мамин-Сибиряк";
	    contact.address = "543035 г. Бобруйск\nБелорусской респ.\nУл. Нагорная-Перевальная, д. 138/45, корпус 2, кв. 159";
	    contact.home = "+8 (999) 888 77-11";
	    contact.mobile = "+8 (999) 888 77-22";
	    contact.work = "+8 (999) 888 77-33";
	    contact.email = "schepuda2@mail.ru";
	    contact.email2 = "schepuda2@gmail.com";
	    contact.bday = "1";
	    contact.bmonth = "January";
	    contact.byear = "1901";
	    contact.address2 = "203035 Los-Angeles\nCalifornia st.\nPenny Lane str. - 50/4, office 4030";
	    contact.phone2 = "+8 (999) 888 77-44";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyEnmtyContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 3;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    contact.firstname = "";
	    contact.lastname = "";
	    contact.address = "";
	    contact.home = "";
	    contact.mobile = "";
	    contact.work = "";
	    contact.email = "";
	    contact.email2 = "";
	    contact.byear = "";
	    contact.address2 = "";
	    contact.phone2 = "";
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
	  
	 //click to Update-button without changes in contact-form
	  @Test
	  public void modifyUnmodifyContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    ContactData contact = new ContactData();
	    contact.lastname = "";
		int index = 1;
		//save old list
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		//actions
	    app.getContactHelper().initContactEditByIndex(index);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	    //save new list
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	    //compare lists
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

}