package com.example.tests;

public class FillGroupForm{
	public String groupname;
	public String groupheader;
	public String groupfooter;
	private Object addressfirstname;

	public FillGroupForm() {
	}
	
	public FillGroupForm(String groupname, String groupheader, String groupfooter) {
		this.groupname = groupname;
		this.groupheader = groupheader;
		this.groupfooter = groupfooter;
	}
	
}