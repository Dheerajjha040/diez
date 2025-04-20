import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[] = { 1, 1, 5, 5, 5, 8, 3, 8, 5, 3, 4, 4, 4, 9, 6, 6 };

		ArrayList<Integer> as = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			
			int count = 0;
			if (!as.contains(a[i])) {
				as.add(a[i]);
				count++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
					 count++;
						
					}
				}
				
				System.out.println("This Numnber   "  +a[i]+  " Occurence is "  +count);

			}
	
		}
		System.out.println(as);

	}

}
