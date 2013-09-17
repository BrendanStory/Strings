public class multi {

	public static void main(String[] args) {
		int[][] a = { {  1,  2,  3,  4,  5},
					{  6,  7,  8,  9, 10},
					{ 11, 12, 13, 14, 15} };

		//sumRow(a);
		//sumCol(a);
		sumTotal(a);
		
	}	

	public static void print(int[][] a){
		for (int r = 0; r < a.length ; r++) {
			for (int c = 0; c < a[r].length ; c++) {
				System.out.print(a[r][c] + " ");
			}
		}
	}

	public static void sumRow(int[][] a){

		 int r = 0;
		 int result = 0;

		 for (int c = 0; c < a[r].length; c++) {
		 	result = result + a[r][c];
		 }
		 System.out.println(result);
	}

	public static void sumCol(int[][] a) {

		int result = 0;

		for (int r = 0; r < a.length ; r++) {
			result = result + a[r][0];
		}

		System.out.println(result);
	}

	public static void sumTotal(int[][] a) {

		int result = 0;

		for (int r = 0; r < a.length ; r++) {
			for (int c = 0; c < a[r].length ; c++) {
				result = result + a[r][c];
			}
		}
		System.out.println(result);
	}

	public static void reverseRow(int[][] a) {


	}

	public static void snakeDraft(int players, int rounds) {
		int Array s =  int[players][rounds];

		for (int rounds; ; rounds < a.ength ) {
			
		}
	}

	public static void rectangluarize(int[] a, int rows, int cols)

	rectangularize({1,2,3,4,5,

		={{1.2},
		{3,4},
		{5,6}})
	
}
