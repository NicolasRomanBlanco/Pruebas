package repaso;

import javax.swing.JOptionPane;

public class Repaso3 {

	public static void main(String[] args) {
		
		int arroba=0;
		int punto=0;
		
		String mail=JOptionPane.showInputDialog("Introduce mail");

			for(int i=0;i<mail.length();i++) {
				
				if(mail.charAt(i)=='@') {
					arroba++;	
				}
				 
				if(mail.charAt(i)=='.') {
					punto++;
				}
				
			}
			
			if (arroba==1 && punto==1) {
				JOptionPane.showMessageDialog(null,"Correcto");
			
			}
			else {
				if(arroba==0){
					JOptionPane.showMessageDialog(null,"Falta el @");
				}else if(punto==0){
					JOptionPane.showMessageDialog(null,"Falta el punto");
				}else {
					JOptionPane.showMessageDialog(null,"Introduzca un mail correcto");
				}
				
			}
		
	
	}

}
