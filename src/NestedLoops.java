
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("*******Pyramid********");
		

		int k = 1;

		for (int i = 4; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(k+" ");
				k++;

			}
			System.out.println();
	
		}
		System.out.println();
		System.out.println("*******INVERTED Pyramid********");
		
		int a = 1;

		for (int b = 1; b <= 4; b++) {

			for (int c = 1; c <= b; c++) {
				System.out.print(a+" ");
				a++;

			}
			System.out.println();
	
		}


	
	System.out.println();
	System.out.println("*******INVERTED Pyramid New way ********");
	

	for (int e = 1; e <= 4; e++) {

		for (int f = 1; f <= e; f++) {
			
			System.out.print(f+" ");

		}
		System.out.println();

	}

}


}

/*
 * 1 2 3 4 5 6 7 8 9 10
 */
