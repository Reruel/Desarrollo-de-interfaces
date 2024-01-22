package interfacesGraficas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana5Metodos extends JFrame{
	private JPanel panel;
	public void inicializarVentana() {
		setSize(300,300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	}
	public void agregarBoton(String nombreBoton, int x, int y) {
		JButton boton = new JButton(nombreBoton);
		boton.setBounds(x,y,100,50);
		panel.add(boton);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaNueva = new JFrame("Nueva ventana");
				if(nombreBoton.equals("Redimensionar")) {
					ventanaNueva.setSize(400,400);
				}else {
					ventanaNueva.setSize(200,200);
				}
				ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				ventanaNueva.add(new JLabel("has pulsado el boton " + nombreBoton));
				ventanaNueva.setVisible(true);
			}
		});
	}
	
}

