package Ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ejercicio1.Helper;

public class Archivo {

	private String ruta;

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public boolean existe() {
		File archivo = new File(ruta);
		if (archivo.exists())
			return true;
		return false;
	}

	public Set<Persona> lee_lineas() {
		
		Set<Persona> personasSet = new TreeSet<>();
		try {
			BufferedReader miBuffer = new BufferedReader(new FileReader(ruta));
			String linea;
			while ((linea = miBuffer.readLine()) != null) {
				
				String cadena[] = linea.split("-");
				String nombre = cadena[0].trim();
				String apellido = cadena[1].trim();
				String dni = cadena[2].trim();
				
				if(!(Helper.verificarDni(dni))) {
					continue;					
				}
				Persona persona = new Persona(nombre, apellido, Integer.parseInt(dni));
				System.out.println(persona.toString());
				personasSet.add(persona);
				
			}
			miBuffer.close();
			List<Persona> personaList = new ArrayList<>(personasSet);
			Collections.sort(personaList);
		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		return personasSet;
	}

	public void escribe_lineas(String frase) {
		try {
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);

			miBuffer.write(frase+'\n');

			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

	public boolean creaArchivo() {
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

}
