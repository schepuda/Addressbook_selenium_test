package com.example.tests;

import static org.testng.Assert.assertEquals;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {
 
	//check send all attributes
	  @Test
	  public void testGroupCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.name = "group_1";
	    group.header = "Группа VIP";
	    group.footer = "Для VIP-клиентов";
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	  //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	  //compare lists
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
  
	  //check send each attribute
  	  @Test
	  public void testNameCreation() throws Exception {
  		GroupData group = new GroupData ("group_2", "", "");
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	  //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	  //compare lists
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
  
	  @Test
	  public void testHeaderCreation() throws Exception {
		GroupData group = new GroupData ("", "Группа VIP - 2", "");
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	  //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	  //compare lists
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	  @Test
	  public void testFooterGroupCreation() throws Exception {
		GroupData group = new GroupData ("", "", "Для VIP-клиентов - 2");
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	  //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	  //compare lists
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	  //empty group
	  @Test
	  public void testEmptyGroupCreation() throws Exception {
		GroupData group = new GroupData ("", "", "");
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
	
		//actions
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	  //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	  //compare lists
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
}