package ej2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Producto {
	 	private IntegerProperty codigo = new SimpleIntegerProperty();
	    private StringProperty nombre = new SimpleStringProperty();
	    private DoubleProperty precio = new SimpleDoubleProperty();
	    private IntegerProperty codigo_fab = new SimpleIntegerProperty();
	    
	public Producto(int codigo, String nombre, double precio, int codigo_fab) {
		this.codigo.set(codigo);
		this.nombre.set(nombre);
		this.precio.set(precio);
		this.codigo_fab.set(codigo_fab);
     
	}

	public IntegerProperty getCodigo() {
		return codigo;
	}

	public void setCodigo(IntegerProperty codigo) {
		this.codigo = codigo;
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}

	public DoubleProperty getPrecio() {
		return precio;
	}

	public void setPrecio(DoubleProperty precio) {
		this.precio = precio;
	}

	public IntegerProperty getCodigo_fab() {
		return codigo_fab;
	}

	public void setCodigo_fab(IntegerProperty codigo_fab) {
		this.codigo_fab = codigo_fab;
	}
	
}
   