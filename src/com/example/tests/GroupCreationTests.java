package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

	
	//new group
	  @Test(dataProvider = "randomValidGroupGenerator")
	  public void testGroupCreationValidData(GroupData group) throws Exception {
		app.getNavigationHelper().openGroupPage();
	//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
	//actions
		app.getGroupHelper().initGroupCreation();
	    app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().submitGroupCreation();
	    app.getGroupHelper().returnToGroupPage();
	//save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	//compare lists
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	   }
	 
}