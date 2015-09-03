package com.example.tests;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase  {
	  
	//������ 4-� ������ ������, ����� �� ������ GroupModificationTests
	  @Test
	  public void deleteSomeGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().selectGroupByIndex(4);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	  }
	  
	//�������� ����� ����� ������
	  @Test
	  public void deleteSameGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().selectGroupByIndex(5);
	    app.getGroupHelper().selectGroupByIndex(6);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	  }
	  
	//���� �� Delete, ������� ������ �� ������
	  @Test
	  public void deleteUnselectedGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	  }
}
