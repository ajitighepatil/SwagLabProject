package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handle_dropdownLiist // this class contain the code for handling the listbox
{

	public static void handleSelectClass(WebElement element, String value)
	{
		Select sc = new Select(element); //element= element present in the listbox is stored here 
		sc.selectByVisibleText(value);// value= value of that element is stored here 
		
		
	}
	
	
	
	
}
