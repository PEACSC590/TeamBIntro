
public class moo
{
	public static void main(String[] args) {
		int[][] numbers = new int[5][5];
		for (int i=0; i< 5; i++) {
			for (int j=0; j< 5; j++) {
				numbers[i][j] = (int) (Math.random() * 200  - 100);
				//System.out.print(numbers[i][j] + " " );
			}
		}
		
		for (int i=0;i<5;i++) {
			for (int j=0; j<5; j++) {

				boolean t = true;
				// check row
				for (int l=0; l<5; l++) {
					if (numbers[i][j] < numbers[i][l]) {t = false;}
				}
				// check column
				for (int k=0; k<5; k++) {
					if (numbers[i][j] > numbers[k][j]) {t= false;}
				}
				if (t == true) {System.out.print("("+i+","+j+")");}
			}
		}

		//output

		//1 comment
		

	}
}
