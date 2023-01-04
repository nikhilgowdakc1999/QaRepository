package com.sgtesting.noargsconstructor;
class employee
{
	String empname;
	int empid;
	String job;
	int sal;
	employee()
	{
		empid=10; 
		empname="santosh";
		job="analyst";
		sal=10000;
		System.out.println("empid: "+empid);
		System.out.println("empname: "+empname);
		System.out.println("job: "+job);
		System.out.println("sal:  "+sal);
		System.out.println("---------------------");
//multiple object not possible as here it gives 2*2=4 values in total
		empid=20; 
		empname="santu";
		job="Manager";
		sal=20000;
		System.out.println("empid: "+empid);
		System.out.println("empname: "+empname);
		System.out.println("job: "+job);
		System.out.println("sal:  "+sal);
		System.out.println("---------------------");
	}
}
class dept
{
	int deptno;
	String deptname;
	String deptloc;
	String depthead;
	dept()
	{
		deptno=10;
		deptname="civil";
		deptloc="jb campus";
		depthead="Amarnath";
		System.out.println("deptno: "+deptno);
		System.out.println("deptname: "+deptname);
		System.out.println("deptloc: "+deptloc);
		System.out.println("depthead: "+depthead);
		System.out.println("----------------------");
	}
}
class insurance{
	String insname;
	int insNo;
	String insholdername;
	int insAmount;
	insurance()
	{
		insNo=47;
		insholdername="Niki";
		insname="lic";
		insAmount=100000;
		System.out.println("insno: "+insNo);
		System.out.println("insholdername: "+insholdername);
		System.out.println("insname: "+insname);
		System.out.println("insAmount: "+insAmount);
		System.out.println("----------------------");
	}
}
public class InstanceVariable1 {

	public static void main(String[] args) {

		employee a= new employee();
	//2 object declaration leads to multiple values display  
		employee a1=new employee();

		dept b=new dept();

		insurance c=new insurance();
	}

}
