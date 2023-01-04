package com.sgtesting.parameterisedconstructor;
class employee
{
	/*instance variable declaration may not be required
	*matching instance variable with parameters is not required
	*/ 
	employee(String ename,int eid,String j,int s)
	{
		System.out.println("empid: "+eid);
		System.out.println("empname: "+ename);
		System.out.println("job: "+j);
		System.out.println("sal:  "+s);
		System.out.println("---------------------");
	

	}
}
class dept
{
	int deptno;
	String deptname;
	String deptloc;
	String depthead;
	dept( int dno,String dname,String dloc,String dhead)
	{
		deptno=dno;
		deptname=dname;
		deptloc=dloc;
		depthead=dhead;
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
	insurance(String iname,String ihname,int ino,int ia)
	{
		insNo=ino;
		insholdername=ihname;
		insname=iname;
		insAmount=ia;
		System.out.println("insno: "+insNo);
		System.out.println("insholdername: "+insholdername);
		System.out.println("insname: "+insname);
		System.out.println("insAmount: "+insAmount);
		System.out.println("----------------------");
	}
}
public class InstanceVariable1 {

	public static void main(String[] args) {
//saving values in variables and inserting the same 
		String a="santosh";
		int b=01;
		String c="analyst";
		int d=10000;
		
		employee a1= new employee(a,b,c,d);

		employee a2=new employee("arvind",02,"manager",40000);

		dept b1=new dept(10,"civil","jb campus","govindaraju");

		dept b2=new dept(11,"ec","jb campus","Amarnath");

		insurance c1=new insurance("bajaj","suraj",46,10000);

		insurance c2=new insurance("lic","suresh",49,20000);
	}

}
