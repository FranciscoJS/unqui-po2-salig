package tp04.supermercado;
import tp04.producto.*;
import java.util.ArrayList;
import java.util.Collection;

public class Supermercado
{
	private String nombre;
	private String direccion;
	private Collection<Producto> listaProductos = new ArrayList<Producto>();
	
	
	Supermercado(String nombre, String direccion)
	{
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	
	public String getDireccion()
	{
		return this.direccion;
	}
	
	
	public int getCantidadDeProductos()
	{
		return listaProductos.size();
	}
	
	
	public void agregarProducto(Producto producto)
	{
		this.listaProductos.add(producto);
	}
	
	
	public double getPrecioTotal()
	{
		double sumaActual = 0;
		for( Producto producto: listaProductos )
		{
			sumaActual = sumaActual + producto.getPrecio();
		}
		return sumaActual;
	}
	
}
