package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HTMLcanvasStudio;

public class DrawLines extends HTMLcanvasStudio{

	HTMLcanvasStudio page=new HTMLcanvasStudio();;
	
	@BeforeTest
	public void setup() {
		page.setDriver();
	}
	
	@Test()
	public void testDrawingLines() {
		page.clickOnDrawALine();
		page.drawLines();
	}

	
	@AfterTest
	public void tearDown() {
		page.closeBrowser();
	}
	
}
