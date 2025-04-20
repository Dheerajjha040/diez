

public class ChildClass extends ParentClass {
	
	int p;
	
	public void gear()
	{
		System.out.println("child Class gear");
		
	}
	
	
	public void brakes()
	{
		System.out.println("child Class brakes");
		
	}
	
	
	public void engine()
	{
		System.out.println("child Class engine");
		
	}
	
	public void color()
	{
		System.out.println("child Class color");
		
	}
	
	public static void main(String[] args) {
		
		ParentClass pc = new ParentClass();
		
		ChildClass c = new ChildClass(); 
		c.brakes();
		c.gear();
		c.engine();


		

	}

	

}
