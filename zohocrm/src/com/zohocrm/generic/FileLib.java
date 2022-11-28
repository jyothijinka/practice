package com.zohocrm.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author jyothi
 *
 */
public class FileLib {
	/**
	 * This is a generic code for commondata
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/zohocrmcommomdata.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	/**
	 * 
	 * @param SheetName
	 * @param rownum
	 * @param cellnum
	 * @return String
	 * @throws IOException
	 */
	public String getStringExcelData(String SheetName,int rownum,int cellnum) throws IOException {
		FileInputStream fis=new FileInputStream("./data/testscript (2).xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
	public double getNumericExcelData(String SheetName,int rownum,int cellnum) throws IOException {
		FileInputStream fis=new FileInputStream("./data/testscript (2).xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double data = wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).getNumericCellValue();
		return data;
	}
public Date getDate(String SheetName,int rownum,int cellnum) throws IOException {
	FileInputStream fis=new FileInputStream("./data/testscript (2).xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Date data = wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).getDateCellValue();
	return data;
}
public int getLastRowNum(String SheetName) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript (2).xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	int data = wb.getSheet(SheetName).getLastRowNum();
	return data;
}
public int getLastCellNum(String SheetName) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript (2).xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	int data = wb.getSheet(SheetName).getRow(0).getLastCellNum();
	return data;
}
public void setStringExcelData(String SheetName,int rownum,int cellnum,String setvalue) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript (2).xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).setCellValue(setvalue);
	FileOutputStream fos=new FileOutputStream("./data/testscript (2).xlsx");
	wb.write(fos);
	wb.close();
}
}
