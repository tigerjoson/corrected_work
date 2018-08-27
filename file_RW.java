package file_RW;

import java.io.*;
import java.util.stream.*;
import java.nio.file.*;
import java.nio.*;

public class  file_RW{
	
	
	public static void treat(String sorce_file,String destination_folder)throws  IOException {
		try{
			//Read
			Path sorce_file = Paths.get("C:\\Users\\tiger\\Desktop\\work\\LNLNSJRN.del");
			byte[] context = Files.readAllBytes(sorce_file);
			//write
			/* OutputStream outputStream = new FileOutputStream(destination_folder);
			OutputStreamWriter osr = new OutputStreamWriter(outputStream,"gbk");
			BufferedWriter bWriter = new BufferedWriter(osr); */
			WritableByteChannel channel = 
			
			//String line;//garbled
			byte [] line_byte;
			int count=0;
			
			//close
			
			bWriter.close();
			osr.close();
			outputStream.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	
	
		
	} 
}