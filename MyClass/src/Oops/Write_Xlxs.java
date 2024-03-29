package Oops;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;

public class Write_Xlxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Blank wrokbook
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create a new blank sheet
		XSSFSheet sheet = workbook.createSheet("EmployeeData");
		
		//This data needs to be written Object[]
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
	    data.put("2", new Object[] {"1", "Ajesh", "Shukla"});
	    data.put("3", new Object[] {"2", "Lokesh", "Sharma"});
	    data.put("4", new Object[] {"3", "Jyesh", "Sharma"});
	    data.put("5", new Object[] {"4", "Mhesh", "Gupta"});
	    
	    //Iterate over data and write to sheet
	    Set<String> a = data.keySet();
	    
	    int rownum = 0;
	    
	    for(String key : a)
	    {
	    	Row row = sheet.createRow(rownum++);
	    	
	    	Object[] objArr = data.get(key);
	    	
	    	int cellnum = 0;
	    	
	    	for(Object obj : objArr)
	    	{
	    		Cell cell = row.createCell(cellnum++);
	    		
	    		if(obj instanceof String)
	    		
	    	    cell.setCellValue((String)obj);
	    		
	    		else if(obj instanceof Integer)
	    			
	    	    cell.setCellValue((String)obj);
	    	}
	    }
	    
	    try {
	    	
	    	//Write the workbook in file system
	    	File f = new File("Excel_File.xlsx");
	    	
	    	FileOutputStream out = new FileOutputStream(f);
	    	
	    	workbook.write(out);
	    	
	    	out.close();
	    	
	    	System.out.println("Excel_File.xlsx written successfully on disk.");
	    }
	    catch (Exception e)
	    {
	    e.printStackTrace();
	    }

	    }
		

	}

