package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelsheet 
{
	public String Excel_Username(int a) throws IOException
	{
		FileInputStream f=new FileInputStream(new File("src\\test\\resources\\Inputs\\Jpet.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(f);
		XSSFSheet sheet=workbook.getSheetAt(0);
		String un= sheet.getRow(a).getCell(0).getStringCellValue();
		return un;
	}
	public String Excel_password(int b) throws IOException
	{
		FileInputStream f=new FileInputStream(new File("src\\test\\resources\\Inputs\\Jpet.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(f);
		XSSFSheet sheet=workbook.getSheetAt(0);
		String pwd= sheet.getRow(b).getCell(1).getStringCellValue();
		return pwd;
	}
}
