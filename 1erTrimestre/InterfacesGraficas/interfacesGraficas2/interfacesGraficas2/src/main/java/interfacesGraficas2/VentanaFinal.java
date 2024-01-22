package interfacesGraficas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaFinal extends JFrame {
	private JPanel panel;
	private JPanel panel2;
	private
	void inicializarVentanaF() {
		setSize(300,300);
		setTitle("Ejemplo con 2 botones");
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		panel2 = new JPanel();
		panel2.setLayout(null);
		getContentPane().add(panel);
		getContentPane().add(panel2);
	}
	private void agregarBotonF(String nombreBoton, int x, int y) {
		JButton boton = new JButton(nombreBoton);
		boton.setBounds(x,y,100,50);
		panel.add(boton);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel texto = new JLabel("has pulsado el boton " + nombreBoton );
				texto.setBounds(200, 200,200, 100);
				panel2.add(texto);
			}
		});
	}
	
	public static void main(String[] args) {
		VentanaFinal ventana = new VentanaFinal();
		ventana.inicializarVentanaF();
		String[] botones = {"Aceptar", "Cancelar", "Siguiente","Anterior"};
		byte cont=1;
		for(String s : botones) {
			ventana.agregarBotonF(s, (100*cont), (50));
			cont++;
		}
	}
}
