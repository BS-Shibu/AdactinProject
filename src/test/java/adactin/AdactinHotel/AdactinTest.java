package adactin.AdactinHotel;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.PropertyFile.FileReaderManager;

public class AdactinTest extends BaseClass
{
	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	static Logger log = Logger.getLogger(AdactinTest.class);
	public static void main(String[] args) throws Throwable 
	{
		PropertyConfigurator.configure("log4j.properties");
		
		implicitTime(10, TimeUnit.SECONDS);
		
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().geturl();
		link(url);
		log.info("url launched");
		
		String username = FileReaderManager.getInstanceFRM().getInstanceCR().getusername();
		inputValueElement(pom.getLp().getUsername(), username);
		String password = FileReaderManager.getInstanceFRM().getInstanceCR().getpassword();
		inputValueElement(pom.getLp().getPassword(), password);
		clickOnElement(pom.getLp().getLogin());
		log.info("logged in successfully");
		
		select("selectbytext", "Paris", pom.getSp().getLocation());
		select("selectbyindex", "2", pom.getSp().getHotels());
		select("selectbyindex", "3", pom.getSp().getRoomtype());
		select("selectbyindex", "1", pom.getSp().getRoomnos());
		inputValueElement(pom.getSp().getDatepick_in(), dataDriven("C:\\Users\\HP\\OneDrive\\Documents\\TestCase-Adactin.xlsx", 9, 5));
		inputValueElement(pom.getSp().getDatepickout(), dataDriven("C:\\Users\\HP\\OneDrive\\Documents\\TestCase-Adactin.xlsx", 10, 5));
		select("selectbyindex", "2", pom.getSp().getAdultroom());
		select("selectbyindex", "2", pom.getSp().getChildroom());
		clickOnElement(pom.getSp().getSubmit());
		log.info("All process completed on select hotel page");
		
		clickOnElement(pom.getShp().getRadiobutton());
		clickOnElement(pom.getShp().getContinuebutton());
		log.info("Hotel selection completed");
		
		inputValueElement(pom.getBhp().getFirstname(), dataDriven("C:\\Users\\HP\\OneDrive\\Documents\\TestCase-Adactin.xlsx", 16, 5));
		inputValueElement(pom.getBhp().getLastname(), dataDriven("C:\\Users\\HP\\OneDrive\\Documents\\TestCase-Adactin.xlsx", 17, 5));
		inputValueElement(pom.getBhp().getAddress(), dataDriven("C:\\Users\\HP\\OneDrive\\Documents\\TestCase-Adactin.xlsx", 18, 5));
		inputValueElement(pom.getBhp().getCcnum(), FileReaderManager.getInstanceFRM().getInstanceCR().getccnum());
		select("selectbyindex", "2", pom.getBhp().getCctype());
		select("selectbytext", "June", pom.getBhp().getCcexpmonth());
		select("selectbytext", "2022", pom.getBhp().getCcexpyear());
		inputValueElement(pom.getBhp().getCccvv(), dataDriven("C:\\Users\\HP\\OneDrive\\Documents\\TestCase-Adactin.xlsx", 23, 5));
		clickOnElement(pom.getBhp().getBooknow());
		log.info("Booking a hotel page processses are cmpleted");
		
		clickOnElement(pom.getCp().getMyitinerary());
		log.info("Hotel booked successfully");
		
		screenshot();
		
		clickOnElement(pom.getLop().getLogout());
		log.info("logout");
		
		quit();
	}
}
