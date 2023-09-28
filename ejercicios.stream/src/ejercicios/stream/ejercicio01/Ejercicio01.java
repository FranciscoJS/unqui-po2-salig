package ejercicios.stream.ejercicio01;

public class Ejercicio01
{
	
	
	private String nombre = "Fran";
	
	
	public boolean evaluarPrefijo_(String prefijo, String palabra)
	{
		int contador = 0;
		while( prefijo.charAt(contador) == palabra.charAt(contador) )
		{
			contador++;
		}
		return ( contador == prefijo.length() );
	}
	
	
	method primerDigitoDe_(String palabra, String prefijo)
	{
		
	}
	
// Se puede hacer con .startswith(String) de una forma más corta.

}
