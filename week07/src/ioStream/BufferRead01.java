package ioStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//예제 11.
public class BufferRead01 {
	public static void main(String[] args) {
//		파일을 읽어오기 위한 객체 생성
		FileInputStream in = null;
//		보조스트림 객체 생성
		BufferedInputStream bis = null;
		
		try {
//			읽어올 파일 설정
			in = new FileInputStream("fileText.txt");
			bis = new BufferedInputStream(in);
			int read = 0;
			
			while((read = bis.read()) != -1) {
				System.out.print((char)read);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
