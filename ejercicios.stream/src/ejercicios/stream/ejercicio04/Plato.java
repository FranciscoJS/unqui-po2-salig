package ejercicios.stream.ejercicio04;

public class Plato
{
	private String nombre;
	private double precioBase;
	
	
	Plato(String nombre, double precioBase)
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	public double precioConIva()
	{
		return this.precioBase * 1.21;
	}
	

	
}
