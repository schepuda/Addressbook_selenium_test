package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
 
	  //полная группа
	  @Test
	  public void testGroupCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.name = "group_1";
	    group.header = "Группа VIP";
	    group.footer = "Для VIP-клиентов";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageCreat();
	  }
  
	  //передача каждого атрибута группы
  	  @Test
	  public void testNameCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.name = "group_2";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageCreat();
	  }
  
	  @Test
	  public void testHeaderCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.header = "Группа VIP - 2";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageCreat();
	  }
	  
	  @Test
	  public void testFooterGroupCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.footer = "Для VIP-клиентов - 2";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageCreat();
	  }
	  
	  //пустая
	  @Test
	  public void testEmptyGroupCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupCreation();
	    app.getGroupHelper().goToGroupPageCreat();
	  }
	  
	  //и еще побольше, для GroupModification и GroupRemoval
	  @Test
	  public void testEmpty2GroupCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupCreation();
	    app.getGroupHelper().goToGroupPageCreat();
	  }
	  
	  @Test
	  public void testEmpty3GroupCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupCreation();
	    app.getGroupHelper().goToGroupPageCreat();
	  }
}