package com.sgtesting.Polymorphism2;

abstract class GeometricFigures2
{
	abstract void area();
}
class square extends GeometricFigures2
{
	void area()
	{
		int side=4;
		System.out.println("Area of Square: "+(side*side));
	}
}
class Rectangle extends GeometricFigures2
{
	void area()
	{
		int l=3;
		int b=5;
		System.out.println("Area of Rectange: "+(l*b));
	}
}
class circle extends GeometricFigures2
{
	void area()
	{
		double pi=3.142;
		int r=4;
		System.out.println("Area of circle: "+(pi*r*r));
	}
}
public class Geometricfigures {

	public static void main(String[] args) {
		
		GeometricFigures2
		fig=null;
		
		square a1=new square();
		Rectangle a2=new Rectangle();
		circle a3=new circle();
		
		fig=a1;
		fig.area();
		
		fig=a2;
		fig.area();
		
		fig=a3;
		fig.area();
		
	}

}
