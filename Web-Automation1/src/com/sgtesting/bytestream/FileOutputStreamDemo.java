package com.sgtesting.bytestream;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		writeContent();
	}
	private static void writeContent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("D:\\New folder\\EXAMPLE\\WELCOME\\Sample.txt",true);
			String str="Java is a Programming Language,";
			str+="Java used for developing the Applications";
			
			byte b[]=str.getBytes();
		    fout.write(b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
