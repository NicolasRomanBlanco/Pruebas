package repasopoo;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente= new DameLaHora();
		
		//Esto tambien funciona:
		//ActionListener oyente= new DameLaHora();
		
		Timer mitemporizador=new Timer(5000, oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);

		

	}

}


class DameLaHora implements ActionListener{
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("Pongo la hora cada 5 segundos: "+ahora);
		
		//Toolkit: Utiliza recursos del sistema operativo en nuestros programas java (mira https://docs.oracle.com/javase/7/docs/api/ para mas info)
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}