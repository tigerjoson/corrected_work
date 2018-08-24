package file_RW;

import java.io.*;
import java.util.stream.*;
import java.nio.file.*;
public class  file_RW{
	
	
	public static void copy(String sorce_file,String destination_folder)throws  IOException {
		try{
			//Read
			InputStream is = new FileInputStream(sorce_file);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bR = new BufferedReader(isr);
			//write
			OutputStream outputStream = new FileOutputStream(destination_folder);
			OutputStreamWriter osr = new OutputStreamWriter(outputStream,"gbk");
			BufferedWriter bWriter = new BufferedWriter(osr);
			
			String line;//garbled
			byte [] line_byte;
			int count=0;
			
			while((line=bR.readLine())!=null){
				count++;
				line_byte = line.getBytes("gbk");	
				//System.out.println(line_byte[count]);
				bWriter.write(line_byte[count]);
			}
			
			
			
			//close
			bR.close();
			isr.close();
			is.close();
			bWriter.close();
			osr.close();
			outputStream.close();
			
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException e");
			e.printStackTrace();
		}
		
	
	
		
	} 
}