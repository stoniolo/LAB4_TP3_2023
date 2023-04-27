package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import ejemplo4_Treeset.Persona2;
import ejercicio1.Helper;

public class Main {

	public static void main(String[] args) {

		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		Archivo archivo2 = new Archivo();
		archivo2.setRuta("Resultado.txt");
		
		Set<Persona> personasSet = new TreeSet<Persona>();
				
		if (archivo.existe()) {
			System.out.println("Existe archivo 1 ");
		} else {
			System.out.println("No existe archivo 1 ");
		}

		if (!archivo2.existe()) {
			System.out.println("Existe Archivo 2 ");
		} else {
			System.out.println("No existe Archivo 2 ");
		archivo2.creaArchivo();
		}
		System.out.println("\n A CONTINUACION LEE DE A LINEAS: ");
		
		personasSet=archivo.lee_lineas();
		
		Iterator<Persona> it = personasSet.iterator();
		System.out.println("************");
		while(it.hasNext())
		{
			Persona p = (Persona) it.next();
			System.out.println(p.toString());
			archivo2.escribe_lineas(p.toString());
		}
		
		
		
		
	}
}
