package com.sgtesting.Methods;
class TablesDisplay
{
	void TableD(int a)	
	{
		for(int i=1;i<=10;i++)
		{
			int tab=i*a;
			System.out.println(tab);
		}
	}
}
public class MethodTablesDisplay {

	public static void main(String[] args) {
             int a=9;
		TablesDisplay a1= new TablesDisplay();
		a1.TableD(a);
		System.out.println("************");
		a1.TableD(6);
	}

}
