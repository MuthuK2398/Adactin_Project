package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public String getUrl() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String url = p.getProperty("url");

		return url;
	}

	public String getUserName() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String username = p.getProperty("username");

		return username;

	}

	public String getUserPassword() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String userpassword = p.getProperty("userpassword");

		return userpassword;

	}

	public String getCheckInDate() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String checkindate = p.getProperty("checkindate");

		return checkindate;
	}

	public String getCheckOutDate() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String checkoutdate = p.getProperty("checkoutdate");

		return checkoutdate;

	}

	public String getFirstName() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String firstname = p.getProperty("firstname");

		return firstname;
	}

	public String getLastName() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String lastname = p.getProperty("lastname");

		return lastname;
	}

	public String getAddress() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String address = p.getProperty("address");

		return address;

	}

	public String getCreditCardNum() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String creditcardnum = p.getProperty("creditcardnum");

		return creditcardnum;

	}

	public String getCreditcvv() throws Throwable {

		File f = new File(
				"C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\src\\main\\java\\com\\Properties\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();

		p.load(fis);

		String creditcvv = p.getProperty("creditcvv");

		return creditcvv;
	}

}
