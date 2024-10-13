package com.regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Setup {
	
	WebDriver driver;
	Properties prop=new Properties();
	
	@BeforeClass
	public void Initalization() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties\\config.properties");
		
		//To Load the File
		prop.load(fis);
		
		//Open Chrome Browser
		driver = new ChromeDriver();
		
		//Read the URL
		driver.get(prop.getProperty("QA_Url"));
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Get the Title
		System.out.println("Website Name : " + driver.getTitle());			
	}
	
	@AfterClass
	public void Cleanup() {
		driver.quit();
	}
}
