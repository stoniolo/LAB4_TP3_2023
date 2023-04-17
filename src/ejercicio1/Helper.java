package ejercicio1;

public class Helper {
	
	public static boolean verificarDniInvalido(String dni) throws DniInvalido
	{
		boolean result = dni.matches("[0-9]{1,8}");
		
		if(!result) 
		{
			throw new DniInvalido();
		}
			
		return result;

	}
	
}
