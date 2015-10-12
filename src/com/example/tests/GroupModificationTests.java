package com.example.tests;

import static com.example.tests.GroupDataGenerator.loadGroupsFromCsvFile;
import static com.example.tests.GroupDataGenerator.loadGroupsFromXmlFile;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Random;
import com.example.utils.SortedListOf;

public class GroupModificationTests extends TestBase {
	
	  @DataProvider
	  public Iterator<Object[]> groupsFromFile() throws IOException {
		return wrapGroupsForDataProvider(loadGroupsFromCsvFile(new File("groups.txt"))).iterator();
	  }
	  
	//modification group
	  @Test(dataProvider = "groupsFromFile")
	  public void modifySomeGroup(GroupData group) throws Exception {

	//save old list
			SortedListOf<GroupData> oldList 
			= new SortedListOf<GroupData> (app.getHibernateHelper().listGroups());
	    
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
