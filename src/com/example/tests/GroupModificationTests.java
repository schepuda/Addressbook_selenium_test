package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;


public class GroupModificationTests extends TestBase {
	
	  
	//modification group
	  @Test(dataProvider = "randomValidGroupGenerator")
	  public void modifySomeGroup(GroupData group) throws Exception {
		app.getNavigationHelper().openGroupPage();
	//save old list
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    Random rnd = new Random();
	    int index = rnd.nextInt(oldList.size()-1);
		
	//actions
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().submitGroupModification();
	    app.getGroupHelper().returnToGroupPage();
	//save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	//compare lists
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
}
