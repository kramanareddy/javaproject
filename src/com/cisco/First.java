package com.cisco;
public class First 
{
	public int eid;
	public String ename;
	public double esalary;
	
	public First()
	{
		System.out.println("no argument const");
		
	}
	
	public First(int x)
	{
		System.out.println("int argument const");
		
	}
	public First(int x,String y)
	{
		System.out.println("int,string argument const");
		
	}
	public First(int x, String y,double z)
	{
		this.eid=x;
		this.ename=y;
		this.esalary=z;
		System.out.println("eid=="+eid);
		System.out.println("ename=="+ename);
		System.out.println("esalary=="+esalary);
		
		
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		First r = new First(10,"ramana",54000.500f );
		First r1 = new First(20,"siva",65200);
		First r2 = new First(30,"ravi",368400);
		
		// TODO Auto-generated method stub

	}

}
