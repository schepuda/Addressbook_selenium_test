package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	  
	//full modification group
	  @Test
	  public void modifyAllGroup() throws Exception {
		GroupData group = new GroupData ("group_3", "Группа VIP - 3", "Для VIP-клиентов 3");
		int index = 0;
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare lists
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

	//check send each attribute
	  @Test
	  public void modifyNameGroup() throws Exception {
		GroupData group = new GroupData ("group_4", "", "");
		int index = 1;
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare lists
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

	  @Test
	  public void modifyHeaderGroup() throws Exception {
		GroupData group = new GroupData ("", "Группа VIP - 4", "");
		int index = 1;
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare lists
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	  @Test
	  public void modifyFooterGroup() throws Exception {
		GroupData group = new GroupData ("", "", "Для VIP-клиентов - 4");
		int index = 1;
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare lists
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	//check send empty attributes: create full group and send to it empty attributes
	  @Test
	  public void modifyFullGroup() throws Exception {
		GroupData group = new GroupData ("group_5", "Группа VIP - 5", "Для VIP-клиентов 5");
		int index = 2;
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	  }
	  
	  @Test
	  public void modifyEmptyGroup() throws Exception {
		GroupData group = new GroupData ("", "", "");
		int index = 2;
		app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare lists
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
		
		
   //click to Update-button without changes in group-form
     @Test
     public void modifyUnmodifyGroup() throws Exception {
 		int index = 1;
 		app.getNavigationHelper().openGroupPage();
 		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
 		app.getGroupHelper().initGroupModification(index);
 		app.getGroupHelper().goToGroupPageMod();
 		//save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
 		
	    //compare lists
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
   }       
        
     //click to EditGroup without checkboxes
       @Test
       public void modifyUnselectGroup() throws Exception {
     	app.getNavigationHelper().openGroupPage();
     	//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
     	app.getGroupHelper().clickGroupModification();
        app.getGroupHelper().goToGroupPageMod();

        //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
 		
	    //compare lists
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
     }
       
     //click to EditGroup with two checkboxes
       @Test
       public void modifyTwoSelectGroup() throws Exception {
     	app.getNavigationHelper().openGroupPage();
		//save old list
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//actions
     	app.getGroupHelper().selectGroupByIndex(0);
     	app.getGroupHelper().selectGroupByIndex(1);
     	app.getGroupHelper().clickGroupModification();
        app.getGroupHelper().goToGroupPageMod();

        //save new list
	    List<GroupData> newList = app.getGroupHelper().getGroups();
 		
	    //compare lists
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
     }
}