package file_RW;

import java.io.*;
import java.util.stream.*;

public class  file_RW{
	String sorce_file="C:\\Users\\tiger\\Desktop\\work\\LNLNSJRN.del";
	String destination_folder="C:\\Users\\tiger\\Desktop\\work\\output\\copy.txt";
	
	public static void copy(String sorce_file,String destination_folder)throws  IOException {
		try{
			InputStream is = new FileInputStream(sorce_file);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bR = new BufferedReader(isr);
			
			//close
			bR.close();
			isr.close();
			is.close();
			
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException e");
			e.printStackTrace();
		}
		
	
	
		
	} 
}