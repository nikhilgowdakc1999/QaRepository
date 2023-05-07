package com.sgtesting.methods;
class RODigits{
	int digi(int num)
	{
		int n=0;
		int rem=0;
		for(int i=num;i>0;i/=10)
		{
			rem=i%10;
			n=(n*10)+rem;
		}
		return n;
	}
}
public class RevOfDigits {

	public static void main(String[] args) {
		RODigits a1=new RODigits();
		int a=a1.digi(46479);
		System.out.println(a);

	}

}
