package com.sgtesting.buffereddemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter1 {

	public static void main(String[] args) {
		writeContent();

	}
	private static void writeContent()
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("D:\\New folder\\EXAMPLE\\WELCOME\\Sample3.txt",true);
			bw=new BufferedWriter(fw);
			
			bw.write("SQL stands for Structured Query Language.");
			bw.newLine();
			bw.write("SQL is a Non Procedural Language.");
			bw.newLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
