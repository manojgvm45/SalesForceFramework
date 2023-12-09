package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class S10_112_CreateWorkTypeGroup extends ProjectSpecificMethods{

	@BeforeTest
	public void beforeTest() {	
		testcaseName = "EditDashboard";
		testDescription = "Verify Editdashboard functionality";
		authors = "ManojBabuM";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void createWorkTypeGroup() throws InterruptedException {
		new LoginPage()
		.enterUsername("manojgvm45@testleaf.com")
		.enterPassword("Vyomisuga@45")
		.clickLoginBtn()
		.clickAppLauncher()
		.clickViewAll()
		.searchApp("Work Type Groups")
		.selectWorktypeGroupsApp()
		.workTypeGroupddown()
		.newWorkTypeGroup()
		.workTypeName("Salesforce Automation by Manoj")
		.workTypeDesc("Salesforce Automation description");
	}
	
}
