package interfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio3dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame("Ventana con botón");
		String nombre = "Platelminto";

		ventana.setSize(400, 200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

		JButton boton = new JButton("Haz click aquí");
		ventana.add(boton);
		

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos personales",
						JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(ventana, "Gracias","Título de la ventana", JOptionPane.ERROR_MESSAGE);
				byte opcion = (byte) JOptionPane.showConfirmDialog(ventana, "¿Tienes pipí " + nombre + "? uwu");
				if (opcion==0) {
					JOptionPane.showMessageDialog(ventana, "Pues ve al baño, hostia.");
				}else if (opcion==1) {
					JOptionPane.showMessageDialog(ventana, "¿Y caca?");
				}
			}

		});
		

	}
}
