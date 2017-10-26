package abstract1;

public  abstract class Three
{
int x=40;
String s1="slokam";
public abstract void M1();
Three( int y)
{
	System.out.println(" int arg constructor");
	
}

static
{
	System.out.println("static block executed at the time class loading");
	
}
{
	System.out.println("instance block executed after creating object");
	
}
}


