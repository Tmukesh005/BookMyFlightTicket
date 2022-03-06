package org.repository;

import org.commonmethods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoryPage extends CommonMethods {
	public RepositoryPage() {
		PageFactory.initElements(CommonMethods.driver, this);
	}

	@FindBy(xpath = "(//a[@class='bui-tab__link'])[1]")
	private WebElement flight;

	@FindBy(className = "css-1dgzenf-radio-input")
	private WebElement oneway;

	@FindBy(className = "css-1k0jlfl")
	private WebElement select;

	@FindBy(xpath = "(//div[@tabindex='0'])[1]")
	private WebElement adult;

	@FindBy(className = "css-153jucu")
	private WebElement add;

	@FindBy(className = "css-ya5gr9")
	private WebElement done;

	@FindBy(xpath = "//div[@class='css-p6nr6s']")
	private WebElement airport;

	@FindBy(className = "css-bwf0ll")
	private WebElement tick;

	@FindBy(xpath = "//input[@class='css-1tl2oa1']")
	private WebElement from;

	@FindBy(className = "css-fq7c82")
	private WebElement from1;

	@FindBy(xpath = "//input[@data-testid='searchbox_destination_input']")
	private WebElement to;

	@FindBy(className = "css-fq7c82")
	private WebElement to1;

	@FindBy(xpath = "//input[@placeholder='Depart']")
	private WebElement dateoption;

	@FindBy(xpath = "//span[@data-date-cell='2022-03-18']")
	private WebElement date;

	@FindBy(className = "InputCheckbox-module__field___1mRcZ")
	private WebElement direct_flight;

	@FindBy(xpath = "//button[@class='css-ya5gr9 wide']")
	private WebElement search;

	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement see_flight;

	@FindBy(xpath = "//div[@data-testid='flight_details_inner_modal_select_button']")
	private WebElement select1;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement select2;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement contact_email;

	@FindBy(id = "phone")
	private WebElement phone;
	
	@FindBy(xpath ="//input[@name='passengers.0.firstName']")
	private WebElement first_name;
	
	@FindBy(xpath = "//input[@name='passengers.0.lastName']")
	private WebElement last_name;
	
	@FindBy(xpath ="//select[@name='passengers.0.gender']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@name='passengers.1.firstName']")
	private WebElement first_name1;
	
	@FindBy(xpath = "//input[@name='passengers.1.lastName']")
	private WebElement last_name2;
	
	@FindBy(xpath = "//select[@name='passengers.1.gender']")
	private WebElement gender1;
	
    @FindBy(xpath ="(//button[@type='button'])[3]")
    private WebElement next;
    	
    @FindBy(xpath ="(//button[@type='button'])[3]")
     private WebElement next1;
  
    @FindBy(id ="__bui-1")
    private WebElement cardholder_name;
   
    @FindBy(xpath ="//input[@id='__bui-2']")
    private WebElement cardholder_number;
    
    public WebElement getCardholder_number() {
	return cardholder_number;
	}

	
	public WebElement getCardholder_name() {
		return cardholder_name;
	}
	
	public WebElement getNext1() {
		return next1;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getFirst_name1() {
		return first_name1;
	}

	public WebElement getLast_name2() {
		return last_name2;
	}

	public WebElement getGender1() {
		return gender1;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getContact_email() {
		return contact_email;
	}

	public WebElement getSelect2() {
		return select2;
	}

	public WebElement getSelect1() {
		return select1;
	}

	public WebElement getSee_flight() {
		return see_flight;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getDirect_flight() {
		return direct_flight;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDateoption() {
		return dateoption;
	}

	public WebElement getTo1() {
		return to1;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getFrom1() {
		return from1;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTick() {
		return tick;
	}

	public WebElement getAirport() {
		return airport;
	}

	public WebElement getFlight() {
		return flight;
	}

	public WebElement getOneway() {
		return oneway;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getDone() {
		return done;
	}

}