package com.sgtesting.characterstream;

import java.io.FileWriter;

public class FileWriteDemo {

	public static void main(String[] args) {
		writeContent();
	}
	private static void writeContent()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:\\New folder\\EXAMPLE\\WELCOME\\Sample2.txt",true);
			String str="Java is a Programming Language,";
			str+="Java used for developing the Applications";
			
			char ch[]=str.toCharArray();
			fw.write(ch);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
