package ioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//에제 21.
public class ObjectinputSerial {
	public static void main(String[] args) {
		FileInputStream in = null;
		ObjectInputStream ois = null;

		try {
			in = new FileInputStream("object_data.dat");
//			객체 역직렬화를 위한 객체 선언
			ois = new ObjectInputStream(in);
			
//			파일의 데이터가 있을 때까지 조회
			while (in.available() != 0) {
//				읽어온 객체 변환
				Person p = (Person)ois.readObject();
				System.out.println("이름 : " + p.getMyName() + ", 나이 : " + p.getMyAge());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
				if(in != null) {
					in .close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
