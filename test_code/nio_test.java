package test;
import java.io.*;

import java.nio.channels.*;

import java.nio.ByteBuffer;
import java.nio.file.*;

public class nio_test{
	public static void main(String[] args)throws IOException{
		try{
			Path source_path = Paths.get("C:\\Users\\tiger\\Desktop\\work\\LNLNSJRN.del");
			Path destination_folder = Paths.get("C:\\Users\\tiger\\Desktop\\work\\output\\copy.txt");
			ReadableByteChannel read_channel = Files.newByteChannel(source_path,StandardOpenOption.READ);
			WritableByteChannel write_channel = Files.newByteChannel(destination_folder,
												new OpenOption[] {StandardOpenOption.CREATE,StandardOpenOption.WRITE});
			//use ByteBuffer must allocate,ex:capacity = 1024
			
			ByteBuffer buffer = ByteBuffer.allocate(1024);

			while (read_channel.read(buffer) > 0) {
				buffer.flip();
				write_channel.write(buffer);
				buffer.flip();
			}
			
			read_channel.close();
			write_channel.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		 
	}
}