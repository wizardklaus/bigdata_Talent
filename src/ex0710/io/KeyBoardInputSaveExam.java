package ex0710.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class KeyBoardInputSaveExam {
	//Ű���� �Է� ���� �غ�
	 BufferedReader br = null;		
	//���Ͽ� ������ ���� �غ�
	 BufferedWriter bw=null ;
	 
	 public KeyBoardInputSaveExam(){
		 try{
		  br =new BufferedReader(new InputStreamReader(System.in));
		  bw = new BufferedWriter(new FileWriter("src/ex0710/io/input.txt"));
		
		   String data=null;
		   System.out.print("�Է� : " );
			while(!(data=br.readLine()).equals("quit")){ //1. Ű���� �Է��� �޴´�.
				//2. �Է¹޴� �����͸� ȭ�鿡 ����Ѵ�.
			    System.out.println("����: "+ data);
				//3. �Է¹��� �����͸� ���Ͽ� �����Ѵ�.
			    bw.write(data);
			    bw.newLine();
			    System.out.print("�Է� : " );
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