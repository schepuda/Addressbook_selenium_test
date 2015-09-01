package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {
  @Test
  public void testGroupCreation() throws Exception {
    openMainPage();
    gotoGroupPage();
    initGroupCreation();
    FillGroupForm groupObject = new FillGroupForm();
    groupObject.name = "group_1";
    groupObject.header = "������ VIP";
    groupObject.footer = "��� VIP-��������";
	fillGroupCreation(groupObject);
	submitGroupCreation();
    returnToGroupPage();
  }
}
