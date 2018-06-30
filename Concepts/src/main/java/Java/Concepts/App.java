package Java.Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class App {
	
	File f1,f2;
	String Path=System.getProperty("user.dir");
	FileInputStream FIS;
	FileOutputStream FOS;
	HSSFWorkbook InputWB,OutputWB;
	HSSFSheet InputSheet,OutputSheet;
	
	
	public void SetInputFile() throws IOException{
		f1=new File(Path + "\\InputFile\\InputFile.xls");
		FIS=new FileInputStream(f1);
		InputWB=new HSSFWorkbook(FIS);
		InputSheet=InputWB.getSheet("Data");
		System.out.println("===========================================================================");
		
		System.out.println(InputSheet.getRow(1).getCell(0).getStringCellValue());
		
		System.out.println("===========================================================================");
	}
	
	public void SetOutputFile() throws IOException{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		f2=new File("./InputFile/OutputFile_"+ timeStamp +".xls");
		FOS=new FileOutputStream(f2);
		
		OutputWB=new HSSFWorkbook();
		OutputSheet=OutputWB.createSheet("Output");
		OutputSheet.createRow(0);
		OutputSheet.getRow(0).createCell(0).setCellValue("Successfully created Excel Document");
		FOS=new FileOutputStream(f2);
		OutputWB.write(FOS);
		
		
	}
}