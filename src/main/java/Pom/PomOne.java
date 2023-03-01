package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PomOne extends BaseCode {
	public PomOne() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPassWord() {
		return passWord;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginPageData() {
		sendKeysTxt(getUserName(),"jocinthn");
		sendKeysTxt(getPassWord(),"123456");
		click(getLoginButton());
	}
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement Roomtype;
	
	@FindBy(id="room_nos")
	private WebElement RoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	
	@FindBy(id="adult_room")
	private WebElement Noofadult;
	
	@FindBy(id="child_room")
	private WebElement Noofchild;
	
	@FindBy(id="Submit")
	private WebElement Submitbtn;
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getNoofadult() {
		return Noofadult;
	}

	public WebElement getNoofchild() {
		return Noofchild;
	}

	public WebElement getSubmitbtn() {
		return Submitbtn;
	}

	public void booking() {
		sendKeysTxt(getLocation(),"Sydney");
		sendKeysTxt(getHotels(), "Hotel Creek");
		sendKeysTxt(getRoomtype(),"Standard");
		sendKeysTxt(getRoomNos(),"1");
		sendKeysTxt(getNoofadult(),"2");
		sendKeysTxt(getNoofchild(), "1");
		click(getSubmitbtn());
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	
	public WebElement getcontinue() {
		return Continue;
	}
	
	public void confirmpage() {
		click(getRadiobtn());
		click(getcontinue());
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement cardnumber;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(id="book_now")
	private WebElement booknowbtn;
	
	public WebElement getfirstname() {
		return firstname;
	}
	
	public WebElement getlastname() {
		return lastname;
	}
	
	public WebElement getaddress() {
		return Address;
	}
	
	public WebElement getccnumber() {
		return cardnumber;
	}
	
	public WebElement getcardtype() {
		return cardtype;
	}
	
	public WebElement getexpmonth() {
		return expmonth;
	}
	
	public WebElement getexpyear() {
		return expyear;
	}
	
	public WebElement getcvvnumber() {
		return cvvnumber;
	}
	
	public WebElement getbooknowbtn() {
		return booknowbtn;
	}
	
	public void finalpage() {
		sendKeysTxt(getfirstname(),"Gugan");
		sendKeysTxt(getlastname(), "S");
		sendKeysTxt(getaddress(),"India");
		sendKeysTxt(getccnumber(),"1234567891012345");
		sendKeysTxt(getcardtype(),"VISA");
		sendKeysTxt(getexpmonth(),"May");
		sendKeysTxt(getexpyear(),"2022");
		sendKeysTxt(getcvvnumber(),"244");
		click(getbooknowbtn());
	}
	
	@FindBy(id="order_no")
	private WebElement ordernumber;
	
	public WebElement getordernumber() {
		return ordernumber;
	}
	
	public void orderid() {
		String var = getAttributeValue(ordernumber,"value");
		System.out.println("Your hotel order id is "+var+" enjoy your Holidays");
	}
	
	
}
