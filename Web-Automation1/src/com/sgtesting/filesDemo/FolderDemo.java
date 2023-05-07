package com.sgtesting.filesDemo;

import java.io.File;

public class FolderDemo {

	public static void main(String[] args) {
		
        //	createFolder();
		//	createNestedFolder();
		//	renameFolder();
		//	deleteFolder();
			folderCollections();
	}
	private static void createFolder()
	{
		File f1=new File("D:\\New folder\\EXAMPLE\\WELCOME\\Mercury");
		f1.mkdir();
	}

	private static void createNestedFolder()
	{
		File f1=new File("D:\\New folder\\EXAMPLE\\WELCOME\\MM1\\MM2\\MM3\\MM4\\MM5");
		f1.mkdirs();
	}
	
	private static void renameFolder()
	{
		File f1=new File("D:\\New folder\\EXAMPLE\\WELCOME\\Mercury");
		File f2=new File("D:\\New folder\\EXAMPLE\\WELCOME\\Mercury_Jupiter");
		f1.renameTo(f2);
	}
	
	private static void deleteFolder()
	{
		File f2=new File("D:\\New folder\\EXAMPLE\\WELCOME\\Mercury_Jupiter");
		boolean v1=f2.delete();
		System.out.println("Is Folder deleted successfully?:"+v1);
	}
	
	private static void folderCollections()
	{
		File f1=new File("D:\\New folder\\EXAMPLE\\WELCOME");
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isDirectory()==true)
			{
				String path=f2[i].getPath();
				System.out.println(path);
			}
		}
	}
}
