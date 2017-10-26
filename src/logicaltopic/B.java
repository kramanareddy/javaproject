package logicaltopic;

public class B {

	
	public static void main(String[] args) 
	{
		A a= new A();
		
		a.setpid(28);
		a.setpname("ramana");
		//int i=a.getid();
		System.out.println(a.getid());
		//a.setpname("ramana");
		System.out.println(a.getpname());

	//	String s1= a.getpname();
		a.setage(29);
		//int i1=a.getage();
		
		
		System.out.println(a.getage());
		a.setpassport("ramanareddy");
		a.getpassport();
		System.out.println(a.getpassport());


	}

}
