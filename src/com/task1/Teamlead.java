package com.task1;

public class Teamlead 
{
Developer dev;
public Teamlead(Developer DE)
{
	this.dev = DE;
	//System.out.println(" value of dev=="+dev);
	//System.out.println("value of  new dev==" +DE);
}
public void dowork()
{ 
//	dev = new Developer();
	//System.out.println("task assign to developer");
	dev.dowork();
	System.out.println("team lead task completed");
	
}

}
