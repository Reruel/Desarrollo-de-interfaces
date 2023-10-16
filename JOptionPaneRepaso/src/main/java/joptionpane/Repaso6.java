package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager; //Esto es para poner en español el texto de los botones

public class Repaso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UIManager.put("OptionPane.yesButtonText", "Sí");
		UIManager.put("OptionPane.noButtonText", "No");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");

		String presentacion = JOptionPane.showInputDialog(null, "¿Cómo te llamas?", "Preséntate",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Hola " + presentacion);

		int codigo = JOptionPane.showConfirmDialog(null, "¿Quieres un euro para una buena causa?", "Donación",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

		if (codigo == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Has pulsado SI");
		} else if (codigo == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Has pulsado NO");
		} else {
			JOptionPane.showMessageDialog(null, "Has pulsado Cancelar");
		}
	}
}
