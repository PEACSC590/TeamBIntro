public class moo
{
	public static void main(String[] args) {
		int size = 5;
		int[][] numbers = new int[size][size];
		for (int i=0; i< size; i++) {
			for (int j=0; j< size; j++) {
				numbers[i][j] = (int) (Math.random() * 200  - 100);
				for (int k=0; k<(3 - Integer.toString(numbers[i][j]).length()); k++) {
					System.out.print(" ");
				}
				System.out.print(numbers[i][j] + " " );
			}
			System.out.println("");
		}
		
		boolean no_saddle = true;
		for (int i=0;i<size;i++) {
			for (int j=0; j<size; j++) {
				boolean t = true;
				// check row condition
				for (int l=0; l<size; l++) {
					if (numbers[i][j] < numbers[i][l]) {
						t = false;
					}
				}
				// check column condition
				for (int k=0; k<size; k++) {
					if (numbers[i][j] > numbers[k][j]) {t= false;}
				}
				if (t == true) {
					no_saddle = false;
					System.out.println("Row "+(i+1)+" Column "+(j+1)+" is a saddle point");
				}
			}
		}
		if (no_saddle) {
			System.out.println("No saddle points");
		}

		//output

		//1 comment

	}

}

