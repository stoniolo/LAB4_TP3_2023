/**
 * 
 */
package Ejercicio2;

import java.util.Objects;

/**
 * @author nicolaslopez
 *
 */
public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellido;
	private int dni;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 */
	public Persona(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

	@Override
	public int compareTo(Persona o) {
		
		int compare = this.getApellido().compareTo(o.getApellido());
		
		if (compare < 0) {  
		    //Es lexicográficamente Menor.
			return -1;
		}
		else if (compare > 0) {
		    //Es lexicográficamente Mayor. 
			return 1;
		}
		else {  
		    //Son lexicográficamente iguales.
			return 0;
		} 				
	}	
}
