package joptionpane;

import javax.swing.JOptionPane;

public class Repaso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo = JOptionPane.showConfirmDialog(null, "¿Quieres un euro para una buena causa?", "Donación",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

		if (codigo == JOptionPane.YES_OPTION) {
			System.out.println("Has pulsado en SI");
		} else if (codigo == JOptionPane.NO_OPTION) {
			System.out.println("Has pulsado en NO");
		} else {
			System.out.println("Has pulsado en cancelar");
		}
	}
}
