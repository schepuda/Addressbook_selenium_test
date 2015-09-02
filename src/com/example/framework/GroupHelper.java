package com.example.framework;

import org.openqa.selenium.By;

import com.example.tests.FillGroupForm;
import com.example.tests.TestBase;

public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitGroupCreation() {
		click(By.name("submit"));
	}

	public void returnToGroupPage() {
		click(By.linkText("group page"));
	}

	public void fillGroupCreation(ApplicationManager applicationManager, TestBase testBase, FillGroupForm group) {
		type(By.name("group_name"), group.name);
		type(By.name("group_header"), group.header);
		type(By.name("group_footer"), group.footer);
	}

	public void initGroupCreation() {
		click(By.name("new"));
	}
}
