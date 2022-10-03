package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
    private WebDriver driver;
    private  static String value;
    private double d;
    public static void captureScreenshot(WebDriver driver,int TestID) throws IOException 
	 {
		  
	  String time=new  SimpleDateFormat("dd-MM-yyyy hh.mm.ss").format(new Date());
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	  File dest=new File("C:\\Users\\Hi-Tech Computers\\Documents\\JavaS\\test"+TestID+" "+time+".jpg");
      FileHandler.copy(src, dest);
	 } 
    
    public static String exclefiledata(int RowIndex, int CellIndex) throws IOException
	 {
		String path="C:\\Users\\Hi-Tech Computers\\Documents\\JavaS\\Velocity.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(file);
		//String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		try {
			value= wb.getSheet("Sheet1").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		    }
		 catch(Exception e)
		{
				
			 double d= wb.getSheet("Sheet1").getRow(RowIndex).getCell(CellIndex).getNumericCellValue();
			 value= Double.toString(d);
		}
		return value;
	 }

//	 public static String exclefiledata(int RowIndex, int CellIndex) throws IOException
//	 {
//		String path="C:\\Users\\Hi-Tech Computers\\Documents\\JavaS\\Velocity.xlsx";
//		FileInputStream file=new FileInputStream(path);
//		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
//		return data;
//	 }
}
