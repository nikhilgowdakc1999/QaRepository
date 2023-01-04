package com.sginstitute.javatest4;
abstract class Geometricfigures
{
	abstract void Volume();
}
class Square extends Geometricfigures
{
	void Volume()
	{
		int s=2;
		int vol=s*s*s;
		System.out.println(vol);
	}
}
class Rectangale extends Geometricfigures
{
	void Volume()
	{
		int l=2;
		int b=2;
		int h=4;
		int vol=l*b*h;
		System.out.println(vol);
	}

}
public class Test4Q3 {

	public static void main(String[] args) {
		Geometricfigures fig=null;
		
		fig=new Square();
		fig.Volume();
		
		fig=new Rectangale();
		fig.Volume();

	}

}
