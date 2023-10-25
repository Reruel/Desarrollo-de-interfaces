package interfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana=new JFrame("Nueva ventana");
		JButton boton=new JButton("Pulsa aquí");
		boton.setBounds(106,56,109,36);
		ventana.setSize(300,300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		ventana.getContentPane().add(boton);
		ventana.setVisible(true);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos personales",
						JOptionPane.QUESTION_MESSAGE);
			}
		});
		
	}
}
