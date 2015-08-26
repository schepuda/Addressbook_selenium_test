package com.example.tests;

import org.testng.annotations.Test;

public class NoneEmptyGroupCreationTest extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    openMainPage();
    gotoGroupPage();
    initGroupCreation();
    FillGroupForm groupObject = new FillGroupForm();
    groupObject.groupname = "group_1";
    groupObject.groupheader = "������ VIP";
    groupObject.groupfooter = "��� VIP-��������";
	submitGroupCreation(groupObject);
    returnToGroupPage();
  }
}
