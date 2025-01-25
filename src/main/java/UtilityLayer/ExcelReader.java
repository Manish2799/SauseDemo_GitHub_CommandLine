package UtilityLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass{

	private static XSSFSheet sheet;
	
	public ExcelReader(String sheetpath,String sheeetname) throws IOException
	{
		FileInputStream file=new FileInputStream(sheetpath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		 sheet=workbook.getSheet(sheeetname);
	}
	
	public static Object getCellType(int row,int cell)
	{
		XSSFCell cells=sheet.getRow(row).getCell(cell);
		
		if(cells==null || cells.getCellType()==XSSFCell.CELL_TYPE_BLANK)
		{
			return "";
		}
		else if(cells.getCellType()==XSSFCell.CELL_TYPE_STRING)
		{
			return cells.getStringCellValue();
		}
		else if(cells.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		{
			return cells.getRawValue();
		}
		else if(cells.getCellType()==XSSFCell.CELL_TYPE_BOOLEAN)
		{
			return cells.getBooleanCellValue();
		}
		else
		{
			return "please cheak your Excel sheet data fromat";
		}
	}
	
	public static List<Map<String,Object>> readExceldata()
	{
		int row=sheet.getLastRowNum()+1;
		
		int cell=sheet.getRow(0).getLastCellNum();
		
		List<Map<String,Object>> rowdata=new ArrayList<Map<String,Object>>();
		
		for(int i=1 ; i< row; i++)
		{
			Map<String,Object> celldata= new LinkedHashMap<String,Object>();
			
			for(int j=0; j<cell; j++)
			{
				String cellname=sheet.getRow(0).getCell(j).getStringCellValue();
				
				Object cellvalue=getCellType(i,j);
	
				celldata.put(cellname, cellvalue);
			}
			
			rowdata.add(celldata);
		}
		return rowdata;
	}
}
