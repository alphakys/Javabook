package book.stream.inputstream;

import java.io.*;

public class FileInputStreamTest2 {

	public static void main(String[] args)throws IOException {
		
		FileInputStream fis = new FileInputStream("input2.txt");
		
		byte[] ba = new byte[5];
		
		int i;
		try {
		while((i=fis.read(ba))!=-1) {
			for(int k=0;k<i;k++) {
				System.out.print((char)ba[k]);
			}
			System.out.println(": "+ i+"바이트 읽음");
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}

}
