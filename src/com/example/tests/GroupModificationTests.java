package com.example.tests;

import static org.testng.Assert.assertEquals;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	  
	//������ ����������� ������
	  @Test
	  public void modifyAllGroup() throws Exception {
		GroupData group = new GroupData ("group_3", "������ VIP - 3", "��� VIP-�������� 3");
		int index = 0;
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

	//�������� ������� �������� ������
	  @Test
	  public void modifyNameGroup() throws Exception {
		GroupData group = new GroupData ("group_4", "", "");
		int index = 1;
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

	  @Test
	  public void modifyHeaderGroup() throws Exception {
		GroupData group = new GroupData ("", "������ VIP - 4", "");
		int index = 1;
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	  @Test
	  public void modifyFooterGroup() throws Exception {
		GroupData group = new GroupData ("", "", "��� VIP-�������� - 4");
		int index = 1;
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	//�������� �������� ������ ��������: ������� ����-������, � ����� �� ��������
	  @Test
	  public void modifyFullGroup() throws Exception {
		GroupData group = new GroupData ("group_5", "������ VIP - 5", "��� VIP-�������� 5");
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
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageMod();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
		
		
   //���� �� UpdateGroup, ��������� � ����� �� ���������
     @Test
     public void modifyUnmodifyGroup() throws Exception {
 		int index = 1;
 		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
 		app.getGroupHelper().initGroupModification(index);
 		app.getGroupHelper().goToGroupPageMod();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
 		
	    //�������� ���������
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
   }       
        
     //���� �� EditGroup, ������� �� ������
       @Test
       public void modifyUnselectGroup() throws Exception {
     	app.getNavigationHelper().openGroupPage();

		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
     	app.getGroupHelper().clickGroupModification();
        app.getGroupHelper().goToGroupPageMod();

	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
 		
	    //�������� ���������
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
     }
       
     //���� �� EditGroup, ������� ��� ��������
       @Test
       public void modifyTwoSelectGroup() throws Exception {
     	app.getNavigationHelper().openGroupPage();

		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
     	app.getGroupHelper().selectGroupByIndex(0);
     	app.getGroupHelper().selectGroupByIndex(1);
     	app.getGroupHelper().clickGroupModification();
        app.getGroupHelper().goToGroupPageMod();

	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
 		
	    //�������� ���������
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
     }
}