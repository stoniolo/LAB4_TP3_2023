package ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//////Ejercicio A
		String dni = JOptionPane.showInputDialog("Ingrese un DNI por favor");
		try {
			Helper.verificarDniInvalido(dni);
			System.out.println("El DNI ingresado fue: " + dni);
		} catch (DniInvalido e) {
			e.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
}
