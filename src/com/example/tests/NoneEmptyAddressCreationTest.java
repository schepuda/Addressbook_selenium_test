package com.example.tests;

import org.testng.annotations.Test;

public class NoneEmptyAddressCreationTest extends TestBase {	
	@Test
	public void testFillAddressCreationTest() throws Exception {
	    openMainPage();
	    initNewAddressCreation();
	    FillAddressForm addressObject = new FillAddressForm();
	    addressObject.firstname = "������� ����";
	    addressObject.lastname = "�����-�������";
	    addressObject.address = "443035 �. ������\n��������� ���.\n��. ��������-�����������, �. 138, ������ 2, ��. 159";
	    addressObject.home = "8 (846) 999-33-44";
	    addressObject.mobile = "+79023217999";
	    addressObject.work = "89063443775";
	    addressObject.email = "schepuda2@mail.ru";
	    addressObject.email2 = "schepuda2@gmail.com";
	    addressObject.bday = "1";
	    addressObject.bmonth = "June";
	    addressObject.byear = "1979";
	    addressObject.new_group = "Rob";
	    addressObject.address2 = "443035 �. ������\n��������� ���.\n��. ����-��������, �. 146, ������ 2, ��. 57";
	    addressObject.phone2 = "9994433";
		submitNewAddressCreation(addressObject);
	    returnToHomePage();
	  }
  }