package ioStream;

import java.io.FileWriter;
import java.io.IOException;

//예제 10.
public class KoreanWrite01 {
	public static void main(String[] args) {
//		내용에 한국어가 포함된 파일 출력하기 위한 객체 선언
		FileWriter w = null;
		
		try {
//			fileText.txt 파일명과 안에 데이터를 새로 작성하기 위한 매개변수 전달
			w = new FileWriter("fileText.txt", false);
			w.write("H");
			w.write("A");
			w.write("P");
			w.write("P");
			w.write("Y");
			w.write("\n");
//			w.write("안녕");
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				처리할 작업이 없는데도 계속 실행중이라면 종료
				if (w != null) {
					w.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
