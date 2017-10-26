package Sep28th;

public class Course {

	
	public static void main(String[] args)
	{
		Passport p1= new Passport();
		
		p1.setPid(190);
		p1.setPob(850);
		System.out.println(p1.getPid());
		System.out.println(p1.getPob());
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());

	}

}
