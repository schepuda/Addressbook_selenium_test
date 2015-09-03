package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	  
	//полная модификация группы
	  @Test
	  public void modifyAllGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(1);
	    GroupData group = new GroupData();
	    group.name = "group_3";
	    group.header = "Группа VIP - 3";
	    group.footer = "Для VIP-клиентов 3";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }

	//передача каждого атрибута группы
	  @Test
	  public void modifyNameGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(2);
	    GroupData group = new GroupData();
	    group.name = "group_4";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }

	  @Test
	  public void modifyHeaderGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(2);
	    GroupData group = new GroupData();
	    group.header = "Группа VIP - 4";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }
	  
	  @Test
	  public void modifyFooterGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(2);
	    GroupData group = new GroupData();
	    group.footer = "Для VIP-клиентов - 4";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }
	  
	//проверка передачи пустых значений: сделаем фулл-группу, а потом ее почистим
	  @Test
	  public void modifyFullGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(3);
	    GroupData group = new GroupData();
	    group.name = "group_5";
	    group.header = "Группа VIP - 5";
	    group.footer = "Для VIP-клиентов 5";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }
	  
   //клик по UpdateGroup, изменений в форме не вносилось
     @Test
     public void modifyUnmodifyGroup() throws Exception {
   	app.getNavigationHelper().openGroupPage();
      app.getGroupHelper().initGroupModification(2);
      app.getGroupHelper().goToGroupPageMod();
   }       
        
     //клик по EditGroup, чекбокс не выбран
       @Test
       public void modifyUnselectGroup() throws Exception {
     	app.getNavigationHelper().openGroupPage();
     	app.getGroupHelper().clickGroupModification();
        app.getGroupHelper().goToGroupPageMod();
     }
       
     //клик по EditGroup, выбрали два чекбокса
       @Test
       public void modifyTwoSelectGroup() throws Exception {
     	app.getNavigationHelper().openGroupPage();
     	app.getGroupHelper().selectGroupByIndex(1);
     	app.getGroupHelper().selectGroupByIndex(2);
     	app.getGroupHelper().clickGroupModification();
        app.getGroupHelper().goToGroupPageMod();
     }
}
