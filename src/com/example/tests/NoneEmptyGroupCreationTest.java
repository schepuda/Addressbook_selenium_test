package com.example.tests;

import org.testng.annotations.Test;

public class NoneEmptyGroupCreationTest extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    openMainPage();
    gotoGroupPage();
    initGroupCreation();
    FillGroupForm groupObject = new FillGroupForm();
    groupObject.name = "group_1";
    groupObject.header = "Группа VIP";
    groupObject.footer = "Для VIP-клиентов";
	submitGroupCreation(groupObject);
    returnToGroupPage();
  }
}
