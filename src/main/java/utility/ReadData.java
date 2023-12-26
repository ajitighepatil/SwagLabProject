package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData // generally this class is used to store the path of all files,documents
{                    //(excelshhet in parameterization, information for cross browser testing).
	public static String readPropertyFile(String value) throws IOException // this method is use to declare the path of config.properties file.
	                                                       // String value = parameter     //readPropertyFile = any name we can give
	{
	Properties prop = new Properties();// Properties= from java.util, // object creation for properties
	FileInputStream file = new FileInputStream("C:\\jar files\\Maven_automation\\src\\main\\java\\config\\config.properties");//FileInputStream= from java util/
	                          //FileInputStream(class used for parameterization) = select file file, path = config.properties file.
	
	prop.load(file);// load()= method -- used to load the file
	return prop.getProperty(value); // getProperty =is a method // used to get the properties from config.properties file.
	

	}

	public static String readExcel(int row,int column) throws EncryptedDocumentException, IOException// this method is use to declare the path of book 2 excel sheet.
	                                                              // 2 parameters = int row, int column.
	{
		FileInputStream file = new FileInputStream("C:\\jar files\\Maven_automation\\src\\test\\java\\TestData\\Book2.xlsx");// pathof book2 excel sheet
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");// shet 1= excel sheet name where data is stored
	    String value = excel.getRow(row).getCell(column).getStringCellValue();
	
	
		return value;
	}
	 
}
