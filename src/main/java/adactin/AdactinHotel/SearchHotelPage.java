package adactin.AdactinHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage 
{
	public WebDriver driver;
	
	@FindBy(id="location") private WebElement location;
	@FindBy(id="hotels") private WebElement hotels;
	@FindBy(id="room_type") private WebElement roomtype;
	@FindBy(id="room_nos") private WebElement roomnos;
	@FindBy(id="datepick_in") private WebElement datepick_in;
	@FindBy(id="datepick_out") private WebElement datepickout;
	@FindBy(id="adult_room") private WebElement adultroom;
	@FindBy(id="child_room") private WebElement childroom;
	@FindBy(id="Submit") private WebElement submit;
	
	public SearchHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	public WebElement getDatepickout() {
		return datepickout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
}
