package ioStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//예제 08.
public class KoreanInput02 {
	public static void main(String[] args) {
//		파일을 읽어올 변수
		int read = 0;
//		byte 단위가 아닌 문자단위로 읽어오는 Reader 객체 선언
		Reader reader = null;
		
		try {
//			읽어올 파일 설정
			reader = new FileReader("file_korean.txt");
			while(true) {
//				파일 읽어오기
				read = reader.read();
//				전부 읽어오면 반복 종료
				if (read == -1) {
					break;
				}
//				byte로 불러온 데이터 형변환 후 출력
				System.out.print((char)read);
			}
		} catch (IOException e) {
//			에러 메세지 출력
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
