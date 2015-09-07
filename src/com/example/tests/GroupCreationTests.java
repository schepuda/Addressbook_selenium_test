package com.example.tests;

import static org.testng.Assert.assertEquals;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {
 
	  //������ ������
	  @Test
	  public void testGroupCreation() throws Exception {
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.name = "group_1";
	    group.header = "������ VIP";
	    group.footer = "��� VIP-��������";
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
  
	  //�������� ������� �������� ������
  	  @Test
	  public void testNameCreation() throws Exception {
  		GroupData group = new GroupData ("group_2", "", "");
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
  
	  @Test
	  public void testHeaderCreation() throws Exception {
		GroupData group = new GroupData ("", "������ VIP - 2", "");
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	  @Test
	  public void testFooterGroupCreation() throws Exception {
		GroupData group = new GroupData ("", "", "��� VIP-�������� - 2");
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	  //������
	  @Test
	  public void testEmptyGroupCreation() throws Exception {
		GroupData group = new GroupData ("", "", "");
		app.getNavigationHelper().openGroupPage();
		//��������� �������� ���������
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		//��������
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupData(group);
	    app.getGroupHelper().goToGroupPageCreat();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //�������� ���������
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
}