package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {	
	@Test
	public void testContactCreationTest() throws Exception {
	    openMainPage();
	    initContactCreation();
	    FillContactForm contactObject = new FillContactForm();
	    contactObject.firstname = "������� ����";
	    contactObject.lastname = "�����-�������";
	    contactObject.address = "443035 �. ������\n��������� ���.\n��. ��������-�����������, �. 138, ������ 2, ��. 159";
	    contactObject.home = "8 (846) 999-33-44";
	    contactObject.mobile = "+79023217999";
	    contactObject.work = "89063443775";
	    contactObject.email = "schepuda2@mail.ru";
	    contactObject.email2 = "schepuda2@gmail.com";
	    contactObject.bday = "1";
	    contactObject.bmonth = "June";
	    contactObject.byear = "1979";
	    contactObject.new_group = "Rob";
	    contactObject.address2 = "443035 �. ������\n��������� ���.\n��. ����-��������, �. 146, ������ 2, ��. 57";
	    contactObject.phone2 = "9994433";
	    fillContactCreation(contactObject);
	    submitContactCreation();
	    returnToHomePage();
	  }
  }