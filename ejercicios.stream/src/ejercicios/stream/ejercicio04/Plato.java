package ejercicios.stream.ejercicio04;
import java.util.Comparator;

public class Plato implements Comparable<Plato>
{
	private String nombre;
	private double precioBase;
	
	
	Plato(String nombre, double precioBase)
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	
	public String getNombre()
	{
		return nombre;
	}
	
	
	public double precioConIva()
	{
		return this.precioBase * 1.21;
	}

	@Override
	public int compareTo(Plato o)
	{
		if( this.precioConIva() > o.precioConIva() )
		{
			return 1;
		}
		else if( this.precioConIva() < o.precioConIva() )
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	/*
	 	El método compareTo debe devolver 1 si comparando es mayor al comparado.
	 	-1 si es menor
	 	0 si es igual
	 	
	 	La función de arriba, compareTo, se podría hacer restando/sumando los valores
	 	para evitar el uso de if.
	*/
	
	

	

	
}
