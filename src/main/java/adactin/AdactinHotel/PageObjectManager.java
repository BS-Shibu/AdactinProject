package adactin.AdactinHotel;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public WebDriver driver;
	
	private LoginPage lp;
	private SearchHotelPage sp;
	private SelectHotelPage shp;
	private BookAHotelPage bhp;
	private ConfirmationPage cp;
	private LogoutPage lop;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	public LoginPage getLp() {
		if (lp==null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}
	public SearchHotelPage getSp() {
		if(sp==null) {
			sp = new SearchHotelPage(driver);
		}
		return sp;
	}
	public SelectHotelPage getShp() {
		if(shp==null) {
			shp = new SelectHotelPage(driver);
		}
		return shp;
	}
	public BookAHotelPage getBhp() {
		if(bhp==null) {
			bhp = new BookAHotelPage(driver);
		}
		return bhp;
	}
	public ConfirmationPage getCp() {
		if(cp==null) {
			cp = new ConfirmationPage(driver);
		}
		return cp;
	}
	public LogoutPage getLop() {
		if (lop==null) {
			lop = new LogoutPage(driver);
		}
		return lop;
	}
	
	
}
