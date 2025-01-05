package ioStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//예제 09.
public class KoreanInput03 {
	public static void main(String[] args) {
//		읽어온 파일을 저장할 변수
		int read = 0;
		Reader in = null;
		try {
			in = new FileReader("file_korean.txt");
			char[] buffer = new char[256];
			
			while(true) {
//				파일을 배열로 읽어오기
				read = in.read(buffer);
//				전부 읽어오면 반복 종료
				if (read == -1) {
					break;
				}
//				출력할 배열, 시작인덱스, 종료 인덱스
				System.out.print(String.valueOf(buffer, 0, read));
			}
		} catch (IOException e) {
//			에러 메세지 출력
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
//				읽어올 파일이 없는데 계속 실행 중이라면 종료
				if(in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
