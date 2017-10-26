package com.cisco;

public class B extends Z
{
	 static int x=23;
	
		public static void m1()
		{
			//this.x=x;
			System.out.println("value of x=="+x);
		}


	
public B(int i){
	System.out.println(i);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
B b= new B(10);
m1();
	}

}
