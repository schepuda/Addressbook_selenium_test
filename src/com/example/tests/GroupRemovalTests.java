package com.example.tests;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


public class GroupRemovalTests extends TestBase  {
	  
	//delete group
	@Test
	  public void deleteSomeGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	//save old list
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    Random rnd = new Random();
	    int index = rnd.nextInt(oldList.size()-1);
	 //actions
	    app.getGroupHelper().deleteGroup(index);
	    
	 //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	 //compare lists
	    oldList.remove(index);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

}
