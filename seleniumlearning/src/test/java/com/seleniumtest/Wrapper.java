package com.seleniumtest;

import java.io.IOException;

public class Wrapper {

	public static void main(String[] args) throws IOException {
		  
		  WrapperMethods wm = new WrapperMethods();
		  
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		  
		  wm.enterbyid("txtUsername", "Admin");
		  
		  wm.enterbyid("txtPassword", "admin123");
		  
		  wm.clickbyId("btnLogin");
		  
		  wm.takesnap("src/test/resources/screenshots/filebin1.png");
		  
		  wm.closeapp();

	}

}

	


