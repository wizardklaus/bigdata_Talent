package ex0710.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class KeyBoardInputSaveExam {
	//키보드 입력 받을 준비
	 BufferedReader br = null;		
	//파일에 저장을 위한 준비
	 BufferedWriter bw=null ;
	 
	 public KeyBoardInputSaveExam(){
		 try{
		  br =new BufferedReader(new InputStreamReader(System.in));
		  bw = new BufferedWriter(new FileWriter("src/ex0710/io/input.txt"));
		
		   String data=null;
		   System.out.print("입력 : " );
			while(!(data=br.readLine()).equals("quit")){ //1. 키보드 입력을 받는다.
				//2. 입력받는 데이터를 화면에 출력한다.
			    System.out.println("내용: "+ data);
				//3. 입력받은 데이터를 파일에 저장한다.
			    bw.write(data);
			    bw.newLine();
			    System.out.print("입력 : " );
			}
		    
		 }catch(IOException e){
			 e.printStackTrace();
		 }finally{
			 try{
				 br.close();
				 bw.close();
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		 }
	 }
	public static void main(String[] args) {
		new KeyBoardInputSaveExam();

	}

}