package repaso;
import javax.swing.*;

public class Repaso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String [] paises= new String [8];
		
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce País "+ (i+1));
		}
		

		
		for(String e:paises ) {
			
			System.out.println("Pais: "+e);
			
		}
	}

}
