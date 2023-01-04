package com.sginstitute.javatest4;
class Throw
{
	void dispaly()
	{
		try
		{

			int a[]= {1,2,3};
			for(int i=0;i<=a.length;i++)
			{
				System.out.println(a[i]);
			}

			if(a.length>2)
			{
				throw new Exception("Please provide Array Elements within specified limit only");
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class Test4Q10 {

	public static void main(String[] args) {

		Throw a1=new Throw();
		a1.dispaly();
	}


}
