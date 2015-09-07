package com.example.tests;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


public class GroupRemovalTests extends TestBase  {
	 	
	//������ ���� ������ ������
	  @Test
	  public void deleteSomeGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    //��������� �������� ���������
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    app.getGroupHelper().selectGroupByIndex(0);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //�������� ���������
	    oldList.remove(0);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	//�������� ����� ����� ������
	  @Test
	  public void deleteSameGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    //��������� �������� ���������
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    app.getGroupHelper().selectGroupByIndex(0);
	    app.getGroupHelper().selectGroupByIndex(1);
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //�������� ���������
	    oldList.remove(1);
	    oldList.remove(0);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }
	  
	//���� �� Delete, ������� ������ �� ������
	  @Test
	  public void deleteUnselectedGroup() throws Exception {
		app.getNavigationHelper().openGroupPage();
	    //��������� �������� ���������
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    app.getGroupHelper().deleteGroup();
	    app.getGroupHelper().returnToGroupPage();
	    //��������� ����� ���������
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    	    
	    //�������� ���������
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	  }

}
