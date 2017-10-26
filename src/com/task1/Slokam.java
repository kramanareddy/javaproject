package com.task1;

public class Slokam {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	
		Developer dev= new Developer();
		Teamlead Tl = new Teamlead(dev);
		Manager m = new Manager(Tl);
		m.dowork();
		// TODO Auto-generated method stub

		
	}

}
