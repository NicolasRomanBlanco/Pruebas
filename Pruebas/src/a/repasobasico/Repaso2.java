package a.repasobasico;
import javax.swing.*;
public class Repaso2 {

	public static void main(String[] args) {
		
		String genero="";
		do {
			genero=JOptionPane.showInputDialog("Introduce tu genero(H/M)");
		
		}while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false);{
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
			int pesoideal=0;
			if (genero.equalsIgnoreCase("H")) {
				pesoideal=altura-110;
			}
			else if (genero.equalsIgnoreCase("M")) {
				pesoideal=altura-120;
			}
			System.out.println("Peso ideal: "+ pesoideal+" kg");
		}
	}

}
