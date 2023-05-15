package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream 으로 받아보기
		//OutputStream 도 1byte 처리 스트림이다.
		OutputStream os = ps;
		//2byte 처리 스트림
		OutputStreamWriter osw = new OutputStreamWriter(os);
		try {
			osw.write(48148);
			osw.write(48372);
			osw.write(44032);
			osw.write("아니야");
			osw.flush(); //write는 출력할 준비를 해주고 flush 를 해줘야 출력이 된다.
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
