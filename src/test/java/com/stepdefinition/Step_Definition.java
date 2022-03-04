package com.stepdefinition;
import org.openqa.selenium.WebDriver;

import com.Helper.File_Reader_Manager;
import com.POMan.Page_Object_Manager;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import febMaven.febMavenn.BaseClass;

public class Step_Definition extends BaseClass {
	
	public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);


	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		hotelUrl(url);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
		inputValues(pom.getInstancesip().getUserName(), username);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		inputValues(pom.getInstancesip().getUserPassword(), password);
	    
	}
	
	@Then("^user Click the Login button and It Navigates To Search Hotel Screen$")
	public void user_Click_the_Login_button_and_It_Navigates_To_Search_Hotel_Screen() throws Throwable {
		click(pom.getInstancesip().getLoginButton());
	}
	@When("^user Select The \"([^\"]*)\" From The Location Dropdown$")
	public void user_Select_The_Location_From_The_Location_Dropdown(String location) throws Throwable {
		selectVisibleText(pom.getInstancebook().getLocation(), location);

	}
	@When("^user Select The \"([^\"]*)\" From The Hotels Dropdown$")
	public void user_Select_The_Hotel_From_The_Hotels_Dropdown(String hotel) throws Throwable {
		selectVisibleText(pom.getInstancebook().getHotels(), hotel);

	}
	@When("^user Select The \"([^\"]*)\" From The Room Type Dropdown$")
	public void user_Select_The_Room_Type_From_The_Room_Type_Dropdown(String roomtype) throws Throwable {
		selectVisibleText(pom.getInstancebook().getRoom(), roomtype);

	}
	@When("^user Select The \"([^\"]*)\" From Number Of Rooms Dropdown$")
	public void user_Select_The_Number_Of_Rooms_From_Number_Of_Rooms_Dropdown(String roomnum) throws Throwable {
		selectVisibleText(pom.getInstancebook().getRoomNo(), roomnum);

	}
	@When("^user Enter The \"([^\"]*)\" In The Check In Date Field$")
	public void user_Enter_The_Check_In_Date(String checkindate) throws Throwable {
		inputValues(pom.getInstancebook().getCheckInDate(), checkindate);

	}
	@When("^user Enter The \"([^\"]*)\" In The Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date(String checkoutdate) throws Throwable {
		inputValues(pom.getInstancebook().getCheckOutDate(), checkoutdate);

	}
	@When("^user Select \"([^\"]*)\" From Adult Per Room Dropdown$")
	public void user_Select_Adults_Per_Room_From_Adult_Per_Room_Dropdown(String adultroom) throws Throwable {
		selectVisibleText(pom.getInstancebook().getAdultRoom(), adultroom);
	}
	@Then("^user Click The Search button and It Navigates To Search Hotel Screen$")
	public void user_Click_The_Search_button_and_It_Navigates_To_Search_Hotel_Screen() throws Throwable {
		click(pom.getInstancebook().getSearch());
	}
	@When("^user Click On The Select Radio button$")
	public void user_Click_On_The_Select_Radio_button() throws Throwable {
		click(pom.getInstancesnp().getRadio1());

	}
	@Then("^user Click On The Continue button and It Navigate To Book A Hotel Screen$")
	public void user_Click_On_The_Continue_button_and_It_Navigate_To_Book_A_Hotel_Screen() throws Throwable {
		click(pom.getInstancesnp().getNext());
		
	}
	@When("^user Enter The \"([^\"]*)\" In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field(String firstname) throws Throwable {
		inputValues(pom.getInstancebnp().getFirstName(), firstname);

	}
	@When("^user Enter The \"([^\"]*)\" In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field(String lastname) throws Throwable {
		inputValues(pom.getInstancebnp().getLastName(), lastname);

	}
	@When("^user Enter The \"([^\"]*)\" In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field(String address) throws Throwable {
		inputValues(pom.getInstancebnp().getAddress(), address);
	}
	@When("^user Enter \"([^\"]*)\" In The Credit Card Number Field$")
	public void user_Enter_Credit_Card_Number_In_The_Credit_Card_Number_Field(String creditcardnum) throws Throwable {
		inputValues(pom.getInstancebnp().getCreditCard(), creditcardnum);

	}
	@When("^user Enter \"([^\"]*)\" In The Credit Card Type Field$")
	public void user_Enter_Credit_Card_Type_In_The_Credit_Card_Type_Field(String creditcardtype) throws Throwable {
		selectVisibleText(pom.getInstancebnp().getCreditType(), creditcardtype);
	}
	@When("^user Select \"([^\"]*)\" In The Expiry Date Dropdown$")
	public void user_Select_Month_In_The_Expiry_Date_Dropdown(String month) throws Throwable {
		selectVisibleText(pom.getInstancebnp().getExpMonth(), month);
	}
	@When("^user Select The \"([^\"]*)\" In The Expiry Date Dropdown$")
	public void user_Select_The_Year_In_The_Expiry_Date_Dropdown(String year) throws Throwable {
		selectVisibleText(pom.getInstancebnp().getExpYear(), year);
	}
	@When("^user Enter \"([^\"]*)\" In The CVV Number Field$")
	public void user_Enter_CVV_Number_In_The_CVV_Number_Field(String creditcvv) throws Throwable {
		inputValues(pom.getInstancebnp().getCreditcvv(), creditcvv);
	}
	@Then("^user Click On The Book Now button and It Navigate To The Booking Confirmation Screen$")
	public void user_Click_On_The_Book_Now_button_and_It_Navigate_To_The_Booking_Confirmation_Screen()
			throws Throwable {
		click(pom.getInstancebnp().getBook());
	}
}
