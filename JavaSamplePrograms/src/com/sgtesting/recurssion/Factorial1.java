package com.sgtesting.recurssion;
//Factorial using recurrsion 
//Return type method is used as single value is obtained as o/p
class Fact
{   int f=1;
	int i=1;
	int facto()
	{
	if(i<=10)
	{
	f=f*i;
	i++;
	facto();
	}
	return f;
	}
	
}
public class Factorial1 {

	public static void main(String[] args) {
		Fact a=new Fact();
		System.out.println(a.facto());
	}

}
