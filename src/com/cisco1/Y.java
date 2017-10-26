package com.cisco1;

import com.cisco.Z;

public class Y extends Z
{
	int x= 40;
protected void y()
{
	System.out.println("value of x=" +super.x);
	System.out.println("value of y class");

}
protected void y(int x)
{
	System.out.println("value of x=" +super.x);
	System.out.println("value of y  int parameter constructor class");

}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Y y1=new Y();
		
		y1.y(15);
		// TODO Auto-generated method stub

	}

}
