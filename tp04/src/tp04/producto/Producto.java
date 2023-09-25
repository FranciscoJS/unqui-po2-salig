package tp04.producto;

public class Producto
{
	private String nombre;
	protected double precio;
	protected boolean precioCuidado;
	
	
	public Producto(String nombre, double precio, boolean precioCuidado)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}
	
	
	// public Producto() {};
	
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public boolean esPrecioCuidado()
	{
		return this.precioCuidado;
	}

	public double getPrecio()
	{
		return this.precio;
	}
	
	public void aumentarPrecio(double monto)
	{
		this.precio = this.precio + monto;
	}
}
