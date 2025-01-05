package ioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 예제 02.
public class ReadTest02 {
	public static void main(String[] args) {
//		파일을 읽어올 변수 선언
		int read = 0;
//		파일을 읽어올 입력 스트림 객체화
		InputStream in = null;
//		읽어올 파일을 byte 배열 타입에 담기 위해 선언
		byte[] buffer = new byte[5];
		try {
			in = new FileInputStream("my_file.txt");
			while(true) {
				read = in.read(buffer);
//				파일을 다 읽으면 -1이됨, -1이되면 종료
				if (read == -1) {
					break;
				}
//				byte로 변환한 값을 담은 배열, 배열의 시작 인덱스, 길이
				System.out.print(new String(buffer, 0, read));
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
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
