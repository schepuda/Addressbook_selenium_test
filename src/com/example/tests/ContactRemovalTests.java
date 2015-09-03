package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {

	//удалим 5-й сверху контакт, чтобы не мешало ContactModificationTests
	  @Test
	  public void deleteSomeContact() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactEditByIndex(5);
	    app.getContactHelper().deleteContact();
	    app.getContactHelper().returnToHomePage();
	  }
}
