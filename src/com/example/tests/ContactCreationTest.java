package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {	
	@Test
	public void testContactCreationTest() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactCreation();
	    FillContactForm contact = new FillContactForm();
	    contact.firstname = "������� ����";
	    contact.lastname = "�����-�������";
	    contact.address = "443035 �. ������\n��������� ���.\n��. ��������-�����������, �. 138, ������ 2, ��. 159";
	    contact.home = "8 (846) 999-33-44";
	    contact.mobile = "+79023217999";
	    contact.work = "89063443775";
	    contact.email = "schepuda2@mail.ru";
	    contact.email2 = "schepuda2@gmail.com";
	    contact.bday = "1";
	    contact.bmonth = "June";
	    contact.byear = "1979";
	    contact.new_group = "Rob";
	    contact.address2 = "443035 �. ������\n��������� ���.\n��. ����-��������, �. 146, ������ 2, ��. 57";
	    contact.phone2 = "9994433";
	    app.getContactHelper().fillContactCreation(app, this, contact);
	    app.getContactHelper().submitContactCreation();
	    app.getContactHelper().returnToHomePage();
	  }
	
	  @Test
	  public void testEmptyContactCreation() throws Exception {
		  app.getNavigationHelper().openMainPage();
		  app.getContactHelper().initContactCreation();
	      app.getContactHelper().submitContactCreation();
		  app.getContactHelper().returnToHomePage();
	  }
  }