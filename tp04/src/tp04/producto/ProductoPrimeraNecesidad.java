package tp04.producto;

public class ProductoPrimeraNecesidad extends Producto
{
	
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado)
	{
		super(nombre, precio, precioCuidado);
	}
	
	
	@Override
	public double getPrecio()
	{
		return this.precio * 0.9;
	}
}
