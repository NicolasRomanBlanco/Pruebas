package c.repasopoo;
import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Coche Renault= new Coche(); //Instanciar Clase
		
		System.out.println("Este coche tiene "+ Renault.getRuedas() +" ruedas.");
		
		Renault.setMotor(1800);
		
		System.out.println("Este coche tiene un motor "+ Renault.getMotor() +".");
		
		Renault.setColor(JOptionPane.showInputDialog("De que color es el coche?"));
		System.out.println("Este coche es de color "+Renault.getColor() +".");
		
		Renault.setAsientos_cuero(true);
		
		if (Renault.isAsientos_cuero()==true) {
			System.out.println("Este coche tiene asientos de cuero");
		}else{
			System.out.println("Este coche tiene asientos de serie");
		}*/
		
		Coche micoche1= new Coche();
		
		micoche1.setColor("Verde");
		
		Furgoneta mifurgoneta1= new Furgoneta(7,580);
		
		mifurgoneta1.setColor("Rojo");
		
		mifurgoneta1.setAsientos_cuero(true);
		
		mifurgoneta1.setClimatizador(true);
		
		System.out.println(mifurgoneta1.dimeDatosFurgoneta());
		
		
		
		
		
		
	}

}
