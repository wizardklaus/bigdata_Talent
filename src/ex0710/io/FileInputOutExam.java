package ex0710.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutExam {
	public FileInputOutExam(){
		FileInputStream fs=null;
		FileOutputStream fo=null;
		//byte단위로 파일읽기
		try{
			fs=new FileInputStream("src/ex0710/io/read.txt");
			
			/*while(true){
				int re=fs.read();
				if(re==-1)
					break;
			}*/
			/*
			int re=0;
			while((re=fs.read())!=-1){
				System.out.print((char)re);
			}*/
			
			byte[] b=new byte[fs.available()];
			fs.read(b);
			
			//byte배열을 String으로 변환하는 메소드
			System.out.println(new String(b));
			
			//byte단위로 파일 쓰기(저장)
			fo=new FileOutputStream("src/ex0710/io/write.txt",true);
			//문자열 -> byte배열로 변환
			String msg="오늘도 수고하셨습니다.";
			fo.write(msg.getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(fs!=null)
					fs.close();
				if(fo!=null)
					fo.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		new FileInputOutExam();
	}
}
