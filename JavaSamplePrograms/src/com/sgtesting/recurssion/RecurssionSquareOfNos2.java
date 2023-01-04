package com.sgtesting.recurssion;
class NoSquares
{
	int i=0;
//since we are getting sequence of numbers in recurrsion use void method or 
//return method also
	void Sqrs()
	{
		while(i<=10)
		{
			int sq=i*i;
			System.out.println(sq);
			i++;
			Sqrs();
		}
	}
}
public class RecurssionSquareOfNos2 {

	public static void main(String[] args) {

		NoSquares a1=new NoSquares();
		a1.Sqrs();
	}

}
