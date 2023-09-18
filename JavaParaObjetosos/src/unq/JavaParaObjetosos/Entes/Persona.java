package unq.JavaParaObjetosos.Entes;


public class Persona implements Nombrable
{
	private String nombre;


	public Persona(String nombre)
	{
		// Método constructor: No define qué devuelve y se llama igual a la clase. 
		this.nombre = nombre;
	}
	
	public Persona()
	{
		super();
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
}
