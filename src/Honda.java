import net.bytebuddy.implementation.bind.annotation.Super;

public class Honda extends Vehicle {
	
	String Type = "Crossover";
	
	public Honda()
	{
		//super();
		System.out.println("Honda Creator");
	
		
	}
	
	public void getStringData()
	{
		System.out.println(super.Type);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda h = new Honda();
		//h.getStringData();

	}

}
