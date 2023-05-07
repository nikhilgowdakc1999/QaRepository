package com.sgtesting.cloneableinterface;
//cloneable Interface

import java.util.Scanner; 
//class in which object has to be cloned must implement cloneable interface in order to invoke clone() method
public class CloneableProduct implements Cloneable
{
	int pid;  
	String pname;  
	double pcost;  
	//CloneableProduct class constructor   
	public CloneableProduct (int pid, String pname, double pcost)  
	{  
		this.pid = pid;  
		this.pname = pname;  
		this.pcost = pcost;  
	}  
	//method that prints the detail on the console  
	public void showDetail()   
	{  
		System.out.println("Product ID: "+pid);  
		System.out.println("Product Name: "+pname);  
		System.out.println("Product Cost: "+pcost);  
	}  
	public static void main (String args[]) throws CloneNotSupportedException   
	{  
		//reading values of the product from the user  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter product ID: ");  
		int pid = sc.nextInt();  
		System.out.print("Enter product name: ");  
		String pname = sc.next();  
		System.out.print("Enter product Cost: ");  
		double pcost = sc.nextDouble();  
		System.out.println("-------Product Detail--------");  
		CloneableProduct p1 = new CloneableProduct(pid, pname, pcost);  
		//cloning the object of the CloneableProduct class using the clone() method  
		CloneableProduct p2 = (CloneableProduct) p1.clone();  
		//invoking the method to print detail  
		p2.showDetail();  
	}  
}  

