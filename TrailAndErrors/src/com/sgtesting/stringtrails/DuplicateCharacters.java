package com.sgtesting.stringtrails;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s="Programm";
	    char a[]=s.toCharArray();
	 
		for(int i=0;i<a.length;i++)
		{    int count=1;
			for(int k=i+1;k<a.length;k++)
			{
				if(a[i]==a[k])
				{
					System.out.println("positions: "+(i+1)+"------->"+(k+1));
		            count++;
				}	         
			}
			if(count>=2)
			{
		
				System.out.println("Duplicate characters: "+a[i]+ ", repetition : "+count);			
			}
			
		}
	}

}
