package com.example.framework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupData;

public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}
	
	private List<GroupData> cashedGroups;
	
	public List<GroupData> getGroups() {
 		if (cashedGroups == null) {
			return rebuildCashe();
 		}
		return cashedGroups;
	}

	private List<GroupData> rebuildCashe() {
		List<GroupData> cashedGroups = new ArrayList<GroupData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			GroupData group = new GroupData();
			String title = checkbox.getAttribute("title");
			group.name = title.substring("Select (".length(), title.length() - ")".length());
			cashedGroups.add(group);
		} 	return cashedGroups;
	}

	public void createGroup(GroupData group) {
		initGroupCreation();
	    fillGroupData(group);
	    submitGroupCreation();
	    returnToGroupPage();
	    rebuildCashe();
	}

	public void modifyGroup(GroupData group, int index) {
		initGroupModification(index);
		fillGroupData(group);
	    submitGroupModification();
	    returnToGroupPage();
	    rebuildCashe();
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
	    deleteGroup();
	    returnToGroupPage();
	    rebuildCashe();
	}
	
	public void initGroupCreation() {
		click(By.name("new"));
	}
	
	public void fillGroupData(GroupData group) {
		type(By.name("group_name"), group.name);
		type(By.name("group_header"), group.header);
		type(By.name("group_footer"), group.footer);
	}

	public void returnToGroupPage() {
		click(By.linkText("group page"));
	}

	public void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index+1) +  "]"));
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}
	
	public void clickGroupModification() {
		click(By.name("edit"));
	}

	public void submitGroupCreation() {
		click(By.name("submit"));
		cashedGroups = null;
	}
	
	public void submitGroupModification() {
		click(By.name("update"));
		cashedGroups = null;
	}
	
	
	public void deleteGroup() {
		click(By.name("delete"));
		cashedGroups = null;
	}

}
