package com.sgtesting.arrayspart2;
class employee
{
	String empname;
	int empid;
	String job;
	int sal;
	}
class dept
{
	int deptno;
	String deptname;
	String deptloc;
	String depthead;
}
class insurance{
	String insname;
	int insNo;
	String insholdername;
	int insAmount;
}
public class InstanceVariable1 {

	public static void main(String[] args) {
		employee santu= new employee();
		santu.empid=02;
		santu.empname="santosh";
		santu.job="analyst";
		santu.sal=10000;
		System.out.println("empid: "+santu.empid);
		System.out.println("empname: "+santu.empname);
		System.out.println("job: "+santu.job);
		System.out.println("sal:  "+santu.sal);
		System.out.println("---------------------");
		dept civil=new dept();
		civil.deptno=01;
		civil.deptname="civil engineering";
		civil.deptloc="uvce";
		civil.depthead="Govindraju";
		System.out.println("deptno: "+civil.deptno);
		System.out.println("deptname: "+civil.deptname);
		System.out.println("deptloc: "+civil.deptloc);
		System.out.println("depthead: "+civil.depthead);
		System.out.println("----------------------");
		insurance bajaj=new insurance();
		bajaj.insNo=21;
		bajaj.insholdername="Nikhil";
		bajaj.insname="bajaj allianz";
		bajaj.insAmount=50000;
		System.out.println("insno: "+bajaj.insNo);
	    System.out.println("insholdername: "+bajaj.insholdername);
		System.out.println("insname: "+bajaj.insname);
	    System.out.println("insAmount: "+bajaj.insAmount);
	    System.out.println("----------------------");

	}

}
