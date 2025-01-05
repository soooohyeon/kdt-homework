package ioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//예제 07.
public class KoreanInput01 {
	public static void main(String[] args) {
//		파일을 읽어올 변수
		int read = 0;
//		입력 스트림 선언
		InputStream in = null;
		
		try {
			in = new FileInputStream("file_korean.txt");
			while(true) {
//				파일 읽어오기
				read = in.read();
//				다 읽어왔으면 반복 종료
				if (read == -1) {
					break;
				}
//				한글은 깨지는 것 확인 완료
//				-> 한글은 2byte지만 기본 1byte기때문에 깨짐
//				해결 방법은 FileInputStream02파일 확인 - Reader 추상 클래스 사용
				System.out.print((char)read);
			}
		} catch (IOException e) {
//			에러 메세지 출력
			System.out.println("Error : " + e.getMessage());
		} finally {
//			더 이상 사용하지 않아도 계속 사용중이라면 종료
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
