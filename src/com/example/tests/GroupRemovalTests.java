package com.example.tests;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


public class GroupRemovalTests extends TestBase  {
	 	
	//удалим одну группу сверху
	  @Test
	  public void deleteSomeGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    //сохранить исходное состояние
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    app.getGroupHelper().selectGroupByIndex(0);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //сохранить новое состояние
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //сравнить состояния
	    oldList.remove(0);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	//удаление более одной группы
	  @Test
	  public void deleteSameGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    //сохранить исходное состояние
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    app.getGroupHelper().selectGroupByIndex(0);
	    app.getGroupHelper().selectGroupByIndex(1);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //сохранить новое состояние
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //сравнить состояния
	    oldList.remove(1);
	    oldList.remove(0);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	//клик по Delete, чекбокс группы не выбран
	  @Test
	  public void deleteUnselectedGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    //сохранить исходное состояние
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //сохранить новое состояние
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //сравнить состояния
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

}
