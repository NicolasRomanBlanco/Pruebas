package a.repasobasico;
import javax.swing.*;
public class Repaso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long resultado=1;
		
		long numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));
		
		for(long i=numero;i>0;i--) {
			
			resultado=resultado*i;
		}
		
		System.out.println("El factorial de "+numero+" es: "+resultado);
	}

}
