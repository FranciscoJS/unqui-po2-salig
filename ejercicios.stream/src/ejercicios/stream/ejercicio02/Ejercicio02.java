package ejercicios.stream.ejercicio02;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio02
{
	public boolean algunoCumple( List<String> lista, String prefijo )
	{
		boolean encontre = false;
		int i = 0;
		
		while( !encontre && i < lista.size() )
		{
			encontre = lista.get(i).startsWith(prefijo);
			i++;
		}
		return encontre;
	}
	
	/*
	 * Si lo quiero hacer  con Stream ...
	 */

	public boolean algunoCumpleVersionDos( List<String> lista, String prefijo )
	{
		lista.stream().anyMatch( s -> s.startsWith(prefijo) );
	}
	
}





