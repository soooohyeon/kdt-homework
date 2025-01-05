package ioStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//예제 04.
public class WriteTest02 {
	public static void main(String[] args) {
		OutputStream out = null;
		try {
//			생성할 파일명과 이어쓰기가 아닌 새로운 데이터를 넣기 위한 false를 매개변수로 전달
			out = new FileOutputStream("write_array.txt", false);
//			작성할 데이터를 문자열로 저장
			String str = "hello world";
//			문자열에 저장해둔 내용을 byte 타입으로 변환해서 배열에 저장
			byte[] strArray = str.getBytes();
//			배열에 저장해둔 데이터들을 위에서 생성해둔 write_attay.txt 파일에 데이터 출력
			out.write(strArray);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
