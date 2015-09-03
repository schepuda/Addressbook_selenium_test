package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	  
	//������ ����������� ������
	  @Test
	  public void modifyAllGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(1);
	    GroupData group = new GroupData();
	    group.name = "group_3";
	    group.header = "������ VIP - 3";
	    group.footer = "��� VIP-�������� 3";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }

	//�������� ������� �������� ������
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
	    group.header = "������ VIP - 4";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }
	  
	  @Test
	  public void modifyFooterGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(2);
	    GroupData group = new GroupData();
	    group.footer = "��� VIP-�������� - 4";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }
	  
	//�������� �������� ������ ��������: ������� ����-������, � ����� �� ��������
	  @Test
	  public void modifyFullGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupModification(3);
	    GroupData group = new GroupData();
	    group.name = "group_5";
	    group.header = "������ VIP - 5";
	    group.footer = "��� VIP-�������� 5";
		app.getGroupHelper().fillGroupData(app, this, group);
	    app.getGroupHelper().goToGroupPageMod();
	  }
	  
   //���� �� UpdateGroup, ��������� � ����� �� ���������
     @Test
     public void modifyUnmodifyGroup() throws Exception {
   	app.getNavigationHelper().openGroupPage();
      app.getGroupHelper().initGroupModification(2);
      app.getGroupHelper().goToGroupPageMod();
   }       
        
     //���� �� EditGroup, ������� �� ������
       @Test
       public void modifyUnselectGroup() throws Exception {
     	app.getNavigationHelper().openGroupPage();
     	app.getGroupHelper().clickGroupModification();
        app.getGroupHelper().goToGroupPageMod();
     }
       
     //���� �� EditGroup, ������� ��� ��������
       @Test
       public void modifyTwoSelectGroup() throws Exception {
     	app.getNavigationHelper().openGroupPage();
     	app.getGroupHelper().selectGroupByIndex(1);
     	app.getGroupHelper().selectGroupByIndex(2);
     	app.getGroupHelper().clickGroupModification();
        app.getGroupHelper().goToGroupPageMod();
     }
}
