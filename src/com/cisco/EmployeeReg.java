package com.cisco;

public class EmployeeReg {
	public int eid;
	public String ename;
	public double esalary;
	public EmployeeReg(Object x)
	{
		System.out.println(x);
	}
	public EmployeeReg()
	{
		System.out.println("no argument const");
		
	}
//	public EmployeeReg(Object x)
//	{
//		System.out.println("no argument const");
//		
//	}
	public EmployeeReg(int x,String y)
	{
		this.eid=x;
		this.ename=y;
		System.out.println("no argument const");
		
	}
	public EmployeeReg(int x,String y,double z)
	{
		this.eid=x;
		this.ename=y;
		this.esalary=z;
		System.out.println("eid=="+eid);
		System.out.println("ename=="+ename);
		System.out.println("esalary=="+esalary);
		
	//	System.out.println("no argument const");
		
	}
	
	public static void main(String[] args) 
	{
		EmployeeReg r1 = new EmployeeReg(25,"Reddy",50000);
		
		EmployeeReg r2 = new EmployeeReg(35," kotteReddy",80000);
		
		EmployeeReg r3 = new EmployeeReg(45,"ratna Reddy",30000);
		
		EmployeeReg r4 = new EmployeeReg(r1);
		EmployeeReg r5 = new EmployeeReg(40,"ramana");
		System.out.println(r1);
		
		// TODO Auto-generated method stub

	}

}
