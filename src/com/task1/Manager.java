package com.task1;

public class Manager 
{
	Teamlead Tl;
	int x;
	public Manager(Teamlead ctl)
	{
		this.Tl=ctl;
	//	System.out.println("value of ct1=="+Tl);
	}
	public void dowork()
	
	{
		//Tl= new  Teamlead();
		Tl.dowork();
		System.out.println(" manager task completed");
	
	}

}
