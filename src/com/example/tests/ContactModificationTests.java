package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{	

	@Test	
    public void modifySomeContact() {
		app.getNavigationHelper().openMainPage(); 
		app.getContactHelper().initContactEdit(1);
		ContactData contact = new ContactData();
		contact.firstname = "new First Name";
		contact.lastname = "new Last Name";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactModification();
	    app.getContactHelper().returnToMainPage();
	}

}
