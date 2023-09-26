package tp05.producto;

import java.util.ArrayList;

public class ProductoCooperativa extends Producto
{
	
	public ProductoCooperativa(float costoBruto, int stock)
	{
		super(costoBruto, stock);
		this.descuentos.add( new Descuento("IVA", 10) );
	}
}
