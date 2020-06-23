package core;

import java.time.LocalDateTime;

public class Main {
	static String browser;
	static String username;
	static String exp_2021_08_14 = "2021-06-10T22:00:26.098"; // System.out.println(LocalDateTime.now());
//	static String user = "dima";
	public static void main(String[] args) throws Exception {
		
		if (LocalDateTime.now().isAfter(LocalDateTime.parse(exp_2021_08_14))) {
			String msg = String.format("Today at [%s] this version has expired.", LocalDateTime.now());
			throw new RuntimeException(msg);}
		
//		// username = "alex";
//		username = System.getProperty("username"); // -Dusername="alex"
//		if (!username.equalsIgnoreCase(user)) {
//			String msg = String.format("Username [%s] is not authorized run this program.", username);
//			throw new RuntimeException(msg);}
		
//		 browser = "firefox";
		browser = System.getProperty("browser"); 
//		-Dbrowser="firefox"
		if(browser == null) {System.err.println("Please provide browser: -Dbrowser=firefox"); System.exit(0);}
		else if(!browser.equalsIgnoreCase("chrome") &&
				!browser.equalsIgnoreCase("firefox") &&
				!browser.equalsIgnoreCase("safari") &&
				!browser.equalsIgnoreCase("edge")) 
				{System.err.println("Framework supports only: Chrome, Firefox, Safari or Edge"); System.exit(0);}
		
		SignUp.open(browser);
		SignUp.validate();
		Confirmation.validate();
		Common.quit();
	}
}