package book.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest1  {

	public static void main(String[] args)throws IOException {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		 System.out.println("end");
		
		
		
	}	

}
