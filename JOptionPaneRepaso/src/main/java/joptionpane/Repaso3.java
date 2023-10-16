package joptionpane;

import javax.swing.JOptionPane;

public class Repaso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog(null,"Dime tu nombre", "Datos personales",
				JOptionPane.QUESTION_MESSAGE);
				
				if (nombre !=null) {
					System.out.println("Le has dado ok, tu nombre es "+nombre);
				} else {
					System.out.println("Le has dado a cancelar");
				}
	}

}
