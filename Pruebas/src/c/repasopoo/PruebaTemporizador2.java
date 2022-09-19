package c.repasopoo;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);

	}

}



class Reloj{
	
//	public Reloj(int intervalo, boolean sonido) {
//		
//		this.intervalo=intervalo;
//		this.sonido=sonido;
//		
//	}
//	
	
	//Sonido es final porque la clase interna esta accediendo a ella mientras que intervalo no se usa en la clase interna por lo que no es final
	
	public void enMarcha(int intervalo,final boolean sonido) {
		
		//clase interna local= clase declarada dentro de un metodo sin modificador de acceso
		class DameLaHora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				
				Date ahora=new Date();
				
				System.out.println("Te pongo la hora cada 3s: "+ ahora);
				
				if(sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente= new DameLaHora2();
		
		Timer mitemporizador=new Timer(intervalo, oyente);
		
		mitemporizador.start();
	}
	

	

	
}
