import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Dheeraj");
		a.add("Akash");
		a.add(0,"Naman");
	
		boolean b = a.isEmpty();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.contains("New"));
		
		
	}

}
