package tp04.producto;

public class ProductoPrimeraNecesidad extends Producto
{
	private float descuentoAplicado;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, float descuentoAplicado)
	{
		super(nombre, precio, precioCuidado);
		this.descuentoAplicado = descuentoAplicado;
	}
	
	
	@Override
	public double getPrecio()
	{
		return this.precio - ( this.precio * this.descuentoAplicado / 100);
	}
}
