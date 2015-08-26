package com.example.tests;

import org.testng.annotations.Test;

public class EmptyAddressCreationTest extends TestBase {
  @Test
  public void testEmptyGroupCreation() throws Exception {
	  openMainPage();
	  initNewAddressCreation();
	  FillAddressForm addressObject = new FillAddressForm();
      submitNewAddressCreation();
	  returnToHomePage();
  }
}
