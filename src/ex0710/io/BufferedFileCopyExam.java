package ex0710.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class BufferedFileCopyExam {
     public void  copy(String readF , String writeF){
    	 /*byte단위로 파일을 읽어서 byte단위로파일저장하기
    	 *  => Buffered이용
    	 */
    	 BufferedInputStream bis=null;
    	 BufferedOutputStream bos=null;
    	 try{
    		 bis = new BufferedInputStream(
    				 new FileInputStream(readF));
    		 
    		 bos = new BufferedOutputStream(
    				 new FileOutputStream(writeF));
    		 
    		 int i=0;
    		 while((i=bis.read())!=-1){
    			 bos.write(i);
    		 }
    		 
    	 }catch(IOException e){
    		 e.printStackTrace();
    	 }finally {
    		 try{
				bis.close();
				bos.close();
    		 }catch (Exception e) {
				e.printStackTrace();
			}
		}
    	 
     }
	
	public static void main(String[] args) {
		String readF = 
		 JOptionPane.showInputDialog("읽을 파일이름?");
		String writeF = 
		 JOptionPane.showInputDialog("저장할 파일이름?");
		
		
		long startTime = System.nanoTime();
        new BufferedFileCopyExam().copy(readF, writeF);
        long endTime = System.nanoTime();
        
        System.out.println("걸린시간 : " + (endTime-startTime));
	}

}