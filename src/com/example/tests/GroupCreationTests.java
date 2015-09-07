package com.example.tests;

import static org.testng.Assert.assertEquals;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {
 
	  //полная группа
	  @Test
	  public void testGroupCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
		//сохранить исходное состояние
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//действия
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.name = "group_1";
	    group.header = "Группа VIP";
	    group.footer = "Для VIP-клиентов";
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //сохранить новое состояние
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //сравнить состояния
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
  
	  //передача каждого атрибута группы
  	  @Test
	  public void testNameCreation() throws Exception {
  		GroupData group = new GroupData ("group_2", "", "");
		app.getNavigationHelper().openGroupPage();
		//сохранить исходное состояние
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//действия
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //сохранить новое состояние
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //сравнить состояния
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
  
	  @Test
	  public void testHeaderCreation() throws Exception {
		GroupData group = new GroupData ("", "Группа VIP - 2", "");
		app.getNavigationHelper().openGroupPage();
		//сохранить исходное состояние
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//действия
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //сохранить новое состояние
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //сравнить состояния
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	  @Test
	  public void testFooterGroupCreation() throws Exception {
		GroupData group = new GroupData ("", "", "Для VIP-клиентов - 2");
		app.getNavigationHelper().openGroupPage();
		//сохранить исходное состояние
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//действия
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //сохранить новое состояние
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //сравнить состояния
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	  //пустая
	  @Test
	  public void testEmptyGroupCreation() throws Exception {
		GroupData group = new GroupData ("", "", "");
		app.getNavigationHelper().openGroupPage();
		//сохранить исходное состояние
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//действия
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //сохранить новое состояние
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //сравнить состояния
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
}