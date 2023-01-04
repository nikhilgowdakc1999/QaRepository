package com.sgtesting.recurssion;
class DigitsCount
{
int Digit(int a)
{
	int count=0;
	for(int i=a;i!=0;i/=10)
	{
	count++;
	}
	return count;	
}
}
public class NoOfDigits {

	public static void main(String[] args) {
		
		DigitsCount a1=new DigitsCount();
		int p=a1.Digit(545454);
		System.out.println(p);
	}

}
