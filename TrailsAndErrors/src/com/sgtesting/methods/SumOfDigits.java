package com.sgtesting.methods;
class SODigits{
	int digi(int num)
	{
		int sum=0;
		int rem=0;
		for(int i=num;i>0;i/=10)
		{
			rem=i%10;
			sum=sum+rem;
		}
		return sum;
	}
}
public class SumOfDigits {

	public static void main(String[] args) {
		SODigits a1=new SODigits();
		int a=a1.digi(46479);
		System.out.println(a);

	}

}
