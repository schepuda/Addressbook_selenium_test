package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	//проверка передачи всех контактов
	  @Test
	  public void modifyAllContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(1);
	    ContactData contact = new ContactData();
	    contact.firstname = "Евгений Шуйский";
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
	  }

	  //проверка передачи каждого контакта
	  @Test
	  public void modifyFirstnameContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.firstname = "Albert Einstein";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyLastnameContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.lastname = "John-Connor";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyAddressContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.address = "303035 Los-Angeles\nCalifornia st.\nPenny Lane str. - 50/4, office 4030";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyHomeContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.home = "+8 (999) 888 77-44";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyMobileContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.mobile = "+8 (999) 888 77-33";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyWorkContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.work = "+8 (999) 888 77-22";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyEmailContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.email = "schepuda2@mail.ru";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyEmail2Contact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.email2 = "schepuda2@gmail.com";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyBdayContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.bday = "31";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyBmonthContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.bmonth = "December";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyByearContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.byear = "2901";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyAddress2Contact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.address2 = "543035 г. Бобруйск\nБелорусской респ.\nУл. Нагорная-Перевальная, д. 138/45, корпус 2, кв. 159";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  @Test
	  public void modifyPhone2Contact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    ContactData contact = new ContactData();
	    contact.phone2 = "+8 (999) 888 77-11";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  //дополнительные проверки селекта дат
	  @Test
	  public void modifyFakeDateContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(3);
	    ContactData contact = new ContactData();
	    contact.bday = "-";
	    contact.bmonth = "-";
	    contact.byear = "18001";
	    app.getContactHelper().fillContactData(contact);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
	  
	  //проверка передачи пустых значений: сделаем фулл-контакт и тут же его почистим
	  @Test
	  public void modifyFullContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(4);
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
	    app.getContactHelper().initContactEditByIndex(4);
	    ContactData contact = new ContactData();
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
	  }	  
	  
	  @Test
	  public void modifyUnmodifyContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(2);
	    app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToHomePage();
	  }
}