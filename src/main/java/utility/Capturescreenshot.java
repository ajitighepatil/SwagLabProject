package utility;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.TestBase;

public class Capturescreenshot extends TestBase
{

	public static String getDate()
	{
		return new SimpleDateFormat("dd-MM-YYYY ss-mm-HH").format(new java.util.Date()); //  return the date and time of screenshot
		      //SimpleDateFormat = select(string pattern)// format = date date // in bracjet type: new date = select date from java util
		
	}

    public static void screenshot(String nameOfMethod) throws IOException  // parameter = nameOfMethod
    {
    	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File destination = new File("C:\\jar files\\Maven_automation\\Screenshot\\"+nameOfMethod+"..."+getDate()+".jpeg"); // path of screenshot folder
    	                                     //              path(only upto screenshot)=\\(to coninue code)+ nameOfMethod+..(for gap) +getDate + format type
        FileHandler.copy(source, destination); // FileHandler = select from selenium 
    
    }











}
