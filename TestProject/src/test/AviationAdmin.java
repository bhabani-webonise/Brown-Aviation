package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AviationAdmin {
	
	WebDriver driver ; 
	
	@BeforeMethod 
	public void openBrowser()
	{
		
   driver= new FirefoxDriver();
	}
	
	//Tested and Proper

/*@Test


public void addcraft() throws InterruptedException{
	
//Login to Brown Admin Dashboard
	
	driver.manage().window().maximize();
	driver.get("http://brown:brown6186@testbal.weboapps.com/");
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("user_email")).sendKeys("admin@brown.com");
	driver.findElement(By.id("user_password")).sendKeys("admin2014");
	driver.findElement(By.xpath("//*[@id='new_user']/div[4]/input")).click();
	
	//Add Aircraft 
	
	driver.get("http://testbal.weboapps.com/aircrafts/new");
	driver.findElement(By.id("aircraft_name")).sendKeys("Flight205");
	
	Select engineInfo;
	engineInfo = new Select(driver.findElement(By.id("aircraft_engine_info_id")));
	engineInfo.selectByVisibleText("Re_Engine1");
	
	Select aircraft;
	aircraft = new Select(driver.findElement(By.id("aircraft_aircraft_type_id")));
	aircraft.selectByVisibleText("Re_Airframe1");
	
	
	
	driver.findElement(By.id("aircraft_aircraft_serial_number")).sendKeys("32423424");
	driver.findElement(By.id("aircraft_engine_serial_number")).sendKeys("21313131");
	driver.findElement(By.id("aircraft_engine_type_twin")).click();
	driver.findElement(By.id("aircraft_tail_number")).sendKeys("312313");
	driver.findElement(By.id("aircraft_year")).sendKeys("2013");
	driver.findElement(By.id("aircraft_airframe_hours")).sendKeys("250");
	driver.findElement(By.id("aircraft_engine_hours")).sendKeys("350");
	
	//Create Aircraft Button
	
	driver.findElement(By.xpath("//*[@id='new_aircraft']/div[12]/input")).click();	
}*/
/*@Test

public void flightLog() throws InterruptedException{
	
	//Login to Brown Admin Dashboard
	
		driver.manage().window().maximize();
		driver.get("http://brown:brown6186@testbal.weboapps.com/");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("user_email")).sendKeys("admin@brown.com");
		driver.findElement(By.id("user_password")).sendKeys("admin2014");
		driver.findElement(By.xpath("//*[@id='new_user']/div[4]/input")).click();
		
//Add Flight Log
		
		driver.get("http://testbal.weboapps.com/flight_logs/new?aircraft_id=24");
		
	 //Date of Flight
		
		driver.findElement(By.id("flight_log_date_of_flight")).click(); //click field
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a")).click(); //click next month
		
	 //Takeoff time
		
		driver.findElement(By.id("flight_log_takeoff_time")).sendKeys("10:40");
	
	 //Landing time
		
		driver.findElement(By.id("flight_log_landing_time")).sendKeys("20:40");
		
	 //From JQuery auto-complete
		driver.findElement(By.id("token-input-flight_log_from")).click();
		driver.findElement(By.id("token-input-flight_log_from")).sendKeys("NYC");
		Thread.sleep(10000);
		driver.findElement(By.id("token-input-flight_log_from")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("token-input-flight_log_from")).sendKeys(Keys.ARROW_DOWN);  
		driver.findElement(By.id("token-input-flight_log_from")).sendKeys(Keys.RETURN);  
		
	 //To JQuery auto-complete
		
		driver.findElement(By.id("token-input-flight_log_to")).click();
		driver.findElement(By.id("token-input-flight_log_to")).sendKeys("CAL");
		Thread.sleep(10000);
		driver.findElement(By.id("token-input-flight_log_to")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("token-input-flight_log_to")).sendKeys(Keys.ARROW_DOWN);  
		driver.findElement(By.id("token-input-flight_log_to")).sendKeys(Keys.RETURN);  
		
		
	//Hours Flown
		
		driver.findElement(By.id("flight_log_hour_flown")).sendKeys("12");
		
	//Fuel Burnt(in Gallons)
		
	driver.findElement(By.id("flight_log_fuel_burn_in_gallon")).sendKeys("350");
		
	//Number of Landings
	
	driver.findElement(By.id("flight_log_number_of_landing")).sendKeys("30");
		
	//Fuel Cost
	
	driver.findElement(By.id("flight_log_fuel_cost")).sendKeys("400");
	
	//Pilot Name
	
	driver.findElement(By.id("flight_log_pilot_name")).sendKeys("Bhabani Shankar");
		
	//Create a Flight Log button
	
	driver.findElement(By.xpath("//*[@id='new_flight_log']/div[14]/input")).click();
}
*/

@Test

//Fleet Management Test Cases

public void fleet() throws InterruptedException{
	
	//Login to Brown Admin Dashboard
	
	driver.manage().window().maximize();
	driver.get("http://brown:brown6186@testbal.weboapps.com/");
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("user_email")).sendKeys("admin@brown.com");
	driver.findElement(By.id("user_password")).sendKeys("admin2014");
	driver.findElement(By.xpath("//*[@id='new_user']/div[4]/input")).click();
	
	//Add Airframe
	driver.get("http://testbal.weboapps.com/fleets");
	driver.findElement(By.linkText("Add Airframe")).click();
	//driver.findElement(By.id("aircraft_type_name")).sendKeys("Airframe_Test");
	driver.findElement(By.id("aircraft_type_make")).sendKeys("Make_Test");
	driver.findElement(By.id("aircraft_type_model_name")).sendKeys("Model_Test");
	
	//Add Attachment to Airframe Document
	/*driver.findElement(By.linkText("Add Attachment")).click();
	driver.findElement(By.id("aircraft_type_documents_attributes_1_attachment")).sendKeys("C:\\Users\\Bhavani-pc\\Desktop\\SmarterPlace_version1.0_Testing_SignOff");*/
	driver.findElement(By.className("btn")).click();
}

@Test

public void addEngineInfo() throws InterruptedException{
	//Login to Brown Admin Dashboard
	
		driver.manage().window().maximize();
		driver.get("http://brown:brown6186@testbal.weboapps.com/");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("user_email")).sendKeys("admin@brown.com");
		driver.findElement(By.id("user_password")).sendKeys("admin2014");
		driver.findElement(By.xpath("//*[@id='new_user']/div[4]/input")).click();
		
		//Add Engine Info
		driver.findElement(By.id("engine_info_overall_time_in_hours")).sendKeys("Engine_Test1");
		driver.findElement(By.id("engine_info_sub_model")).sendKeys("SubModel_Engine");
		driver.findElement(By.id("engine_info_manufacturer")).sendKeys("Manufacturer1");
		driver.findElement(By.id("engine_info_replacement_time_in_hours")).sendKeys("150");
		driver.findElement(By.id("engine_info_overall_time_in_hours")).sendKeys("250");
		
		//Click on Create Engine Info
		driver.findElement(By.className("btn")).click();
		
	
}


	/*@AfterMethod
	
	public void  closeBrowser(){
		
		driver.quit();
	}*/
}
