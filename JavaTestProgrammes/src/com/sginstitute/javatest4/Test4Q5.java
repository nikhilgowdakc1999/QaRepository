package com.sginstitute.javatest4;
class Finallyblock
{
	void add()
	{
		int x=2;
		int y=3;
		int res=x+y;
		System.out.println(res);
	}
	void mult()
	{
		try {

			int x=0;
			int y=(1/0);
			int res=x*y;
			System.out.println(res);
		}catch(Exception e)
		{
			System.out.println(e);;
		}
		finally
		{
			System.out.println("It always Executes");
		}
	}
	void sub()
	{
		int x=3;
		int y=4;
		int res=x-y;
		System.out.println(res);
	}
}



		public class Test4Q5 {

			public static void main(String[] args) {

				Finallyblock a1=new Finallyblock();
				a1.add();
				a1.mult();
				a1.sub();
			}

		}
