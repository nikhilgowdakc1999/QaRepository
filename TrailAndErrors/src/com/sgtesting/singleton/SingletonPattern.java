package com.sgtesting.singleton;
class SingletonDesign
{
	static SingletonDesign obj=null;
	private SingletonDesign()
	{
		//it is a private constructor	
	}
	void add(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
	void mul(int x,int y)
	{
		int res=x*y;
		System.out.println(res);
	}
	static SingletonDesign getinst()
	{
		if(obj==null)
		{
			obj=new SingletonDesign();
		}return obj;
	}
}
public class SingletonPattern {

	public static void main(String[] args) {

		//important step
		SingletonDesign a1=SingletonDesign.getinst();
		a1.add(2, 3);
		a1.mul(3, 4);
        //important step
		SingletonDesign a2=SingletonDesign.getinst();
		a2.add(12, 3);
		a2.mul(13, 4);

		if(a1==a2)
		{
			System.out.println("objects have same reference");
		}
		else
		{
			System.out.println("objects don't have same reference");
		}

	}
}

