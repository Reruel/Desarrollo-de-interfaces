package interfacesGraficas3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Ejercicio2 extends JFrame{
	private JLabel texto;
	private JLabel textoBienvenida;
	
	public Ejercicio2() {
		setTitle("Ejemplo con Dos Contenedores"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();
		JPanel panelMensaje2 = new JPanel();

		texto = new JLabel("Mensaje: ");
		textoBienvenida= new JLabel("Bienvenido: ");
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					texto.setText("Mensaje: " + textoBoton);
					textoBienvenida.setText("Bienvenido: " + textoBoton + " Otra vez");
					
				}
			});
			panelBotones.add(boton);
		}
		setLayout(new BorderLayout());
		add(panelBotones, BorderLayout.CENTER);
		add(panelMensaje, BorderLayout.NORTH);
		add(panelMensaje2,BorderLayout.SOUTH);
		panelMensaje2.add(texto);
		panelMensaje.add(textoBienvenida);

		pack();
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Ejercicio2();
			}
		});

	}

}
