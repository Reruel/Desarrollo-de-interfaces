package interfacesGraficas3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Ejercicio1 extends JFrame {

	private JLabel etiquetaMensaje;

	public Ejercicio1() {
		setTitle("Ejemplo con Dos Contenedores"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLocation(500,400);

		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();

		etiquetaMensaje = new JLabel("Mensaje: ");
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					etiquetaMensaje.setText("Mensaje: " + textoBoton);
				}
			});
			panelBotones.add(boton);
		}
		setLayout(new BorderLayout());
		add(panelBotones, BorderLayout.SOUTH);
		add(panelMensaje, BorderLayout.CENTER);
		panelMensaje.add(etiquetaMensaje);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Ejercicio1();
			}
		});

	}
}