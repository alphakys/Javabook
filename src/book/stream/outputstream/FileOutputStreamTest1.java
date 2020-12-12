package book.stream.outputstream;

import java.io.*;

public class FileOutputStreamTest1 {

	public static void main(String[] args)throws IOException {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)){
				fos.write(65);
				fos.write(66);
				fos.write(67);
				fos.write(68);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("출력 완료");
		
		
		
	}

}
