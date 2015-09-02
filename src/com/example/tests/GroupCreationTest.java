package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {
  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    FillGroupForm group = new FillGroupForm();
    group.name = "group_1";
    group.header = "Группа VIP";
    group.footer = "Для VIP-клиентов";
	app.getGroupHelper().fillGroupCreation(app, this, group);
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