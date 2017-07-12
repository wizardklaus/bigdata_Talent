package ex0710.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class BufferedFileCopyExam {
     public void  copy(String readF , String writeF){
    	 /*byte������ ������ �о byte���������������ϱ�
    	 *  => Buffered�̿�
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
		 JOptionPane.showInputDialog("���� �����̸�?");
		String writeF = 
		 JOptionPane.showInputDialog("������ �����̸�?");
		
		
		long startTime = System.nanoTime();
        new BufferedFileCopyExam().copy(readF, writeF);
        long endTime = System.nanoTime();
        
        System.out.println("�ɸ��ð� : " + (endTime-startTime));
	}

}