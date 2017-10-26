package abstract1;

public abstract class First 
{
	int x=20;
String s="java";
abstract void M1();
First()
{
	System.out.println(" 0 arg constructor");
}
void M2()	
{
System.out.println(" concrete method");
}
static
{
System.out.println("static block executed at the time loading class");
}
{
	System.out.println("this is instance block it is executed after creation object");
}
	/**
}
	 * @param args
	 */
//	public static void main(String[] args) 
	{
	//	First f=new First();
		
		// TODO Auto-generated method stub

	}

}
