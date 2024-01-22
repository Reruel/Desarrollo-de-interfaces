package paqueteExamenParcial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class VentanaMenu extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(() -> { // Con esta función evitamos problemas de multiproceso
			VentanaMenu examen = new VentanaMenu(); // Aquí llamamos al constructor
			examen.setVisible(true); // Con esto mostramos la ventana
		});
	}

	public void agregarBoton(String nombreBoton, int x, int y) {
		JButton boton = new JButton(nombreBoton);
		boton.setBounds(x, y, 100, 50);
		Container panelPrincipal = null;
		panelPrincipal.add(boton);

	}

	public VentanaMenu() {
		setTitle("Examen práctico"); // Aquí le ponemos nombre/título al JFrame
		setBounds(0, 0, 400, 300); // Aquí establecemos el tamaño por píxeles
		setLocation(300, 300); // Aquí establecemos las coordenadas
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Esto es para que se cierren los procesos al cerrar la ventana
		setLayout(new BorderLayout());

		JPanel panelPrincipal = new JPanel(); // Panel que va a contener los otros dos paneles posteriores

		JPanel panelNorte = new JPanel(); // Aquí creamos el panel que va a ir arriba
		JPanel panelSur = new JPanel(); // Aquí creamos el panel que va a ir abajo

		JPanel cerrarAbajo = new JPanel();
		JButton botonCerrar = new JButton("Cerrar");

		// BOTONES

		// Aquí creamos el panel que va a contener el panel norte, el sur y los
		// mensajes. Con un bucle recorremos para crear los botones (hay dos bucles
		// porque uno ocupa la posición norte y el otro ocupa la posición sur. Le
		// establecemos el mensaje que va a aparecer, detenemos el proceso cuando
		// se cierra, lo hacemos visible y le establecemos el tamaño.
		JPanel botonPanel = new JPanel();
		JPanel panelMensaje = new JPanel();
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Botón " + i);
			boton.setBackground(Color.CYAN);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					JFrame ventanaNueva = new JFrame();
					ventanaNueva.setSize(200, 200);
					ventanaNueva.setVisible(true);
					ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaNueva.add(new JLabel("Se ha pulsado el boton: " + textoBoton));
					
				}
			});
			panelNorte.add(boton); // Aquí añadimos los botonesdel bucle en el panel de arriba
		}

		for (int i = 4; i <= 6; i++) {
			JButton boton = new JButton("Botón " + i);
			boton.setBackground(Color.CYAN);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					JFrame ventanaNueva = new JFrame();
					ventanaNueva.setSize(200, 200);
					ventanaNueva.setVisible(true);
					ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaNueva.add(new JLabel("Se ha pulsado el botón: " + textoBoton));
				}
			});
			panelSur.add(boton); // Aquí añadimos los botones del bucle en el panel de abajo
		}
		add(panelNorte, BorderLayout.NORTH); // Aquí los posicionamos a ambos, uno en el norte y otro en el sur
		add(panelSur, BorderLayout.SOUTH);

		
		
		// MENU
		// En este apartado creamos la barra de menú con JMenuBar y le vamos añadiendo los diferentes botones dentro del menu al cuál llamaremos "Botones".
		
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu();
		JMenuItem boton1, boton2, boton3, boton4, boton5, boton6;

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menu = new JMenu("Botones");
		menuBar.add(menu);

		boton1 = new JMenuItem("Botón 1");
		boton1.addActionListener(this);
		menu.add(boton1);

		boton2 = new JMenuItem("Botón 2");
		boton2.addActionListener(this);
		menu.add(boton2);

		boton3 = new JMenuItem("Botón 3");
		boton3.addActionListener(this);
		menu.add(boton3);

		boton4 = new JMenuItem("Botón 4");
		boton4.addActionListener(this);
		menu.add(boton4);

		boton5 = new JMenuItem("Botón 5");
		boton5.addActionListener(this);
		menu.add(boton5);

		boton6 = new JMenuItem("Botón 6");
		boton6.addActionListener(this);
		menu.add(boton6);

	}

	private void Color(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
