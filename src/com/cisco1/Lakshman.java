package com.cisco1;

import com.cisco.Ram;

public class Lakshman extends Ram {

	Lakshman()
	{
		super(12);
		System.out.println("default laxman");
		
	}
	Lakshman(int x)
	{
		super(12);
		System.out.println("int arg constructor of laxman value of x=="+x);
		
	}
	public static void main(String[] args) 
	{
		Lakshman l=new Lakshman(22);

	}

}
