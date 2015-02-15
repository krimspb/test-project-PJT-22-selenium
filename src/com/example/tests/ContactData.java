package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address1;
	public String phome1;
	public String pmobile;
	public String pwork;
	public String email1;
	public String email2;
	public String bday;
	public String bmonth;
	public String byear;
	public String contact_group;
	public String address2;
	public String phome2;

	public ContactData(
			String firstname, 
			String lastname,
			String address1, 
			String phome1, 
			String pmobile, 
			String pwork,
			String email1, 
			String email2, 
			String bday, 
			String bmonth,
			String byear, 
			String contact_group, 
			String address2, 
			String phome2) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.address1 = address1;
		this.phome1 = phome1;
		this.pmobile = pmobile;
		this.pwork = pwork;
		this.email1 = email1;
		this.email2 = email2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.contact_group = contact_group;
		this.address2 = address2;
		this.phome2 = phome2;
	}
	
	public ContactData() {

	}
}