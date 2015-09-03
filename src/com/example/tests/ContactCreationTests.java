package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {	
	
	//проверка передачи всех контактов
	@Test
	public void testFullContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.firstname = "Евгений Шуйский";
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
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	//проверка передачи каждого контакта
	@Test
	public void testFirstnameContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.firstname = "John-Connor";
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	@Test
	public void testLastnameContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.lastname = "Albert Einstein";
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	@Test
	public void testAddressContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.address = "103035 Los-Angeles\nCalifornia st.\nPenny Lane str. - 50/4, office 4030";
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	@Test
	public void testHomeContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.home = "+7 (999) 888 77-66-11";
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	@Test
	public void testMobileContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.mobile = "+7 (999) 888 77-66-22";
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	@Test
	public void testWorkContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.work = "+7 (999) 888 77-66-33";
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	@Test
	public void testEmailContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.email = "schepuda2@mail.ru";
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	@Test
	public void testEmail2ContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    ContactData contact = new ContactData();
	    contact.email2 = "schepuda2@gmail.com";
	    app.getContactHelper().fillContactData(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
 
		@Test
		public void testBdayContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    app.getContactHelper().initContactCreation();
		    ContactData contact = new ContactData();
		    contact.bday = "31";
		    app.getContactHelper().fillContactData(app, this, contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  }
		
		@Test
		public void testBmonthContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    app.getContactHelper().initContactCreation();
		    ContactData contact = new ContactData();
		    contact.bmonth = "December";
		    app.getContactHelper().fillContactData(app, this, contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  }
		
		@Test
		public void testByearContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    app.getContactHelper().initContactCreation();
		    ContactData contact = new ContactData();
		    contact.byear = "2001";
		    app.getContactHelper().fillContactData(app, this, contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  }
		
		@Test
		public void testAddress2ContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    app.getContactHelper().initContactCreation();
		    ContactData contact = new ContactData();
		    contact.address2 = "443035 г. Бобруйск\nБелорусской респ.\nУл. Нагорная-Перевальная, д. 138/45, корпус 2, кв. 159";
		    app.getContactHelper().fillContactData(app, this, contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
		  }
		
		@Test
		public void testPhone2ContactCreation() throws Exception {
		    app.getNavigationHelper().openMainPage();
		    app.getContactHelper().initContactCreation();
		    ContactData contact = new ContactData();
		    contact.phone2 = "+7 (999) 888 77-66-44";
		    app.getContactHelper().fillContactData(app, this, contact);
		    app.getContactHelper().submitContactCreation();
		    app.getContactHelper().returnToHomePage();
	  }
		
		  //пустой контакт
		  @Test
		  public void testEmptyContactCreation() throws Exception {
			  app.getNavigationHelper().openMainPage();
			  app.getContactHelper().initContactCreation();
		      app.getContactHelper().submitContactCreation();
			  app.getContactHelper().returnToHomePage();
		  }
		  
			//дополнительные проверки селекта дат
			@Test
			public void testFakeDateContactCreation() throws Exception {
			    app.getNavigationHelper().openMainPage();
			    app.getContactHelper().initContactCreation();
			    ContactData contact = new ContactData();
			    contact.bday = "-";
			    contact.bmonth = "-";
			    contact.byear = "18001";
			    app.getContactHelper().fillContactData(app, this, contact);
			    app.getContactHelper().submitContactCreation();
			    app.getContactHelper().returnToHomePage();
			  }
		  
  }