package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("hello.txt");  // 파일이 존재하지 않을 경우, 에러 발생
			int data = fis.read();
			System.out.println((char)data);
			
		} catch (FileNotFoundException e) {
			System.out.println("error: " + e);	
			
		} catch(IOException e){
			System.out.println("error: " + e);
		
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException e){
				e.printStackTrace();
			
			}
		}
	}
}
