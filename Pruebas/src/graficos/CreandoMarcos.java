package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1= new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame {
	
	public miMarco(){
		
		//setSize(500, 300);
		//setLocation(500, 300);
		
		//pos x pos y, size x, size y
		setBounds(500,300, 550,250);
		
		//se puede modificar el size 
		//setResizable(true);
		
		//pantalla completa
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi ventana");
		
	}
	
}