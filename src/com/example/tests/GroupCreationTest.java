package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {
  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    FillGroupForm groupObject = new FillGroupForm();
    groupObject.name = "group_1";
    groupObject.header = "������ VIP";
    groupObject.footer = "��� VIP-��������";
	app.getGroupHelper().fillGroupCreation(app, this, groupObject);
	app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }
}