package TestNG3;

import org.testng.annotations.Test;

public class dependsgroupExample {

	
	    @Test(dependsOnGroups = {"Sanity"})
	    public void ViewAcc() {
	        System.out.println("View Your Dashboardd");
	    }
	 
	    @Test(groups = { "Sanity" }, priority=1)
	    public void OpenBrowser() {
	        System.out.println("Browser Opened Successfully");
	    }
	 
	    @Test(groups = { "Sanity" }, priority=2)
	    public void LogIn() {
	        System.out.println("Login Into The Account");
	    }
	    
	   
	    
	}

