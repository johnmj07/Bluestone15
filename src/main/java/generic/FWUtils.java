package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWUtils extends BaseTest
{
  public static String WriteExcel(int Row,  int Cell, String path, String sheet) throws Exception {
	  Workbook wb=WorkbookFactory.create(new FileInputStream(path));
	 Row r = wb.getSheet(sheet).getRow(Row);
	 if(r==null)
	 {
		 r=wb.getSheet(sheet).createRow(Row);
	 }
	 return r.getCell(Cell, MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();
  }
	 public static void ReadExcel(int Row,int Cell, String path,String sheet,String value) throws Exception, Exception, Exception
	 {
		 Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		 Row r = wb.getSheet(sheet).getRow(Row);
		 if(r==null)
		 {
			 r=wb.getSheet(sheet).getRow(Row);
		 }
		 r.createCell(Cell).setCellValue(value);
		 wb.write(new FileOutputStream(path));
		 
	 }
	 
	 public static void TakesScreenshot(String path,WebDriver driver) throws IOException
	 {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File dst=new File(path);
		 FileUtils.copyFile(src, dst);
	 }
	  
  }

