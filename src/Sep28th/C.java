package Sep28th;
public class C implements A,B
{
//public class C extends A {
public void M1()
{
	System.out.println(" M1() implemention of Interface A");
}

public void M2()
{
	System.out.println("M2() implemention of Interface A");
}

public void M3()
{
	System.out.println(" M3() implemention of Interface B");
}
public void M4()
{
	System.out.println(" M4() implemention of Interface B");
}
	public static void main(String[] args)
	{
		C c= new C();
          c.M1();
          c.M2();
          c.M3();
          c.M4();
	}

}
