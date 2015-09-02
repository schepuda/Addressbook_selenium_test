package com.example.framework;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase{

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public void openMainPage() {
		manager.driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void gotoGroupPage() {
		manager.driver.findElement(By.linkText("groups")).click();
	}

}
