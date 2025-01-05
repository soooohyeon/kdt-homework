package ioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 예제 01.
public class ReadTest01 {
	public static void main(String[] args) {
//		읽어온 파일을 저장할 변수
		int read = 0;
//		파일을 읽어오기 위해 입력 스트림 선언
		InputStream in = null;
		try {
			in = new FileInputStream("my_file.txt");
			while (true) {
//				파일 1byte씩 읽기
				read = in.read();
//				파일을 전부 읽고 -1이 되면 종료
				if (read == -1) {
					break;
				}
//				byte 타입으로 읽은 데이터를 char 타입으로 변환 후 출력
//				줄바꿈 기호나 띄어쓰기도 다 가져오기 때문에 줄바꿈 없는 출력메소드 사용
				System.out.print((char)read);
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				if (in != null) {
//					입력스트림 사용 종료 후 닫기, finally에서 사용시 예외처리 해주어야함
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
