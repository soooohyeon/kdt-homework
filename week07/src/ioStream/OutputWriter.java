package ioStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//예제 17.
public class OutputWriter {
	public static void main(String[] args) {
		FileOutputStream in = null;
		OutputStreamWriter is = null;
		
		try {
			in = new FileOutputStream("example.txt");
//			문자 타입으로 변환시 사용할 encoding 지정
			is = new OutputStreamWriter(in, "UTF-8");
			System.out.println("파일 생성 시작");
//			파일에 넣을 데이터를 배열에 저장
			String[] strArray = {"OutputStreamWriter에 대해 배웁니다." ,
								"we are learning about OutputStreamWriter"};
//			for문 사용해서 파일에 데이터 저장
			for (String str : strArray) {
				is.write(str + "\n");
			}
			System.out.println("파일 생성 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
