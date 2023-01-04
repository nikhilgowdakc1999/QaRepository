package com.sginstitute.javatest2;
//method to return result of "and" operator expression
class AndOperator
{
	boolean And()
	{
		int a= 46;
		//and operator
		if(a%2==0 && a!=0)
		{
			return true;
		}
		return false;
	}
}
public class Test2Q2 {

	public static void main(String[] args) {

		AndOperator a1=new AndOperator();
		boolean val=a1.And();
		System.out.println(val);
		}
	}


