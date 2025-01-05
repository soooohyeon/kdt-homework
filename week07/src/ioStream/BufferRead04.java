package ioStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//예제 14.
public class BufferRead04 {
	public static void main(String[] args) {
//		입력 스트림 객체 선언
		FileReader reader = null;
//		입력 보조 스트림 객체 선언
		BufferedReader br = null;
		
		try {
			reader = new FileReader("book.txt");
			br = new BufferedReader(reader);
			
			String str = "";
//			버퍼에 문자를 저장하기 때문에 한번에 읽기 가능
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
