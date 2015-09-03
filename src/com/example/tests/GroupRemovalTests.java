package com.example.tests;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase  {
	  
	//удалим 4-ю группу сверху, чтобы не мешать GroupModificationTests
	  @Test
	  public void deleteSomeGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().selectGroupByIndex(4);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	  }
	  
	//удаление более одной группы
	  @Test
	  public void deleteSameGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().selectGroupByIndex(5);
	    app.getGroupHelper().selectGroupByIndex(6);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	  }
	  
	//клик по Delete, чекбокс группы не выбран
	  @Test
	  public void deleteUnselectedGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	  }
}
