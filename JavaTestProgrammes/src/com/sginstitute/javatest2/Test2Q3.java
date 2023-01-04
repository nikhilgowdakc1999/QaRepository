package com.sginstitute.javatest2;
//method to return result of "or" operator expression
class OrOperator
{
	boolean or()
	{
		int a= 46;
		//or operator
		if(a%2==0||a!=0)
		{
			return true;
		}
		return false;
	}	
}
public class Test2Q3 {

	public static void main(String[] args) {
		OrOperator a1=new OrOperator();
		boolean val=a1.or();
	System.out.println(val);
		}

	}

