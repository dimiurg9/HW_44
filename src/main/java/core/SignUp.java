package core;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;
import org.openqa.selenium.By;

class SignUp {

	static Properties p = new Properties();
	static Writer report;

	static void open(String browser) throws Exception {
		p.load(new FileInputStream("./input.properties"));
		Common.open(browser, p.getProperty("url"));
	}

	static void validate() throws Exception {
		p.load(new FileInputStream("./input.properties"));
		report = new FileWriter("./report_" + Common.getBrowser().toString().toLowerCase() +".csv", false);
		Common.writeReportHeader(report);
		// 01 :: First Name
		Common.setValue(By.id(p.getProperty("fname_id")), p.getProperty("fname_value"));
		Common.writeReportLine("01", "First Name", By.id(p.getProperty("fname_id")), report);
		// 02 :: Last Name
		Common.setValue(By.id(p.getProperty("lname_id")), p.getProperty("lname_value"));
		Common.writeReportLine("02", "Last Name", By.id(p.getProperty("lname_id")), report);
		// 03 :: Email
		Common.setValue(By.id(p.getProperty("email_id")), p.getProperty("email_value"));
		Common.writeReportLine("03", "Email", By.id(p.getProperty("email_id")), report);
		// 04 :: Phone
		Common.setValue(By.id(p.getProperty("phone_id")), p.getProperty("phone_value"));
		Common.writeReportLine("04", "Phone", By.id(p.getProperty("phone_id")), report);
		// 05 :: Gender
		Common.checkRadioButton(By.id(p.getProperty("gender_male_id")));
		Common.writeReportLine("05", "Gender", By.id(p.getProperty("gender_male_id")), report);
		// 06 :: State
		Common.selectDropDown(By.id(p.getProperty("state_id")), p.getProperty("state_value"));
		Common.writeReportLine("06", "State", By.id(p.getProperty("state_id")), report);
		// 07 :: Terms
//		Common.checkCheckBox(By.id(p.getProperty("terms_id")));
		Common.writeReportLine("07", "Terms", By.id(p.getProperty("terms_id")), report);
		// 08 :: gender_male_id
//				Common.checkCheckBox(By.id(p.getProperty("gender_male_id")));
				Common.writeReportLine("8", "gender_male_id", By.id(p.getProperty("gender_male_id")), report);
				// 9 :: gender_female_id
//				Common.checkCheckBox(By.id(p.getProperty("gender_female_id")));
				Common.writeReportLine("9", "gender_female_id", By.id(p.getProperty("gender_female_id")), report);
				// 10 :: gender_id
//				Common.checkCheckBox(By.id(p.getProperty("gender_id")));
//				Common.writeReportLine("10", "gender_id", By.id(p.getProperty("gender_id")), report);
				// 11 :: quotes_id
//				Common.checkCheckBox(By.id(p.getProperty("quotes_id")));
				Common.writeReportLine("11", "quotes_id", By.id(p.getProperty("quotes_id")), report);
				// 12 :: sighn_in_id
//				Common.checkCheckBox(By.id(p.getProperty("sighn_in_id")));
				Common.writeReportLine("12", "sighn_in_id", By.id(p.getProperty("sighn_in_id")), report);
				// 13 :: id_current_location
//				Common.checkCheckBox(By.id(p.getProperty("id_current_location")));
				Common.writeReportLine("13", "id_current_location", By.id(p.getProperty("id_current_location")), report);
				// 14 :: id_weather_icon
//				Common.checkCheckBox(By.id(p.getProperty("id_weather_icon")));
				Common.writeReportLine("14", "id_weather_icon", By.id(p.getProperty("id_weather_icon")), report);
				// 15 :: id_temperature
//				Common.checkCheckBox(By.id(p.getProperty("id_temperature")));
				Common.writeReportLine("15", "id_temperature", By.id(p.getProperty("id_temperature")), report);
				// 16 :: first_name
//				Common.checkCheckBox(By.id(p.getProperty("first_name")));
				Common.writeReportLine("16", "first_name", By.id(p.getProperty("first_name")), report);
				// 17 :: error_name
//				Common.checkCheckBox(By.id(p.getProperty("error_name")));
				Common.writeReportLine("17", "error_name", By.id(p.getProperty("error_name")), report);
				// 18 :: last_name
//				Common.checkCheckBox(By.id(p.getProperty("last_name")));
				Common.writeReportLine("18", "last_name", By.id(p.getProperty("last_name")), report);
				// 19 :: lname_error
//				Common.checkCheckBox(By.id(p.getProperty("lname_error")));
				Common.writeReportLine("19", "lname_error", By.id(p.getProperty("lname_error")), report);
				// 20 :: email_address
//				Common.checkCheckBox(By.id(p.getProperty("email_address")));
				Common.writeReportLine("20", "email_address", By.id(p.getProperty("email_address")), report);
				// 21 :: email_err
//				Common.checkCheckBox(By.id(p.getProperty("email_err")));
				Common.writeReportLine("21", "email_err", By.id(p.getProperty("email_err")), report);
				// 22 :: phone_number
//				Common.checkCheckBox(By.id(p.getProperty("phone_number")));
				Common.writeReportLine("22", "phone_number", By.id(p.getProperty("phone_number")), report);
				// 23 :: phone_error
//				Common.checkCheckBox(By.id(p.getProperty("phone_error")));
				Common.writeReportLine("23", "phone_error", By.id(p.getProperty("phone_error")), report);
				// 24 :: gender_switch
//				Common.checkCheckBox(By.id(p.getProperty("gender_switch")));
				Common.writeReportLine("24", "gender_switch", By.id(p.getProperty("gender_switch")), report);
				// 25 :: gender_male_selected
//				Common.checkCheckBox(By.id(p.getProperty("gender_male_selected")));
				Common.writeReportLine("25", "gender_male_selected", By.id(p.getProperty("gender_male_selected")), report);
				// 26 :: gender_female_selected
//				Common.checkCheckBox(By.id(p.getProperty("gender_female_selected")));
				Common.writeReportLine("26", "gender_female_selected", By.id(p.getProperty("gender_female_selected")), report);
				// 27 :: state_span
//				Common.checkCheckBox(By.id(p.getProperty("state_span")));
				Common.writeReportLine("27", "state_span", By.id(p.getProperty("state_span")), report);
				// 28 :: tems_checkbox
//				Common.checkCheckBox(By.id(p.getProperty("tems_checkbox")));
				Common.writeReportLine("28", "tems_checkbox", By.id(p.getProperty("tems_checkbox")), report);
				// 29 :: error_line
//				Common.checkCheckBox(By.id(p.getProperty("error_line")));
				Common.writeReportLine("29", "error_line", By.id(p.getProperty("error_line")), report);
				// 30 :: id_link_facebook
//				Common.checkCheckBox(By.id(p.getProperty("id_link_facebook")));
				Common.writeReportLine("30", "id_link_facebook", By.id(p.getProperty("id_link_facebook")), report);
				// 31 :: id_link_twitter
//				Common.checkCheckBox(By.id(p.getProperty("id_link_twitter")));
				Common.writeReportLine("31", "id_link_twitter", By.id(p.getProperty("id_link_twitter")), report);
				// 32 :: id_link_flickr
//				Common.checkCheckBox(By.id(p.getProperty("id_link_flickr")));
				Common.writeReportLine("32", "id_link_flickr", By.id(p.getProperty("id_link_flickr")), report);
				// 33 :: id_link_youtube
//				Common.checkCheckBox(By.id(p.getProperty("id_link_youtube")));
				Common.writeReportLine("33", "id_link_youtube", By.id(p.getProperty("id_link_youtube")), report);
				// 34 :: reset_button
//				Common.checkCheckBox(By.id(p.getProperty("reset_button")));
				Common.writeReportLine("34", "reset_button", By.id(p.getProperty("reset_button")), report);
				// 35 :: timestamp
//				Common.checkCheckBox(By.id(p.getProperty("timestamp")));
				Common.writeReportLine("35", "timestamp", By.id(p.getProperty("timestamp")), report);
				// 36 :: youtube_img
//				Common.checkCheckBox(By.id(p.getProperty("youtube_img")));
				Common.writeReportLine("36", "youtube_img", By.id(p.getProperty("youtube_img")), report);
				// 37 :: os_browser
//				Common.checkCheckBox(By.id(p.getProperty("os_browser")));
				Common.writeReportLine("37", "os_browser", By.id(p.getProperty("os_browser")), report);
				// 38 :: facebook_img
//				Common.checkCheckBox(By.id(p.getProperty("facebook_img")));
				Common.writeReportLine("38", "facebook_img", By.id(p.getProperty("facebook_img")), report);
				// 39 :: twitter_img
//				Common.checkCheckBox(By.id(p.getProperty("twitter_img")));
				Common.writeReportLine("39", "twitter_img", By.id(p.getProperty("twitter_img")), report);
				// 40 :: flick_img
//				Common.checkCheckBox(By.id(p.getProperty("flick_img")));
				Common.writeReportLine("40", "flick_img", By.id(p.getProperty("flick_img")), report);
				
		// SUBMIT
	
		
//		Common.driver.findElement(By.id(p.getProperty("submit_id"))).click();
//		System.out.print("clicked on submit");
//		Thread.sleep(10000);
		Common.submit(By.id(p.getProperty("submit_id")));
		Common.waitTitlePage("Confirmation");

		report.flush();
		report.close();
	}
}