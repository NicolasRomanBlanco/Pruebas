package a.repasobasico;

public class Repaso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int array[][]= new int [4][5];
		
		array[0][0]=1;
		array[0][1]=4;
		array[0][2]=5435;
		array[0][3]=64;
		array[0][4]=23;
		
		array[1][0]=45;
		array[1][1]=12;
		array[1][2]=654;
		array[1][3]=23;
		array[1][4]=11;
		
		array[2][0]=10;
		array[2][1]=187;
		array[2][2]=15;
		array[2][3]=167;
		array[2][4]=143;
		
		array[3][0]=1435;
		array[3][1]=145;
		array[3][2]=12;
		array[3][3]=16;
		array[3][4]=18;*/
		
		int [][]array= {
				
				{10,15,18,19,21},
				{43,41,543,12,54},
				{23,11,43,12,574},
				{13,21,443,2,4}
		};
		
		for(int[]fila:array) {
			
			System.out.println();
			
			for(int z: fila) {
				
				System.out.print(z+" ");
				
			}
		}
		
	}

}
