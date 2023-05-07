package com.sgtesting.bytestream;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		readContent();

	}
	private static void readContent()
	{
		FileInputStream fin=null;
		int n=0;
		try
		{
			fin=new FileInputStream("D:\\New folder\\EXAMPLE\\WELCOME\\Sample.txt");
			while(true)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char) n;
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				/*
				 * If file is invalid,It provides Exception in while
				 * Create FileInputStream object
				 * If we try to close the same object,It provides NP
				 * So in order to handle Exception finally block
				 * should contain try catch
				 */
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
