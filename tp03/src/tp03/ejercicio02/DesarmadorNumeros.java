package tp03.ejercicio02;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class DesarmadorNumeros
{
	
	public int nroDeMayorCantidadParesEn_(List<Integer> listaNumeros)
	{
		int nroActual = 0;
		for( int numero: listaNumeros )
		{
			if( this.cantidadDigitosParesDelNro_(nroActual) < this.cantidadDigitosParesDelNro_(numero) )
			{
				nroActual = numero;
			}
		}
		return nroActual;
	}
	
	
	public int cantidadDigitosParesDelNro_(int nro)
	{
		int contador = 0;
		int nroActual = nro;
		while( nroActual >= 10 || nroActual <= -10  )
		{
			if( this.esPar_(nroActual)  )
			{
				++contador;
			}
			nroActual = nroActual / 10;
		}
		return ( esPar_(nroActual) ? ++contador : contador );
	}
	

	private boolean esPar_(int nro)
	{
		return (nro % 2) == 0;
	}
	
	
}



