package core;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;
import org.openqa.selenium.By;

class Confirmation {

	static Properties p = new Properties();
	static Writer report;

	static void validate() throws Exception {
		p.load(new FileInputStream("./input.properties"));
		report = new FileWriter("./report_" + Common.getBrowser().toString().toLowerCase() +".csv", true);
		report.write("Confirmation Page &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		// 41 :: First Name
		Common.writeReportLine("41", "First Name", By.id(p.getProperty("fname_id")), report);
		// 42 :: Last Name
		Common.writeReportLine("42", "Last Name", By.id(p.getProperty("lname_id")), report);
		// 43 :: Email
		Common.writeReportLine("43", "Email", By.id(p.getProperty("email_id")), report);
		// 44 :: Phone
		Common.writeReportLine("44", "Phone", By.id(p.getProperty("phone_id")), report);
		// 45 :: Gender
		Common.writeReportLine("45", "Gender", By.id(p.getProperty("gender_id")), report);
		// 46 :: State
		Common.writeReportLine("46", "State", By.id(p.getProperty("state_id")), report);
		// 47 :: Terms
		Common.writeReportLine("47", "Terms", By.id(p.getProperty("terms_id")), report);
		// 48 :: gender_lable_conf
				Common.writeReportLine("48", "gender_lable_conf", By.id(p.getProperty("gender_lable_conf")), report);
				// 49 :: id_gender_conf
				Common.writeReportLine("49", "id_gender_conf", By.id(p.getProperty("id_gender_conf")), report);
				// 50 :: state_lable_conf
				Common.writeReportLine("50", "state_lable_conf", By.id(p.getProperty("state_lable_conf")), report);
				// 51 :: terms_comf
				Common.writeReportLine("51", "terms_comf", By.id(p.getProperty("terms_comf")), report);
				// 52 :: terms_checked_conf
				Common.writeReportLine("52", "terms_checked_conf", By.id(p.getProperty("terms_checked_conf")), report);
				// 53 :: id_back_button_conf
				Common.writeReportLine("53", "id_back_button_conf", By.id(p.getProperty("id_back_button_conf")), report);
				// 54 :: copyright_conf
				Common.writeReportLine("54", "copyright_conf", By.id(p.getProperty("copyright_conf")), report);
				// 55 :: id_f_title_conf
				Common.writeReportLine("55", "id_f_title_conf", By.id(p.getProperty("id_f_title_conf")), report);
				// 56 :: state_lable_conf
				Common.writeReportLine("56", "state_lable_conf", By.id(p.getProperty("state_lable_conf")), report);
				// 57 :: state
				Common.writeReportLine("57", "state", By.id(p.getProperty("state")), report);
		report.flush();
		report.close();
	}
	

}
