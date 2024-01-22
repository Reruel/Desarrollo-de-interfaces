package interfacesGraficas2;

public class PrincipalEjercicio2 {

	public static void main(String[] args) {
			Ventana5Metodos ventana = new Ventana5Metodos();
			ventana.inicializarVentana();
			String[] botones = {"Aceptar", "Cancelar", "Siguiente","Anterior", "Redimensionar"};
			
			byte cont=1;
			for(String s : botones) {
				ventana.agregarBoton(s, (100*cont), (50));
				cont++;
			}

	}

}
