package repaso;

public class Repaso7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array []= new int [150];
		
		for (int i=0;i<array.length;i++) {
			
			array[i]=(int) Math.round(Math.random()*100);
		}
		
		
		for (int e:array) {
			
			System.out.print(e+" ");
		}
	}

}
