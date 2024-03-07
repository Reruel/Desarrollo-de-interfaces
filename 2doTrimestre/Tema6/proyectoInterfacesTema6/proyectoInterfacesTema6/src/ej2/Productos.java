package ej2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Productos {
	 private IntegerProperty codigo = new SimpleIntegerProperty();
	 private StringProperty nombre = new SimpleStringProperty();
	 private DoubleProperty precio = new SimpleDoubleProperty();
	 private IntegerProperty codigoFabricante = new SimpleIntegerProperty();
	
	 public Productos(int codigo, String nombre, double precio,
			int codigoFabricante) {
		super();
		 this.codigo.set(codigo);
		this.nombre.set(nombre);
        this.precio.set(precio);
        this.codigoFabricante.set(codigoFabricante);
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
	public IntegerProperty getCodigoFabricante() {
		return codigoFabricante;
	}
	public void setCodigoFabricante(IntegerProperty codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}
	 
	public StringProperty nombreProperty() {
        return nombre;
    }
	
	  public DoubleProperty precioProperty() {
	        return precio;
	    }
	  
	 public IntegerProperty codigoProperty() {
		 return codigo;
	 }
	 
	 public IntegerProperty codigoFProperty() {
		 return codigoFabricante;
		 
	 }
}
