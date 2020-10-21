package com.revature.beans;

public class Main_Branch {
		
	static String branchName="Main Branch";
	
	public String getBranchName() {
		return branchName;
	}
	
	public static void setBranchName(String branchName) {
		Main_Branch.branchName = branchName;
	}
	
	@Override
	public String toString() {
		return "Branch = " + branchName;
		}

}

