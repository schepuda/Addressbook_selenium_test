package com.example.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupData;
import com.example.utils.SortedListOf;

public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}
	
	private SortedListOf<GroupData> cashedGroups;
	
	public SortedListOf<GroupData> getGroups() {
 		if (cashedGroups == null) {
			return rebuildCashe();
 		}
		return cashedGroups;
	}

	private SortedListOf<GroupData> rebuildCashe() {
		SortedListOf<GroupData> cashedGroups = new SortedListOf<GroupData>();
		manager.NavigateTo().toGroupsPage();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			String title = checkbox.getAttribute("title");
			String name = title.substring("Select (".length(), title.length() - ")".length());
			cashedGroups.add(new GroupData().withName(name));
		} 	return cashedGroups;
	}

	public GroupHelper createGroup(GroupData group) {
		manager.NavigateTo().toGroupsPage();
		initGroupCreation();
	    fillGroupData(group);
	    submitGroupCreation();
	    returnToGroupPage();
	    rebuildCashe();
		return this;
	}

	public GroupHelper modifyGroup(GroupData group, int index) {
		manager.NavigateTo().toGroupsPage();
		initGroupModification(index);
		fillGroupData(group);
	    submitGroupModification();
	    returnToGroupPage();
	    rebuildCashe();
		return this;
	}

	public GroupHelper deleteGroup(int index) {
		manager.NavigateTo().toGroupsPage();
		selectGroupByIndex(index);
	    deleteGroup();
	    returnToGroupPage();
	    rebuildCashe();
		return this;
	}
	
//-----------------------------------------------------------------------------------
	
	public GroupHelper initGroupCreation() {
		click(By.name("new"));
		return this;
	}
	
	public GroupHelper fillGroupData(GroupData group) {
		type(By.name("group_name"), group.getName());
		type(By.name("group_header"), group.getHeader());
		type(By.name("group_footer"), group.getFooter());
		return this;
	}

	public GroupHelper returnToGroupPage() {
		click(By.linkText("group page"));
		return this;
	}

	public GroupHelper selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index+1) +  "]"));
		return this;
	}

	public GroupHelper initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
		return this;
	}
	
	public GroupHelper clickGroupModification() {
		click(By.name("edit"));
		return this;
	}

	public GroupHelper submitGroupCreation() {
		click(By.name("submit"));
		return this;
	}
	
	public GroupHelper submitGroupModification() {
		click(By.name("update"));
		return this;
	}
	
	public GroupHelper deleteGroup() {
		click(By.name("delete"));
		return this;
	}

}
