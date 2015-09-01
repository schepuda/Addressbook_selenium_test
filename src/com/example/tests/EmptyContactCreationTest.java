package com.example.tests;

import org.testng.annotations.Test;

public class EmptyContactCreationTest extends TestBase {
  @Test
  public void testEmptyGroupCreation() throws Exception {
	  openMainPage();
	  initNewAddressCreation();
      submitNewAddressCreation();
	  returnToHomePage();
  }
}
