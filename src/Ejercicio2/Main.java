package Ejercicio2;

public class Main {

	public static void main(String[] args) {

		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
//		Archivo archivo2 = new Archivo();
//		archivo2.setRuta("Resultado.txt");

		if (archivo.existe()) {
			System.out.println("Existe archivo 1 ");
		} else {
			System.out.println("No existe archivo 1 ");
		}

//		if (!archivo2.existe()) {
//			System.out.println("Existe Archivo 2 ");
//		} else {
//			System.out.println("No existe Archivo 2 ");
//			archivo2.creaArchivo();
//		}
		System.out.println("\n A CONTINUACI�N LEE DE A LINEAS: ");
		archivo.lee_lineas(); 
		
	}
}
