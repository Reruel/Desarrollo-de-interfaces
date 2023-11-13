package interfacesGraficas2;

public class Principal {

	/*public static void main(String[] args) {
		Ventana5Metodos a = new Ventana5Metodos();
		a.inicializarVentana();
		for(byte i = 1; i<=3; i++) {
			//a.agregarBoton("boton"+i, (100), (50*i));
			a.agregarBoton("boton"+i, (100*i), (50));
		}
	}*/
	
	public static void main(String[] args) {
		Ventana5Metodos ventana = new Ventana5Metodos();
		ventana.inicializarVentana();
		String[] botones = {"boton 1", "boton 2", "boton 3"};
		
		byte cont=1;
		for(String s : botones) {  //forEach. Se van guardando los valores en los String s del array botones
			ventana.agregarBoton(s, (100*cont), (50));
			cont++;
		}
	}

}
