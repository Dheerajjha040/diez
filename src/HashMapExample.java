import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(0,"Dheeraj");
		hm.put(1,"Kajal");
		hm.put(2,"Anagh");
	
		//System.out.println(	hm.get(0));
		//System.out.println(	hm.remove(1));
		//System.out.println(	hm.size());
		//System.out.println(hm);
		Set sn =hm.entrySet();
		
		
		Iterator i = sn.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mp = (Map.Entry)i.next();
			//System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		
		}
		
	}

}
