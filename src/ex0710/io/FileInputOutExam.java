package ex0710.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutExam {
	public FileInputOutExam(){
		FileInputStream fs=null;
		FileOutputStream fo=null;
		//byte������ �����б�
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
			
			//byte�迭�� String���� ��ȯ�ϴ� �޼ҵ�
			System.out.println(new String(b));
			
			//byte������ ���� ����(����)
			fo=new FileOutputStream("src/ex0710/io/write.txt",true);
			//���ڿ� -> byte�迭�� ��ȯ
			String msg="���õ� �����ϼ̽��ϴ�.";
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
