package interfacesGraficas3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Ejercicio3 extends JFrame{

	private JLabel texto;
	private JLabel textoBienvenida;
	
	public Ejercicio3() {
		setTitle("Ejemplo con Dos Contenedores"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLocation(400,400);

		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();
		JPanel panelMensaje2 = new JPanel();
		JPanel panelBotones2 = new JPanel();

		texto = new JLabel("Mensaje: ");
		textoBienvenida= new JLabel("Bienvenido: ");
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			boton.setBackground(Color.GREEN);
			boton.setForeground(Color.BLACK);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					texto.setText("Mensaje: " + textoBoton);
					textoBienvenida.setText("Bienvenido: " + textoBoton + " Otra vez");
				}
			});
			panelBotones.add(boton);
		}
		
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Botonn " + i);
			boton.setBackground(Color.BLUE);
			boton.setForeground(Color.WHITE);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					JFrame ventanaNueva = new JFrame();
					ventanaNueva.setSize(200,200);
					ventanaNueva.setVisible(true);
					ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaNueva.add(new JLabel("Has pulsado el boton: " + textoBoton));
					
				}
			});
			panelBotones2.add(boton);
		}
		
		
		
		setLayout(new BorderLayout());
		add(panelBotones, BorderLayout.EAST);
		add(panelBotones2,BorderLayout.WEST);
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
				new Ejercicio3();
			}
		});

	}

}
