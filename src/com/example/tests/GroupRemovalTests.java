package com.example.tests;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Random;
import org.testng.annotations.Test;
import com.example.utils.SortedListOf;


public class GroupRemovalTests extends TestBase  {
	  
	//delete group
	@Test
	  public void deleteSomeGroup() throws Exception {

	//save old list
		SortedListOf<GroupData> oldList 
		= new SortedListOf<GroupData> (app.getHibernateHelper().listGroups());
	    
	    Random rnd = new Random();
	    int index = rnd.nextInt(oldList.size()-1);
	 //actions
	    app.getGroupHelper().deleteGroup(index);
	    
	 //save new list
		SortedListOf<GroupData> newList 
		= new SortedListOf<GroupData> (app.getHibernateHelper().listGroups());
	    
	 //compare lists
	    assertThat(newList, equalTo(oldList.without(index)));
	  }

}
