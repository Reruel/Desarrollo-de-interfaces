package interfazGrafica;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana=new JFrame("Mi primera ventana");
		ventana.setSize(400,400);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel texto=new JLabel("Hola Alberto");
		ventana.getContentPane().add(texto);
		
		
		
		/*JFrame ventana=new JFrame("primera ventana");
		ventana.setSize(400,400);
		ventana.setVisible(true);*/
	}

}

