package com.sgtesting.recurssion;
class Digits{
	int digi(int num)
	{
		int count=0;
		for(int i=num;i>0;i/=10)
		{
			count++;
		}
		return count;
	}
}
public class NoOfDigits {

	public static void main(String[] args) {
		Digits a1= new Digits();
		int k=a1.digi(13247563);
		System.out.println(k);
	}

}
