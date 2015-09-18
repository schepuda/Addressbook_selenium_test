package com.example.tests;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;

import com.example.utils.SortedListOf;

public class GroupCreationTests extends TestBase {

	
	//new group
	  @Test(dataProvider = "randomValidGroupGenerator")
	  public void testGroupCreationValidData(GroupData group) throws Exception {

	//save old list
		SortedListOf<GroupData> oldList = app.getGroupHelper().getGroups();
		
	//actions
		app.getGroupHelper().createGroup(group);
		
	//save new list
		SortedListOf<GroupData> newList = app.getGroupHelper().getGroups();
	    
	//compare lists
	    assertThat(newList, equalTo(oldList.withAdded(group)));
	   }
	 
}