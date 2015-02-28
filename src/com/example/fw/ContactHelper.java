package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
	    click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {	
		type(By.name("firstname"), contact.firstname);
	    type(By.name("lastname"), contact.lastname);
	    type(By.name("address"), contact.address1);
	    type(By.name("home"), contact.phome1);
	    type(By.name("mobile"), contact.pmobile);
	    type(By.name("work"), contact.pwork);
	    type(By.name("email"), contact.email1);
	    type(By.name("email2"), contact.email2);
	    selectByText(By.name("bday"), contact.bday);
	    selectByText(By.name("bmonth"), contact.bmonth);
	    type(By.name("byear"), contact.byear);
	    //selectByText(By.name("new_group"), contact.contact_group);
	    type(By.name("address2"), contact.address2);
	    type(By.name("phone2"), contact.phome2);
	}


	public void submitContactCreation() {
	    click(By.name("submit"));
	}

	public void returnToMainPage() {
	    click(By.linkText("home page"));
	}

	public void initContactEdit(int index) {
		click (By.xpath("(//img[@src='icons/pencil.png'])["+index+"]"));
	}

	public void deleteContact(int index) {
		initContactEdit(index);
		click (By.xpath("(//input[@name='update'])[2]"));
		
	}

	public void submitContactModification() {
		click (By.name("update"));
	}

}
