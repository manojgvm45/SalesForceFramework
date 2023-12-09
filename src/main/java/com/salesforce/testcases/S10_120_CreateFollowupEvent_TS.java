package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class S10_120_CreateFollowupEvent_TS extends ProjectSpecificMethods {

	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Create Follow-up Event";
		testDescription = "Verify Followup event creation functionality through Content app";
		authors = "ManojBabuM";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void createFollowupEvent() throws InterruptedException {
		new LoginPage()
		.enterUsername("manojgvm45@testleaf.com")
		.enterPassword("Vyomisuga@45")
		.clickLoginBtn()
		.clickAppLauncher()
		.clickViewAll()
		.searchApp("Content")
		.selectContentTab()
		.viewAllTasks()
		.RecentlyViewedTop1()
		.CreateFollowupTask()
		.CreateFollowupEvent();
		
	}
}
