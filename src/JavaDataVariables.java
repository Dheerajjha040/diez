
public class JavaDataVariables {

	public static void main(String[] args) {
		
		int num = 5;
		String str = "DAFZA";
		char ch = 'a';
		double dec = 10.2;
		boolean myCard = true;
		
		System.out.println(num);
		System.out.println(str);
		System.out.println(ch);
		System.out.println(dec);
		System.out.println(myCard);
		System.out.println(num+" is store in int variable");
		
		//Arrays 
		
		int[] arr = new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr1 = {12,23,45,23,1};
		System.out.println(arr1.length);
		
		// For Loop 	
		
		for(int i=0;i<arr1.length;i++)
		{
		
			System.out.println(arr1[i]);
		}
		
		//different way of using the for lopp 
		 // for (datatype var : nameOfArray)

		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
