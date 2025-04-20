import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("New");
		hs.add("Old");
		hs.add("Carry");
		hs.add("NotCarry");
		hs.add("View");
		
		System.out.println(hs);
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
		

	}

}
