package com.example.tests;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


public class GroupRemovalTests extends TestBase  {
	 	
	//remove top group
	  @Test
	  public void deleteSomeGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
		//save old list
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    //actions
	    app.getGroupHelper().selectGroupByIndex(0);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //compare lists
	    oldList.remove(0);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	//remove more than one group
	  @Test
	  public void deleteSameGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
		//save old list
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    //actions
	    app.getGroupHelper().selectGroupByIndex(0);
	    app.getGroupHelper().selectGroupByIndex(1);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //compare lists
	    oldList.remove(1);
	    oldList.remove(0);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	//click to Delete-button without checkbox
	  @Test
	  public void deleteUnselectedGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
		//save old list
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    //actions
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //save new list
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

}
