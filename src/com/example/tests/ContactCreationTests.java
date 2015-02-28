package com.example.tests;


import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase  {
	
  @Test
  public void testNonEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();  
    app.getContactHelper().initContactCreation();
    ContactData contact = new ContactData();
    contact.firstname = "first name 1";
	contact.lastname = "last name 1";
	contact.address1 = "address 1"; 
	contact.phome1 = "111-11-11"; 
	contact.pmobile = "+7 222 222 22 22 "; 
	contact.pwork = "333-33-33";
	contact.email1 = "test1@test.com";
	contact.email2 = "test2@test.com"; 
	contact.bday = "3"; 
	contact.bmonth = "October";
	contact.byear = "1990"; 
	contact.contact_group = "[none]"; 
	contact.address2 = "address 2"; 
	contact.phome2 = "444-44-44";
	app.getContactHelper().fillContactForm (contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToMainPage();
  }
  
  @Test
  public void testEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm (new ContactData("", "", "", "", "", "", "", "", "-", "-", "",
			"[none]", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToMainPage();
  }



}
