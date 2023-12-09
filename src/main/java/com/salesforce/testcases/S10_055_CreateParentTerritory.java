package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;



public class S10_055_CreateParentTerritory extends ProjectSpecificMethods{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "ParentTerritoryCreation";
		testDescription = "Verify Creation of Parent Territory functionality";
		authors = "ManojBabuM";
		category = "Smoke";
		excelFileName = "";
	}

	@Test
	
	public void CreateParentTerritory_TS() throws InterruptedException {
		
			new LoginPage()
			.enterUsername("manojgvm45@testleaf.com")
			.enterPassword("Vyomisuga@45")
			.clickLoginBtn()
			.clickAppLauncher()
			.clickViewAll()
			.searchApp("Service Territories")
			.selectServiceTerritoriesApp()
			.editParentTerritory()
			.clickNewServiceTerritory()
			.enterServiceTerritoryName("Test_Service_Territory_2")
			.selectParentTerritory()
			.selectOperatingService()
			.newOperatingHours()
			.operatingHourName("Mukesh Ambani")
			.operatingHourDesc("Mukesh Ambani Desc")
			.operatingHRTimeZone("(GMT+05:30) India Standard Time (Asia/Kolkata)");
	
			
}
}
