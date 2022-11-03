package com.sgtesting.threadandrunmethod1;

class MyThread implements Runnable
{

	void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even no:"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void run() {
		displayEvenNumbers();
		
	}

}
public class ThreadDemo1 {

	public static void main(String[] args) {

		MyThread job=new MyThread();
		Thread t1=new Thread(job);
		t1.start();
	}

}
