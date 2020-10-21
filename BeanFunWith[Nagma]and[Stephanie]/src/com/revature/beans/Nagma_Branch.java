package com.revature.beans;

public class Nagma_Branch {

	static String branchName="Nagma Branch";
	
	public String getBranchName() {
		return branchName;
	}
	
	public static void setBranchName(String branchName) {
		Nagma_Branch.branchName = branchName;
	}
	
	@Override
	public String toString() {
		return "Branch = " + branchName;
		};


}
