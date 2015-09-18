package com.example.tests;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Random;

import org.testng.annotations.Test;

import com.example.utils.SortedListOf;


public class GroupModificationTests extends TestBase {
	
	  
	//modification group
	  @Test(dataProvider = "randomValidGroupGenerator")
	  public void modifySomeGroup(GroupData group) throws Exception {

	//save old list
		SortedListOf<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    Random rnd = new Random();
	    int index = rnd.nextInt(oldList.size()-1);
		
	//actions
	    app.getGroupHelper().modifyGroup(group, index);
	    
	//save new list
	    SortedListOf<GroupData> newList = app.getGroupHelper().getGroups();
	    
	//compare lists
	    assertThat(newList, equalTo(oldList.without(index).withAdded(group)));
	  }

}
