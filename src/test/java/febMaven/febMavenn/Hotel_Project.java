package febMaven.febMavenn;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.Helper.File_Reader_Manager;
import com.POMan.Page_Object_Manager;

public class Hotel_Project extends BaseClass {
	
	public static WebDriver driver = browserLaunch("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		hotelUrl(url);

		// SignIn
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserName();
		inputValues(pom.getInstancesip().getUserName(), username);
		String userpassword = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserPassword();
		inputValues(pom.getInstancesip().getUserPassword(), userpassword);
		click(pom.getInstancesip().getLoginButton());

		// BookingDetails
		selectVisibleText(pom.getInstancebook().getLocation(), "Brisbane");
		
		selectVisibleText(pom.getInstancebook().getHotels(), "Hotel Cornice");
		selectVisibleText(pom.getInstancebook().getRoom(), "Super Deluxe");
		selectVisibleText(pom.getInstancebook().getRoomNo(), "4 - Four");
		String checkindate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckInDate();
		inputValues(pom.getInstancebook().getCheckInDate(), checkindate);
		String checkoutdate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckOutDate();
		inputValues(pom.getInstancebook().getCheckOutDate(), checkoutdate);
		selectVisibleText(pom.getInstancebook().getAdultRoom(), "2 - Two");
		
		click(pom.getInstancebook().getSearch());

		// SelectHotelPage
		click(pom.getInstancesnp().getRadio1());
		click(pom.getInstancesnp().getNext());

		// BookNowPage
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstName();
		inputValues(pom.getInstancebnp().getFirstName(), firstname);
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		inputValues(pom.getInstancebnp().getLastName(), lastname);
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		inputValues(pom.getInstancebnp().getAddress(), address);
		String creditcardnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCardNum();
		inputValues(pom.getInstancebnp().getCreditCard(), creditcardnum);
		selectVisibleText(pom.getInstancebnp().getCreditType(), "Master Card");
		selectVisibleText(pom.getInstancebnp().getExpMonth(), "June");
		selectVisibleText(pom.getInstancebnp().getExpYear(), "2022");
		String creditcvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditcvv();
		inputValues(pom.getInstancebnp().getCreditcvv(), creditcvv);
		click(pom.getInstancebnp().getBook());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		click(pom.getInstancelp().getLogout());
	}

}
