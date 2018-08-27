package file_RW;
import java.io.*;
import java.util.stream.*;

public class  work{
	public static void main(String[] args)throws IOException{
		String sorce_file="C:\\Users\\tiger\\Desktop\\work\\LNLNSJRN.del";
		String copy_folder="C:\\Users\\tiger\\Desktop\\work\\output\\copy.txt";
		file_RW.copy(sorce_file,copy_folder);
	} 
}