
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int a[] = new int[5];
		
	//	int b[] = new int[10];
		

		
		int[][] b = {{2,4,5},{3,0,10},{1,2,9}};
		int min = b[0][0];
		int k=0;
		int max=0;
	
		for(int i=0;i<b.length;i++)
		{

			for(int j=0;j<b[i].length;j++)
			{
				if(b[i][j]<min)
				{
					min =b[i][j];
					k=j;
				
		
				}
			
				
			}
			
			if(b[i][k]>max)
			{
				max =b[i][k];
			
			
	
			}
	
		}
		
		System.out.println("This is minimum"+min);
		
		System.out.println("This is maximum "+max);

		
		
		
	}

}
