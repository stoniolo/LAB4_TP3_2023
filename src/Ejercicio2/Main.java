package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		if (archivo.existe()) {
			System.out.println("Existe archivo");
		}
		else
		{
			System.out.println("No existe archivo");
		}
		
		System.out.println("\n A CONTINUACI�N LEE DE A LINEAS: ");
		archivo.lee_lineas();
		
	}	
}
