package ej1;

import javafx.beans.property.*;

public class Alumno {
	  
	 private IntegerProperty id = new SimpleIntegerProperty();
	 private StringProperty nombre = new SimpleStringProperty();
	 private StringProperty apellido1 = new SimpleStringProperty();
	 private StringProperty apellido2 = new SimpleStringProperty();
	 private StringProperty fecha_nacimiento = new SimpleStringProperty();
	 private StringProperty es_repetidor = new SimpleStringProperty();
	 private StringProperty telefono = new SimpleStringProperty();
	
	 public Alumno(int id, String nombre, String apellido1, String apellido2,String fecha_nacimiento,
			String es_repetidor, String telefono) {
		super();
		this.id.set(id);
		this.nombre.set(nombre);
		this.apellido1.set(apellido1);
		this.apellido2.set(apellido2);
		this.fecha_nacimiento.set(fecha_nacimiento);
		this.es_repetidor.set(es_repetidor);
		this.telefono.set(telefono);
	}
	public StringProperty getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(StringProperty fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
	}
	public StringProperty getNombre() {
		return nombre;
	}
	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}
	public StringProperty getApellido1() {
		return apellido1;
	}
	public void setApellido1(StringProperty apellido1) {
		this.apellido1 = apellido1;
	}
	public StringProperty getApellido2() {
		return apellido2;
	}
	public void setApellido2(StringProperty apellido2) {
		this.apellido2 = apellido2;
	}
	public StringProperty getEs_repetidor() {
		return es_repetidor;
	}
	public void setEs_repetidor(StringProperty es_repetidor) {
		this.es_repetidor = es_repetidor;
	}
	public StringProperty getTelefono() {
		return telefono;
	}
	public void setTelefono(StringProperty telefono) {
		this.telefono = telefono;
	}
	 
	 
	 
}
