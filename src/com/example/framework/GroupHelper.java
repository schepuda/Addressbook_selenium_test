package com.example.framework;

import org.openqa.selenium.By;

import com.example.tests.GroupData;

public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initGroupCreation() {
		click(By.name("new"));
	}
	
	public void fillGroupData(GroupData group) {
		type(By.name("group_name"), group.name);
		type(By.name("group_header"), group.header);
		type(By.name("group_footer"), group.footer);
	}

	
	public void submitGroupCreation() {
		click(By.name("submit"));
	}

	public void returnToGroupPage() {
		click(By.linkText("group page"));
	}

	public void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + index +  "]"));
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}
	
	public void clickGroupModification() {
		click(By.name("edit"));
	}

	public void submitGroupModification() {
		click(By.name("update"));		
	}
	
	
	public void deleteGroup() {
		click(By.name("delete"));
	}
	
	public void goToGroupPageMod() {
		submitGroupModification();
	    returnToGroupPage();
	}
	
	public void goToGroupPageCreat() {
		submitGroupCreation();
	    returnToGroupPage();
	}
}
